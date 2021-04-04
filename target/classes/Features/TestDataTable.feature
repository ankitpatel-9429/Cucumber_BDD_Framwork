Feature: Test Data Table 

Scenario: Enter test data on contact Page

Given user on contact page
When Check the page title
Then Enter contact informations
| 1 | Sub1	| Message 1 | Name 1|abc@gmail.com | 1234567893|

Then user click on submit button
Then confirm the submit message
Then close the contact page browser

