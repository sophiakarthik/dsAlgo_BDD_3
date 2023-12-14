Feature: Home Page Feature

#Background:
#Given User is logged in to the application
#|username||password|
#|SirishaSA||Success4you!|

Scenario: Home Page
  Given Browser is open
  When user clicks on get started
  When The user clicks Data Structures drop down
  Then Then user should see  panes with different data strucures and different entries
  When user selects Array from Dropdown
  Then Respective Page opens up
  Then It should through error message 
  
  Given The user clicks Data Structures drop down
  Then Then user should see  panes with different data strucures and different entries
  When user selects Linked List from Dropdown
  Then Respective Page opens up
  Then It should through error message
  
  Given The user clicks Data Structures drop down
  Then Then user should see  panes with different data strucures and different entries
  When user selects Stack from Dropdown
  Then Respective Page opens up
  Then It should through error message
  
  Given The user clicks Data Structures drop down
  Then Then user should see  panes with different data strucures and different entries
  When user selects Queue from Dropdown
  Then Respective Page opens up
  Then It should through error message
  
  Given The user clicks Data Structures drop down
  Then Then user should see  panes with different data strucures and different entries
  When user selects Tree from Dropdown
  Then Respective Page opens up
  Then It should through error message
  
  Given The user clicks Data Structures drop down
  Then Then user should see  panes with different data strucures and different entries
  When user selects Graph from Dropdown
  Then Respective Page opens up
  Then It should through error message
  
@tag2
Scenario: sign in validation
  Given Browser is open
  When user clicks on get started
  When when user enters signin button
  Then The user should be redirected to Sign in page

@tag3
Scenario: Register form validation
  Given Browser is open
  When user clicks on get started
  When The user clicks Register button
  Then The user should be redirected to Register form