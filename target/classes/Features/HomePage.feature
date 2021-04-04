Feature: Flipkart Home page test

Scenario Outline::

Given User is on login page
When Title is login page is flipkart login
Then user enters "<uname>" and "<psd>"
Then user clicks on login button
Then user redirected to home page
Then verify username
Then verify more manue options
Then close the browser

Examples:

|	uname				 |	psd		|
|patel_ankit20@yahoo.com|Erpa_1992|