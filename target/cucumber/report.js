$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Google.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"http://www.gmail.com\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.StepDef.i_navigate_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter userId and Password",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefination.StepDef.i_enter_userId_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on next button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.StepDef.click_on_next_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the error massage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.StepDef.i_should_see_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});