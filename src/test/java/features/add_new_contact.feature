Feature: Add new account
	As a valid user I want a add contact page that allows me to enter a new unique account
	
#Scenario: Valid user should be able to add account
#Given a valid user with username "techfiosdemo@gmail.com" and password "abc123"
#When user naviagtes to CRM --> Add Account
#Then Add contact page should display
#When user adds new contact
#Then success message should appear


Scenario Outline: Valid user should be able to add account
Given a valid user with username "<userName>" and password "<password>"
When user naviagtes to CRM --> Add Account
Then Add contact page should display
When user adds new contact with name "<name>" companyName "<companyName>" and email "<email>"
Then success message should appear
And contact should be displayed on the list contact page
Examples:
|userName              |password|name|companyName|email           |
|techfiosdemo@gmail.com|abc123  |Tony|teamworks  |random@gmail.com|

#Scenario: Valid user should be able to add account
#Given a valid user with username
#When user naviagtes to CRM --> Add Account
#Then Add contact page should display
#When user adds new contact
#Then success message should appear
