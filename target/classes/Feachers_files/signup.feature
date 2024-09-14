Feature: Salesforce SignUp Functionality
@smoketest
Scenario: To verify sign up by entering partial data

Given I inialize the browser 
When I enters the url
Given I click on Try for free button 
Then I verify sign up page is displyed
When I enter the name "Amit"
And I enter the surname "Devkar"
And I enter the email address "amitdevkar@gmail.com"
And I select the employee from dropdown
And I click on sign up button
Then I validate that the error messege should be displyed

