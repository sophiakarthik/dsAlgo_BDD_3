Feature: Array Page Feature

Background:
Given User is logged in to the application
|username||password|
|SirishaSA||Success4you!|

Scenario: Array Page
Given User is on Home Page
When User Clicks on the Get Started button under Array Section
Then Array Page opens up



When User clicks on "Arrays in Python" button
Then User should be redirected to "Arrays in Python" page


When User gets Array Section
|Arrays in Python|
|Arrays Using List|
|Basic Operations in Lists|
|Applications of Array|
|Practice Questions|
And Array Section count should be 5


When User clicks on Try Here button
Then User should be redirected to next page

When User enters the text in the TextBox "print(Hello)"
And Clicks on the Run button
Then Result is displayed on the console







