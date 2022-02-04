@FunctionalTest
Feature: Free CRM Application testing

@SmokeTest  @RegressionTest
Scenario: Login with correct username and correct password
Given This is a  valid login test

@RegressionTest
Scenario: Login with incorrect username and password
Given This is a invalid login test 

@SmokeTest
Scenario: Create a contact
Given This is a contact test case 

@SmokeTest  @RegressionTest
Scenario: Create a deal
Given This is a deal test case 

@SmokeTest
Scenario: Create a tasks
Given This is a case test case 

@SmokeTest  @RegressionTest
Scenario: verify left panel links
Given clicking on left panel links

@RegressionTest
Scenario: Search a deal
Given This is a search deal test case 

@SmokeTest
Scenario: Search a contact
Given This is a search contact test case

@RegressionTest
Scenario: Search a case
Given This is a search case test case

@End2End
Scenario: Search a task
Given This is a search task test case

@SmokeTest
Scenario: Search a call
Given This is a search call test case

@SmokeTest
Scenario: Search a email
Given This is a search email test case

@RegressionTest
Scenario: Search a docs
Given This is a search docs test case

@SmokeTest
Scenario: Search a forms
Given This is a search forms test case

@End2End
Scenario: validate  a report
Given This is a report  test case

@End2End
Scenario: Application logout
Given This is a logout test case