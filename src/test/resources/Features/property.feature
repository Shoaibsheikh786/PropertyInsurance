@all @Parushuram
Feature: property  page
Background: 
Given Customer should enter mobile number "8500435582"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
And Click on my account
Then click on property insurance
Scenario: To verify the view quote page 
Given user click on getnewpolicy button
And user enters valid current market Value "100003"
When user enters valid square feet value "600"
And user enters a valid digit Pincode "5000833"
And user is select Age Of The Building "0 to 5 years"
And user is select the Flood option "No"
And user is select the Security option "Yes"
And user is select the Salary option "Yes"
And user click on view quotes button
