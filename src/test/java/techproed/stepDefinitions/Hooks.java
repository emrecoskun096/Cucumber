package techproed.stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;


public class Hooks {
    /*
        Scenario'lar arasındaki bağlantıyı sağlayan glue parametresine koyduğumuz stepDefinition package'ı içerisinde
    @Before ve @After gibi bir notasyon varsa extend yapmamıza gerek kalmadan her scenariodan önce veya sonra bu
    methodlar çalışacaktır.
        Cucumber'da @Before, @After kullanma ihtiyacımız olursa bunu Hooks class'ına koyarız.
        İstersek yeni bir package oluşturup bunun içinede Hooks class'ını koyabiliriz. Eğer yeni bir package içerisine
    koyarsak Runner class'ındaki glue parametresine bu package'ı da eklememiz gerekir
        Kullandığımız @Before @After notasyonları Junit'ten değil Cucumberdan olmalıdır
     */

    @Before//import io.cucumber.java.Before;
    public void setUp1() {
        System.out.println("Testler çalışmaya başladı");
    }

    @Before("@gr1")
    public void setUp2() {
        System.out.println("Amazonda SQL Aratıldı");
    }

    @Before("@gr2")
    public void setUp3() {
        System.out.println("Amazonda Java Aratıldı");
    }

    @Before("@gr3")
    public void setUp4() {
        System.out.println("Amazonda Selenium Aratildı");
    }

    @Before("@Excel")
    public void setUp5() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        ExcelUtils excelUtils = new ExcelUtils("src/test/resources/mysmoketestdata.xlsx", "customer_info");
        for (int i = 1; i <= excelUtils.rowCount(); i++) {
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);
            blueRentalPage.loginButton.click();
            ReusableMethods.bekle(2);
            blueRentalPage.emailBox.sendKeys(email, Keys.TAB, password, Keys.ENTER);
            ReusableMethods.bekle(2);
            blueRentalPage.userDropDown.click();
            ReusableMethods.bekle(2);
            blueRentalPage.profile.click();
            ReusableMethods.bekle(2);
            Assert.assertEquals(blueRentalPage.verifyEmail.getText(), email);
            ReusableMethods.bekle(2);
            blueRentalPage.userDropDown.click();
            ReusableMethods.bekle(2);
            blueRentalPage.logOut.click();
            ReusableMethods.bekle(2);
            blueRentalPage.OK.click();
        }
    }

    @After//import io.cucumber.java.After;
    public void tearDown(Scenario scenario) {//Bu methoda Scenario class'ından bir parametre ataması yapılır
        //Bu method'u fail olan scenario'larımızın resmini almak için kullanırız
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/jpeg", "screenShot_" + scenario.getName());
        }
        Driver.closeDriver();
    }
}