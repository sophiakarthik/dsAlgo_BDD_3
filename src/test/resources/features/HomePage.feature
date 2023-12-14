@tag

Feature: Testing home page

@tag2
  Scenario: home page
  Given The user opens Home Page
  When The user clicks Data Structures drop down
  Then user should see  panes with different data strucures and different entries
  And The user selects any data structures item from the drop down without Sign in
  Then  It should through error message
  
@tag2
Scenario: sign in validation
Given The user opens Home Page
When The user clicks "Sign in"
Then The user should be redirected to Sign in page

@tag3
Scenario: Register form validation
Given The user opens Home Page
When The user clicks Register button
Then The user should be redirected to Register form