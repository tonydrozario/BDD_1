Feature: Login Page
	As a user I want a login page that only authentic user can have access
	
Scenario: Valid user should be able to login 
Given a valid user
When user goes to TechFios site
Then techfios site should display
When user provides valid credentials
Then dashboard should display
And username should match