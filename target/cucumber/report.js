$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createCreditApplication.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Sedhu Madhavan"
    }
  ],
  "line": 3,
  "name": "Verify Create Credit Application for Auto Gravity",
  "description": "",
  "id": "verify-create-credit-application-for-auto-gravity",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@CreateCredit"
    }
  ]
});
formatter.before({
  "duration": 1071292,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify creating a new application for BMW with Valid Details",
  "description": "",
  "id": "verify-create-credit-application-for-auto-gravity;verify-creating-a-new-application-for-bmw-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User launches an \"IE\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "navigates to the HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects \"BMW\" car Make and \"2 Series\" Model",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters zipcode \"91381\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects the first model and reviews the details in ReviewDetails screen",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the presence of all fields in Search For Financing screen",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "IE",
      "offset": 18
    }
  ],
  "location": "demo_CreateCredit.user_launches_an_browser(String)"
});
formatter.write("Browser is Launched");
formatter.result({
  "duration": 5365905365,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.navigates_to_the_HomePage()"
});
formatter.result({
  "duration": 2720917819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 14
    },
    {
      "val": "2 Series",
      "offset": 33
    }
  ],
  "location": "demo_CreateCredit.clickOnMake(String,String)"
});
formatter.result({
  "duration": 7577607890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "91381",
      "offset": 21
    }
  ],
  "location": "demo_CreateCredit.enterZipcode(String)"
});
formatter.result({
  "duration": 4050235688,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.selectModel_ChooseACar()"
});
formatter.result({
  "duration": 8774720784,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.verifyPresenceOfFiends()"
});
formatter.result({
  "duration": 822829502,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.closeBrwoser()"
});
formatter.result({
  "duration": 633338935,
  "status": "passed"
});
formatter.after({
  "duration": 216559,
  "status": "passed"
});
formatter.before({
  "duration": 110540,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify creating a new application for Audi with Valid Details",
  "description": "",
  "id": "verify-create-credit-application-for-auto-gravity;verify-creating-a-new-application-for-audi-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User launches an \"IE\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "navigates to the HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user selects \"Audi\" car Make and \"A4\" Model",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user enters zipcode \"91381\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user selects the first model and reviews the details in ReviewDetails screen",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify the presence of all fields in Search For Financing screen",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "IE",
      "offset": 18
    }
  ],
  "location": "demo_CreateCredit.user_launches_an_browser(String)"
});
formatter.write("Browser is Launched");
formatter.result({
  "duration": 4117628084,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.navigates_to_the_HomePage()"
});
formatter.result({
  "duration": 3070155072,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 14
    },
    {
      "val": "A4",
      "offset": 34
    }
  ],
  "location": "demo_CreateCredit.clickOnMake(String,String)"
});
formatter.result({
  "duration": 7589823173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "91381",
      "offset": 21
    }
  ],
  "location": "demo_CreateCredit.enterZipcode(String)"
});
formatter.result({
  "duration": 4128682902,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.selectModel_ChooseACar()"
});
formatter.result({
  "duration": 21024258796,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.verifyPresenceOfFiends()"
});
formatter.result({
  "duration": 767791284,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.closeBrwoser()"
});
formatter.result({
  "duration": 632238878,
  "status": "passed"
});
formatter.after({
  "duration": 124100,
  "status": "passed"
});
formatter.before({
  "duration": 126567,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Verify creating a new application for Toyota with Valid Details",
  "description": "",
  "id": "verify-create-credit-application-for-auto-gravity;verify-creating-a-new-application-for-toyota-with-valid-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User launches an \"IE\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "navigates to the HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user selects \"Toyota\" car Make and \"Yaris\" Model",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user enters zipcode \"90007\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user selects the first model and reviews the details in ReviewDetails screen",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Verify the presence of all fields in Search For Financing screen",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "IE",
      "offset": 18
    }
  ],
  "location": "demo_CreateCredit.user_launches_an_browser(String)"
});
formatter.write("Browser is Launched");
formatter.result({
  "duration": 4094800553,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.navigates_to_the_HomePage()"
});
formatter.result({
  "duration": 2692740812,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Toyota",
      "offset": 14
    },
    {
      "val": "Yaris",
      "offset": 36
    }
  ],
  "location": "demo_CreateCredit.clickOnMake(String,String)"
});
formatter.result({
  "duration": 7948312088,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "90007",
      "offset": 21
    }
  ],
  "location": "demo_CreateCredit.enterZipcode(String)"
});
formatter.result({
  "duration": 3938156793,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.selectModel_ChooseACar()"
});
formatter.result({
  "duration": 8348926591,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.verifyPresenceOfFiends()"
});
formatter.result({
  "duration": 790313904,
  "status": "passed"
});
formatter.match({
  "location": "demo_CreateCredit.closeBrwoser()"
});
formatter.result({
  "duration": 627829197,
  "status": "passed"
});
formatter.after({
  "duration": 71091,
  "status": "passed"
});
});