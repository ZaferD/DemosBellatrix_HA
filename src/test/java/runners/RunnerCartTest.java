package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/FeatureCartTest.feature"},
        glue = {"stepdefs"},
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json"
        }

)

public class RunnerCartTest {


}