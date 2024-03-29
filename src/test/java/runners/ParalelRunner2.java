package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"}, // raporlama için yazılır
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip4", // çalıştırmak istediğimiz senaryo tagını yazariz

        dryRun = false

)

public class ParalelRunner2 {
}
