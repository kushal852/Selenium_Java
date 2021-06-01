Feature: Application login

Scenario: Home page default login

Given User is on landing page
When User login into application with username "Kushal" and password "123456"
Then Home page is populated
And cards displayed is "true"


Scenario: Home page default login
Given User is on landing page
When User login into application with username "akhil" and password "123"
Then Home page is populated
And cards displayed is "false"