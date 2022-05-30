Feature: Selenium Assignment – 2

  @SeleniumAssignment2
  Scenario: Selenium Assignment – 2
    Given Open the Safari browser
    And Maximize the browser window
    When Navigate to "http://www.fb.com"
    When Delete all cookies
    Then Verify that the page is redirected to "https://www.facebook.com/" by getting the current URL
    When Sign in with email "testemail12345selenium@gmail.com" and password "testpassword1234567890"
    When Wait till error box is loaded

