package webTest.seleniumAssignment6;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver;

    @Before
    public void initiate_driver(){
        driver = new SafariDriver();
    }

    @Given("Open the Safari browser")
    public void open_the_Safari_browser() {

    }

    @Given("Maximize the browser window")
    public void maximize_the_browser_window() {
        driver.manage().window().maximize();
    }


    @Given("Set page load timeout to {int} seconds")
    public void set_page_load_timeout_to_seconds(Integer timeout) {
        driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
    }

    @Given("Set implicit timeout to {int} seconds")
    public void set_implicit_timeout_to_seconds(Integer timeout) {
        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    @Given("Delete all cookies")
    public void delete_all_cookies() {
        driver.manage().deleteAllCookies();
    }

    @Then("Navigate to Flipkart site {string}")
    public void navigate_to_Flipkart_site(String url) {
        driver.get(url);
    }

    @Then("Close the popup window")
    public void close_the_popup_window() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        By item = By.className("_2QfC02");
        wait.until(ExpectedConditions.presenceOfElementLocated(item));

        WebElement closeButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        closeButton.click();
        Thread.sleep(1000);

    }

    @Then("Click Login button on navigation bar")
    public void click_Login_button_on_navigation_bar() {
        String loginButtonXPath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a";
        WebElement loginButton = driver.findElement(By.xpath(loginButtonXPath));
        loginButton.click();
    }


    @Then("Provide email {string}")
    public void provide_email(String email) {
        String emailBoxXPath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input";
        WebElement emailBox = driver.findElement(By.xpath(emailBoxXPath));
        emailBox.sendKeys(email);
    }

    @Then("Provide password {string}")
    public void provide_password(String password) throws InterruptedException {
        String passwordBoxXPath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input";
        WebElement passwordBox = driver.findElement(By.xpath(passwordBoxXPath));
        passwordBox.sendKeys(password);
        Thread.sleep(2000);
    }

    @Then("Click Login button to confirm credentials")
    public void click_Login_button_to_confirm_credentials() {
        String loginButtonXPath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button";
        WebElement loginButton = driver.findElement(By.xpath(loginButtonXPath));
        loginButton.click();
    }
}
