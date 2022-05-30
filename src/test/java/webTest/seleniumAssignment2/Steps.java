package webTest.seleniumAssignment2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @When("Delete all cookies")
    public void delete_all_cookies() {
        driver.manage().deleteAllCookies();
    }

    @When("Sign in with email {string} and password {string}")
    public void sign_in_with_email_and_password(String email, String password) {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("pass")).sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        loginButton.sendKeys(Keys.RETURN);
    }

    @When("Wait till error box is loaded")
    public void wait_till_error_box_is_loaded() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        By item = By.id("error_box");
        wait.until(ExpectedConditions.presenceOfElementLocated(item));
    }

    @Then("Verify that the page is redirected to {string} by getting the current URL")
    public void verify_that_the_page_is_redirected_to_by_getting_the_current_URL(String expectedUrl) {
       String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);
    }

    @After
    public void close_driver(){
        driver.close();
    }

}
