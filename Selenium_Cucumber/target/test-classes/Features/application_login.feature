Feature: Application_login

Scenario: Positive test validating login

Given Initialize the browser with chrome
And navigate to "http://www.qaclickacademy.com/" site
When click on popup if available
When validate the featured courses with "FEATURED COURSES" value
And  Validate the "contact" link is displayed in the home page
And Click on link on home page to land on secure sign page
When User enters "Username" and "Password" and logs in
Then Verify that user successfully logged in
And close all browsers