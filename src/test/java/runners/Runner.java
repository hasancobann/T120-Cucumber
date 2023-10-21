package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                 "junit:target/xml-report/cucumber.xml"}, // raporlama için yazılır
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@excel", // çalıştırmak istediğimiz senaryo tagını yazariz

        dryRun = false


)
public class Runner {

    /*
    Runner class'ı boş bir class'dır.
    Bu class da asıl işi class'da kulandığımız 2 notasyon yapar.

    dryRun = true seçildiğinde runner istenen feature veya senaryoyu
    çalıştırmaya değil eksik adımlarını bulmaya odaklanır.
    Eğer eksik adım yoksa test PASSED der ama bu testin çalışıp tüm adımların geçtiğini göstermez.
    Sadece eksik adım olmadığını gösterir.

    Eğer eksik adım bulma niyetimiz yoksa testlerimizi normal olrak çalıştırmka istiyorsak
    dryRun = false seçilmelidir.
     */
}
