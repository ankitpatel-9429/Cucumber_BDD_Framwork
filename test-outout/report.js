$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/Java/Selenium_WorkSpace/BDD_CucumberFramework/src/main/java/Features/DataTable_Map.feature");
formatter.feature({
  "line": 1,
  "name": "Datable using map",
  "description": "",
  "id": "datable-using-map",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Submit contact info using data table and Maps",
  "description": "",
  "id": "datable-using-map;submit-contact-info-using-data-table-and-maps",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "a user on contact page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "a Check the page title",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "a Enter contact informations",
  "rows": [
    {
      "cells": [
        "cat",
        "subject",
        "message",
        "name",
        "email",
        "phono"
      ],
      "line": 9
    },
    {
      "cells": [
        "1",
        "Sub1",
        "Message 1",
        "Name 1",
        "abc@gmail.com",
        "1234567893"
      ],
      "line": 10
    },
    {
      "cells": [
        "2",
        "Sub2",
        "Message 2",
        "Name 2",
        "abc2@gmail.com",
        "1234567893"
      ],
      "line": 11
    },
    {
      "cells": [
        "3",
        "Sub3",
        "Message 3",
        "Name 3",
        "abc3@gmail.com",
        "1234567893"
      ],
      "line": 12
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "a close the contact page browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableMapStepDefinition.user_on_contact_page()"
});
formatter.result({
  "duration": 14910365000,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.check_the_page_title()"
});
formatter.result({
  "duration": 15924900,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.enter_contact_informations(DataTable)"
});
formatter.result({
  "duration": 31122490700,
  "status": "passed"
});
formatter.match({
  "location": "DataTableMapStepDefinition.close_the_contact_page_browser()"
});
formatter.result({
  "duration": 819161600,
  "status": "passed"
});
});