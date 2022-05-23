Feature: Selenium Assignment – 1

  @SeleniumAssignment1
  Scenario: Selenium Assignment – 1
    Given Open the Safari browser
    And Maximize the browser window
    When Navigate to "http://qatechhub.com"
    Then Write a method to print PASS if the title of the page matches with "QA Automation Tools Trainings and Tutorials | QA Tech Hub"
    When Navigate to "https://www.facebook.com"
    Then Write a method to print PASS if the title of the page matches with "Facebook – zaloguj się lub zarejestruj"
    When Navigate back
    Then URL is "https://qatechhub.com/"
    Then Navigate forward
    Then URL is "https://www.facebook.com/"
    Then Reload page
