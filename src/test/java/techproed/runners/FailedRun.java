package techproed.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:src/test/resources/features/htmlReport/cucumberHooks.html",
        "json:src/test/resources/features/htmlReport/cucumber.json",
        "junit:src/test/resources/features/htmlReport/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepDefinitions"},
        dryRun = false,
        monochrome = true
)
/*
    rerun plugin kullanımında plugin parametresinin içine txt dosyamısın yolunu belirtiriz.
 feature parametresinin içinede aynı yolu kopyalarız ve başına @ işareti koymalıyız.
 feature parametresi ile direk dosyayı gördüğü için bu class'da tags parametresine gerek yoktur.
 Böylelikle fail olan senaryolarımızın ismi ve satır numarası txt dosyamızın içine kaydedilir.
 Ve FailedRun class'ından run yaptığımız zaman txt dosyamızın içindeki fail olan scenariyolar
 tekrar çalışacaktır. Fail olan scenariyolarımızdaki hata düzeltildikten sonra txt dosyasının
 içindeki bilgiler silinir.

 */
public class FailedRun {
}