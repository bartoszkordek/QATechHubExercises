package webTest.seleniumAssignment2;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources",
        glue = {"webTest.seleniumAssignment2"},
        tags = "@SeleniumAssignment2"
)
public class TestRunner {
}
