$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dbssg.feature");
formatter.feature({
  "line": 2,
  "name": "Verify the no of awards achieved by DBS",
  "description": "",
  "id": "verify-the-no-of-awards-achieved-by-dbs",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Read and write data table in exceel sheet",
  "description": "",
  "id": "verify-the-no-of-awards-achieved-by-dbs;read-and-write-data-table-in-exceel-sheet",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DbsTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the url\"https://www.dbs.com.sg/index/default.page\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Learn More button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Scroll down and navigate to \"Singapore\" on the left panel",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Read and Write the data table in excel sheet",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Navigate to Aboutin the header tabs",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Navigate to Who  we are tab",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Navigate to OurAwrds and Accolades",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Validate the total no of awards displayed is \"22\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Print in the cucumber report in the form of table",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.dbs.com.sg/index/default.page",
      "offset": 15
    }
  ],
  "location": "DbsSg.launch_the_urlsomething(String)"
});
formatter.result({
  "duration": 15795611608,
  "status": "passed"
});
formatter.match({
  "location": "DbsSg.click_on_learn_more_button()"
});
formatter.result({
  "duration": 6039478921,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Singapore",
      "offset": 29
    }
  ],
  "location": "DbsSg.scroll_down_and_navigate_to_something_on_the_left_panel(String)"
});
formatter.result({
  "duration": 556830434,
  "status": "passed"
});
formatter.match({
  "location": "DbsSg.read_and_write_the_data_table_in_excel_sheet()"
});
formatter.result({
  "duration": 6755661956,
  "status": "passed"
});
formatter.match({
  "location": "DbsSg.navigate_to_aboutin_the_header_tabs()"
});
formatter.result({
  "duration": 6976776474,
  "status": "passed"
});
formatter.match({
  "location": "DbsSg.navigate_to_who_we_are_tab()"
});
formatter.result({
  "duration": 3578530730,
  "status": "passed"
});
formatter.match({
  "location": "DbsSg.navigate_to_ourawrds_and_accolades()"
});
formatter.result({
  "duration": 8900121438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22",
      "offset": 46
    }
  ],
  "location": "DbsSg.validate_the_total_no_of_awards_displayed_is_something(String)"
});
formatter.result({
  "duration": 452795067,
  "status": "passed"
});
formatter.match({
  "location": "DbsSg.print_in_the_cucumber_report_in_the_form_of_table()"
});
formatter.result({
  "duration": 787468282,
  "status": "passed"
});
formatter.after({
  "duration": 226326153,
  "status": "passed"
});
});