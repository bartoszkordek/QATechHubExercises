package webTest.seleniumAssignment1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources",
        glue = {"webTest.seleniumAssignment1"},
        tags = "@SeleniumAssignment1"
)
public class TestRunner {
}
