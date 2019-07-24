#Author: your.email@your.domain.com
Feature: To test the Add Tariff Plan Functionality
@tag2
Scenario Outline: To verify the success message 
Given the user is in Add Tariff Plan Page
When the user fills the valid tariff plan details "<monthRent>","<freeLocal>","<freeSMS>","<localCharges>","<interCharges>","<smsCharges>"
And the user clicks the button
Then the user shoould see the success message

Examples:
|monthRent|freeLocal|freeIntMin	|freeSMS		 |localCharges|interCharges|smsCharges|
|500			|300			|			100		|400				 |200					|100			 	 |244       |
|502			|301			|			103		|405				 |204					|106				 |855       |