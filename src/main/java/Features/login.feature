Feature: Free CRM Login Feature

#without example keyword
#Scenario: Free CRM Login Test Scenario
#
#Given User is already on Login Page 
#When title of login page is Free CRM
#Then user enters "Gagank" and "test@123"
#And user Clicks on login button
##Then user is on home page 


#with examles keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page 
When title of login page is Free CRM
Then user enters "<email>" and "<password>"
And user Clicks on login button
#Then user is on home page 

Examples:

   | email   | password |
   | gagan | test@123 |
   |  tom    |  test456 |