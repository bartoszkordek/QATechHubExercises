package webTest.seleniumAssignment1;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Steps {

    WebDriver driver;

    @Before
    public void initiate_driver(){
        driver = new SafariDriver();
    }

    @Given("Open the Safari browser")
    public void open_the_Safari_browser() {
        driver.manage().window().maximize();
    }

    @Given("Maximize the browser window")
    public void maximize_the_browser_window() {
        driver.manage().window().maximize();
    }

    @When("Navigate to \"([^\"]*)\"$")
    public void navigate_to(String url) {
        driver.navigate().to(url);
    }

    @When("Navigate back")
    public void navigate_back() {
        driver.navigate().back();
    }

    @Then("Write a method to print PASS if the title of the page matches with {string}")
    public void write_a_method_to_print_PASS_if_the_title_of_the_page_matches_with(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("Navigate forward")
    public void navigate_forward() {
        driver.navigate().forward();
    }

    @When("Reload page")
    public void reload_page() {
        driver.navigate().refresh();
    }

    @Then("URL is {string}")
    public void url_is(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @After
    public void close_driver(){
        if(driver!=null) driver.close();
    }
}
