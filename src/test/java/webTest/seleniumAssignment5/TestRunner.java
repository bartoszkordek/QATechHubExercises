package webTest.seleniumAssignment5;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources",
        glue = {"webTest.seleniumAssignment5"},
        tags = "@SeleniumAssignment5"
)
public class TestRunner {
}
