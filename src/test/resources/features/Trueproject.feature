Feature: feature to open dsago url and get started

  Scenario: validate dsalgo url
    Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter credentials username as "SirishaSA"
    And user left password box empty "Success4you!"
    And user click login button
    Then it should display message
