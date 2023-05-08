package techproed.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechproPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TechproStepDefinition {
    TechproPage techproPage;
    @Given("kullanici_techpro_sayfasina_gider")
    public void kullanici_techpro_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproed_Url"));
    }

    @And("arama_kutusunda_QA_aratir")
    public void arama_kutusunda_qa_aratir() {
        techproPage=new TechproPage();
        techproPage.searchBox.sendKeys("qa", Keys.ENTER);

    }

    @And("sayfa_basliginin_qa_icerdigini_test_eder")
    public void sayfa_basliginin_qa_icerdigini_test_eder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("qa"));
    }

    @Then("cikan_reklam_kapatilir")
    public void cikan_reklam_kapatilir() {
        techproPage=new TechproPage();
        techproPage.reklam.click();
    }
}