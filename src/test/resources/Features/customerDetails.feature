@all

Feature: Customer page 

Background: 

Given Customer should enter mobile number "8977797956"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
Given user click on propertyinsurance button
Given user  enters valid current market Value "10000900"
When user can  enters valid square feet value "99909"
And user can  enters a valid Pincode "510083"
And user  is select Age Of The Building
And user is select the Floods options
And User is select No Security options
And user is select the Salaried options
And user can click on view quotes button
And user  can click on select year option
Then user click on buynow


Scenario: verify the Customer details page
Given user should be able to enter houseno "766"
When user should be able to enter street "ameerpeata"
And user should be able to enter city "hyderabad"
And user should be able to enter state "telangana"
And verify the Pincode
And user click on Above is Current Address button and select options
Then user can click on makepayment button