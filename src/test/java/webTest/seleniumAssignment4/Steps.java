package webTest.seleniumAssignment4;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
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

    @When("Browse to {string} website")
    public void browse_to_website(String url) {
        driver.get(url);
    }

    @When("Enter a product in the search box on the homepage say {string}")
    public void enter_a_product_in_the_search_box_on_the_homepage_say(String searchText) {
        WebElement searchBar = driver.findElement(By.id("gh-ac"));
        searchBar.sendKeys(searchText);
    }

    @When("From categories dropdown, select category of your product say {string}")
    public void from_categories_dropdown_select_category_of_your_product_say(String category) {
        WebElement categoryDropDown = driver.findElement(By.id("gh-cat"));
        Select selectCategory = new Select(categoryDropDown);
        selectCategory.selectByVisibleText(category);
    }

    @When("Click the Search button")
    public void click_the_Search_button() {
        WebElement submitButton = driver.findElement(By.id("gh-btn"));
        submitButton.sendKeys(Keys.RETURN);
    }

    @Then("Write a method to print the result of the product")
    public void write_a_method_to_print_the_result_of_the_product() throws InterruptedException {

        driver.switchTo().parentFrame();
        Thread.sleep(10000);

        List<WebElement> productList = driver.findElements(By.xpath("//*[@id='srp-river-results']/ul/li"));

        int counter = 0;
        for (WebElement product : productList){
            if(counter > 0 && counter < 60)
                System.out.println(product.findElement(By.xpath("div/div[1]/div/a/div/img")).getAttribute("alt"));

            counter++;
        }

    }

    @After
    public void close_driver(){
        driver.close();
    }

}
