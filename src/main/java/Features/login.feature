Feature: Flipkart Test cases

#Scenario: Flipkart login test
#
#Given User is on login page
#When Title is login page is flipkart login
#Then user enters "ankitpatel9429@gmail.com" and "Erpa_1992"
#Then user clicks on login button
#Then user redirected to home page
#Then close the Chrome browser

Scenario Outline:: Flipkart login test

Given User is on login page
When Title is login page is flipkart login
Then user enters "<uname>" and "<psd>"
Then user clicks on login button
Then user redirected to home page
Then close the browser

Examples:

|	uname				  |	psd		    |
|ankitpatel9429@gmail.com| Erpa_1992|
|ankitpatel9429			 |Erpa_1992	      |



