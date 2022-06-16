Feature: Selenium Assignment – 5 - Login to Snapdeal

  @SeleniumAssignment5
  Scenario: Login to Snapdeal
    Given Open the Safari browser
    And Maximize the browser window
    And Set page load timeout to 90 seconds
    And Set implicit timeout to 6 seconds
    And Delete all cookies
    Then Navigate to Snapdeal site "http://www.snapdeal.com"