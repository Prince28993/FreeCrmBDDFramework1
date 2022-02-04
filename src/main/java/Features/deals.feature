Feature: Deal data creation

Scenario: Free CRM Login Test scenario

Given user is already on Login Page 
When title of login page is Free CRM
Then user enters email and password
| gagandeepsingh28993@gmail.com | Pp@28993 |

And user clicks on login button
#Then user is on home page 
Then user moves to new deal page
Then user enters deal details
| test deal | 1000 | 50 | 10 |
Then close the browser
