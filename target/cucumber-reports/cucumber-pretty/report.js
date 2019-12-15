$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/HomeWorks.feature");
formatter.feature({
  "line": 1,
  "name": "Tek School Scenarios",
  "description": "",
  "id": "tek-school-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 29,
  "name": "User should be able to log out after log in",
  "description": "",
  "id": "tek-school-scenarios;user-should-be-able-to-log-out-after-log-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 28,
      "name": "@SDET_004"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User clicks Logs In with info",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User should be logged out",
  "rows": [
    {
      "comments": [
        {
          "line": 33,
          "value": "#And the follwoing message should display:You have been logged off your account. It is now safe to leave the computer"
        }
      ],
      "cells": [
        "teststudent@gmail.com",
        "Tek@Test.com"
      ],
      "line": 35
    }
  ],
  "keyword": "Then "
});
});