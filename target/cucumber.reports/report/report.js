$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FeatureFiles/VehicleInsuranceCoverCheck.feature");
formatter.feature({
  "line": 2,
  "name": "Vehicle insurance cover checking using registration number",
  "description": "As a user\r\nI want to enter registration number\r\nSo that I can be able to check vehicle cover information.",
  "id": "vehicle-insurance-cover-checking-using-registration-number",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@coverCheck"
    }
  ]
});
formatter.before({
  "duration": 6667175700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "To verify I can see vehicle insurance cover information with valid registration number",
  "description": "",
  "id": "vehicle-insurance-cover-checking-using-registration-number;to-verify-i-can-see-vehicle-insurance-cover-information-with-valid-registration-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter valid vehicle registration number",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Find vehicle button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I should be able to see vehicle insurance cover information",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 295450800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterValidVehicleRegistrationNumber()"
});
formatter.result({
  "duration": 173667500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnFindVehicleButton()"
});
formatter.result({
  "duration": 123304500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAbleToSeeVehicleInsuranceCoverInformation()"
});
formatter.result({
  "duration": 218812200,
  "status": "passed"
});
formatter.after({
  "duration": 709316000,
  "status": "passed"
});
formatter.before({
  "duration": 5057254300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To verify I should see record not found message with invalid registration number",
  "description": "",
  "id": "vehicle-insurance-cover-checking-using-registration-number;to-verify-i-should-see-record-not-found-message-with-invalid-registration-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter invalid vehicle registration number",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on Find vehicle button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I should be able to see message \"Sorry record not found\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 25200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iEnterInvalidVehicleRegistrationNumber()"
});
formatter.result({
  "duration": 87435600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnFindVehicleButton()"
});
formatter.result({
  "duration": 85041400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sorry record not found",
      "offset": 33
    }
  ],
  "location": "MyStepdefs.iShouldBeAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 209892300,
  "status": "passed"
});
formatter.after({
  "duration": 728100900,
  "status": "passed"
});
formatter.before({
  "duration": 4985150300,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To verify I should see an error message with no registration number",
  "description": "",
  "id": "vehicle-insurance-cover-checking-using-registration-number;to-verify-i-should-see-an-error-message-with-no-registration-number",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I do not enter vehicle registration number",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I click on Find vehicle button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I should be able to see an error message \"Please enter a valid car registration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 36000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iDoNotEnterVehicleRegistrationNumber()"
});
formatter.result({
  "duration": 62200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnFindVehicleButton()"
});
formatter.result({
  "duration": 72754700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please enter a valid car registration",
      "offset": 42
    }
  ],
  "location": "MyStepdefs.iShouldBeAbleToSeeAnErrorMessage(String)"
});
formatter.result({
  "duration": 35591800,
  "status": "passed"
});
formatter.after({
  "duration": 642322300,
  "status": "passed"
});
});