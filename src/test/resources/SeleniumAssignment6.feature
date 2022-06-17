Feature: Selenium Assignment – 6 - Flipkart Login

  @SeleniumAssignment6
  Scenario: Flipkart Login
    Given Open the Safari browser
    And Maximize the browser window
    And Set page load timeout to 90 seconds
    And Set implicit timeout to 6 seconds
    And Delete all cookies
    Then Navigate to Flipkart site "http://www.flipkart.com"
    And Close the popup window
    And Click Login button on navigation bar
    And Provide email "test@test.com"
    And Provide password "samplePassword"
    And Click Login button to confirm credentials