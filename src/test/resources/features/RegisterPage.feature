@tag
Feature: dsAlgoProject_Register
  I want to use this template for my feature file

 @tag1
  Scenario: Register
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error "Please fill out this field" below Username textbox

  
  @tag2
  Scenario: Check register is not successful with just username credentials entered
    Given The user opens Register Page
    When User enters Username "SirishaS"
    And User leaves the password textbox blank
    And User clicks on the Register button
    Then It should display an error "Please fill out this field" below password textbox
    
    @tag3
    Scenario: Check register is not successful with Username and password credentials entered
      Given The user opens Register Page
      When User enters Username "SirishaS"
      And User enters the password "Success4you!"
      And  leaves the password confirmation textbox blank
      And User Clicks on the Register button
      Then It should display an error "Please fill out this field" below password confirmation textbox
      
       @tag4
    Scenario: Check register is not successful with mismatch password and password confirmation credentials entered
      Given The user opens Register Page
      When User enters Username "SirishaS"
      And User enters the password "Success4you!"
      And enters differnt value in the password confirmation textbox "Successnot4you" 
      And User Clicks on the Register button
      Then It should display an error "password mismatch"
      
      @tag5
      Scenario: User enters valid Username,Password and Password Confirmation and clicks on the register button then account should be created
      Given The user opens Register Page
      When User enters Username "SirishaSA"
      And User enters the password "Success4you!"
      And enters differnt value in the password confirmation textbox "Success4you!" 
      And User Clicks on the Register button
      And Account should be created with the specified username and password
      Then User should be logged in with the specified username
      
      
    
 