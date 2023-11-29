Feature: Array Page Feature

Background:
User has already logged in to the application
|username||password|
|SirishaSA||Success4you!|

Scenario: Array Page
Given User is logged in to the application
When User Clicks on the Get Started button under Array Section
Then Array Page opens up


Scenario:  The user is in the Array page after logged in
Given Array Page opens up
When User clicks on "Arrays in Python" button
Then User should be redirected to "Arrays in Python" page

Scenario: Array PAge Count
Given User is on ArrayPage
When User gets Array Section
|Arrays in Python|
|Arrays Using List|
|Basic Operations in Lists|
|Applications of Array|
|Practice Questions|
And Array Section count should be 5




