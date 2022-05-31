package webTest.seleniumAssignment3;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources",
        glue = {"webTest.seleniumAssignment3"},
        tags = "@SeleniumAssignment3"
)
public class TestRunner {
}
