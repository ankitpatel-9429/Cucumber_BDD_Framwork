$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Java/Selenium_WorkSpace/BDD_CucumberFramework/src/main/java/Features/TestDataTable.feature");
formatter.feature({
  "line": 1,
  "name": "Test Data Table",
  "description": "",
  "id": "test-data-table",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Enter test data on contact Page",
  "description": "",
  "id": "test-data-table;enter-test-data-on-contact-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user on contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Check the page title",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Enter contact informations",
  "rows": [
    {
      "cells": [
        "1",
        "Sub1",
        "Message 1",
        "Name 1",
        "abc@gmail.com",
        "1234567893"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "confirm the submit message",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the contact page browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableStepDefination.user_on_contact_page()"
});
formatter.result({
  "duration": 13115653400,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefination.check_the_page_title()"
});
formatter.result({
  "duration": 15398000,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefination.enter_contact_informations(DataTable)"
});
formatter.result({
  "duration": 1141346900,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefination.user_click_on_submit_button()"
});
formatter.result({
  "duration": 11258651800,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefination.confirm_the_submit_message()"
});
formatter.result({
  "duration": 51325100,
  "status": "passed"
});
formatter.match({
  "location": "DataTableStepDefination.close_the_contact_page_browser()"
});
formatter.result({
  "duration": 809621400,
  "status": "passed"
});
});