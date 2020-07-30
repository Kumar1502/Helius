
Feature: Verify the no of awards achieved by DBS

@DbsTest 
Scenario: Read and write data table in exceel sheet
Given Launch the url"https://www.dbs.com.sg/index/default.page"
When Click on Learn More button
Then Scroll down and navigate to "Singapore" on the left panel
And Read and Write the data table in excel sheet
And Navigate to Aboutin the header tabs
And Navigate to Who  we are tab
And Navigate to OurAwrds and Accolades
And Validate the total no of awards displayed is "22"
And Print in the cucumber report in the form of table
  
  