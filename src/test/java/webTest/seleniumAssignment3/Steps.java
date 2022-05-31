package webTest.seleniumAssignment3;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

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


    @When("Navigate to {string} website")
    public void navigate_to_website(String url) {
        driver.get(url);
    }

    @Then("Write a method to find the count \\(number of) links on the homepage of Flipkart")
    public void write_a_method_to_find_the_count_number_of_links_on_the_homepage_of_Flipkart() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
    }

    @Then("Write another method to print link text and URLs of all the links on the page of Flipkart.")
    public void write_another_method_to_print_link_text_and_URLs_of_all_the_links_on_the_page_of_Flipkart() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement element : links) System.out.println(element.getText() + " " + element.getAttribute("href"));
    }

    @After
    public void close_driver(){
        driver.close();
    }
}
