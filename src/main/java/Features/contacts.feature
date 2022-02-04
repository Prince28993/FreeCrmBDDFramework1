Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario  

Given User is already on Login Page 
When title of login page is Free CRM
Then user enters "<email>" and "<password>"
And user Clicks on login button
#Then user is on home page 
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>" 
Then Close the browser

Examples:
 	| email  | password  | firstname | lastname | position |
 	| gagank |  test@123 | Tom       | peter    | manager  |
 	| gagank | test@123  | David     | dasuza   | director |