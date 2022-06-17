package webTest.seleniumAssignment6;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources",
        glue = {"webTest.seleniumAssignment6"},
        tags = "@SeleniumAssignment6"
)
public class TestRunner {
}
