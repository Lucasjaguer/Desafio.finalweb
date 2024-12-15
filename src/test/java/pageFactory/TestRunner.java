package pageFactory;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "pageFactory.steps",
        tags = "@test",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        plugin = {
                "pretty",
                "html:reports/cucumber.html",
                "json:reports/cucumber.json",
                "junit:reports/cucumber.xml"
        }
)

public class TestRunner {

}
