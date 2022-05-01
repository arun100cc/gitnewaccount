Feature: To validate login functionality of facebook application
 
Scenario: To validate login by using valid usernamr and invalid password

Given User have to enter facebook login through chrome browser
When User have to enter valid email and invalid password
And User have to click login button

Then User have to show credetials page