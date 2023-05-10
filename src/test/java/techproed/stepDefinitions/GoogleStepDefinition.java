package techproed.stepDefinitions;


import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class GoogleStepDefinition {
    GooglePage googlePage;
    @Given("kullanici googleda {string} aratir")
    public void kullanici_googleda_aratir(String string) {
        googlePage=new GooglePage();
        googlePage.aramaKutusu.sendKeys(string, Keys.ENTER);
    }

    @Given("basligin {string} icerdigini dogrular")
    public void basligin_icerdigini_dogrular(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
    @Given("kullanici googleda {string} aratacaktir")
    public void kullanici_googleda_aratacaktir(String string) {
        googlePage=new GooglePage();
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(string), Keys.ENTER);
    }

    @Given("basligin {string} icerdigini dogrulayacaktir")
    public void basligin_icerdigini_dogrulayacaktir(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(string)));
    }

}