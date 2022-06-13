Feature: Selenium Assignment – 4

  @SeleniumAssignment4
  Scenario: Selenium Assignment – 4
    Given Open the Safari browser
    And Maximize the browser window
    And Set page load timeout to 90 seconds
    And Set implicit timeout to 6 seconds
    And Delete all cookies
    When Browse to "https://www.ebay.pl/" website
    When Enter a product in the search box on the homepage say "Apple Watches"
    When From categories dropdown, select category of your product say "Telefony i Akcesoria"
    When Click the Search button
    When Delete all cookies
    Then Write a method to print the result of the product


