package webTest.seleniumAssignment5;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

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

    @Then("Navigate to Snapdeal site {string}")
    public void navigate_to_Snapdeal_site(String url) {
        driver.get(url);
    }

    @Then("Move to Sign In Button and hold")
    public void move_to_Sign_In_Button_and_hold() throws InterruptedException {
        Thread.sleep(5000);
        String signInButtonXPath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]";
        WebElement signInButton = driver.findElement(By.xpath(signInButtonXPath));
        signInButton.click();
        Thread.sleep(3000);
    }

    @Then("Move to the Login button and click")
    public void move_to_the_Login_button_and_click() throws InterruptedException {
        String loginButtonXPath = "//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a";
        WebElement loginButton = driver.findElement(By.xpath(loginButtonXPath));
        loginButton.click();
        Thread.sleep(3000);
    }


    @Then("Enter valid Email {string} Id and click continue")
    public void enter_valid_Email_Id_and_click_continue(String email) {
        driver.switchTo().frame("loginIframe");
        WebElement emailField = driver.findElement(By.id("userName"));
        emailField.sendKeys(email);

        String continueButtonXPath = "//*[@id=\"checkUser\"]";
        WebElement continueButton = driver.findElement(By.xpath(continueButtonXPath));
        continueButton.click();
    }

    @After
    public void close_driver(){
        driver.close();
    }

}
