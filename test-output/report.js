$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/spdro/eclipse-workspace/techfios_bdd/src/test/java/features/add_new_contact.feature");
formatter.feature({
  "line": 1,
  "name": "Add new account",
  "description": "As a valid user I want a add contact page that allows me to enter a new unique account",
  "id": "add-new-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Valid user should be able to add account"
    },
    {
      "line": 5,
      "value": "#Given a valid user with username \"techfiosdemo@gmail.com\" and password \"abc123\""
    },
    {
      "line": 6,
      "value": "#When user naviagtes to CRM --\u003e Add Account"
    },
    {
      "line": 7,
      "value": "#Then Add contact page should display"
    },
    {
      "line": 8,
      "value": "#When user adds new contact"
    },
    {
      "line": 9,
      "value": "#Then success message should appear"
    }
  ],
  "line": 12,
  "name": "Valid user should be able to add account",
  "description": "",
  "id": "add-new-account;valid-user-should-be-able-to-add-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "a valid user with username \"\u003cuserName\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user naviagtes to CRM --\u003e Add Account",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Add contact page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user adds new contact with name \"\u003cname\u003e\" companyName \"\u003ccompanyName\u003e\" and email \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "success message should appear",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "contact should be displayed on the list contact page",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "add-new-account;valid-user-should-be-able-to-add-account;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "name",
        "companyName",
        "email"
      ],
      "line": 20,
      "id": "add-new-account;valid-user-should-be-able-to-add-account;;1"
    },
    {
      "cells": [
        "techfiosdemo@gmail.com",
        "abc123",
        "Tony",
        "teamworks",
        "random@gmail.com"
      ],
      "line": 21,
      "id": "add-new-account;valid-user-should-be-able-to-add-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5873336900,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Valid user should be able to add account",
  "description": "",
  "id": "add-new-account;valid-user-should-be-able-to-add-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "a valid user with username \"techfiosdemo@gmail.com\" and password \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user naviagtes to CRM --\u003e Add Account",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Add contact page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user adds new contact with name \"Tony\" companyName \"teamworks\" and email \"random@gmail.com\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "success message should appear",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "contact should be displayed on the list contact page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "techfiosdemo@gmail.com",
      "offset": 28
    },
    {
      "val": "abc123",
      "offset": 66
    }
  ],
  "location": "AddNewContactSteps.a_valid_user_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 3474970300,
  "status": "passed"
});
formatter.match({
  "location": "AddNewContactSteps.user_naviagtes_to_CRM_Add_Account()"
});
formatter.result({
  "duration": 6968946200,
  "status": "passed"
});
formatter.match({
  "location": "AddNewContactSteps.add_contact_page_should_display()"
});
formatter.result({
  "duration": 602942500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tony",
      "offset": 33
    },
    {
      "val": "teamworks",
      "offset": 52
    },
    {
      "val": "random@gmail.com",
      "offset": 74
    }
  ],
  "location": "AddNewContactSteps.user_adds_new_contact_with_name_companyName_and_email(String,String,String)"
});
formatter.result({
  "duration": 1650865500,
  "status": "passed"
});
formatter.match({
  "location": "AddNewContactSteps.success_message_should_appear()"
});
formatter.result({
  "duration": 3116287100,
  "status": "passed"
});
formatter.match({
  "location": "AddNewContactSteps.new_contact_should_display()"
});
formatter.result({
  "duration": 7877895300,
  "status": "passed"
});
formatter.after({
  "duration": 1167562400,
  "status": "passed"
});
});