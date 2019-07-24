#Author: your.email@your.domain.com
#Add Customer
Feature: To test the Add Customer Functionality

@us1
Scenario: To test the generate customer ID functionality1
Given the user is in add customer page
When the user fills the valid customer details
|firstName	 |java						|
|lastName		 |selenium				|
|emailAddress|Greens@gmail.com|
|address		 |Chennai					|	
|phNo				 |457678687				|
And the user clicks the submit button
Then the user should see the customer Id Generated

@us2
Scenario: To test the generate customer ID functionality2
Given the user is in add customer page
When the user fills the invalid customer details
|firstName	 |java						|
|lastName		 |selenium				|
|emailAddress|Greensgmail.com |
|address		 |Chennai					|	
|phNo				 |457678687				|
And the user click the submit button
Then the user should see the error message displayed

@us3
Scenario: To test the generate customer ID functionality3
Given the user is in add customer page
When the user missed to fill address customer details
|firstName	 |java						|
|lastName		 |selenium				|
|emailAddress|Greens@gmail.com|
|address		 |								|	
|phNo				 |457678687				|
And the user clk the submit button
Then the user should see the popup message displayed

@us4
Scenario: To test the generate customer ID functionality4
Given the user is in add customer page
When the user fills the valid customer details
|firstName	 |java						|
|lastName		 |selenium				|
|emailAddress|Greens@gmail.com|
|address		 |Chennai					|	
|phNo				 |457678687				|
And the user clicks the reset button
Then the user should see the empty fields