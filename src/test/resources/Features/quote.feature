
Feature: quote page

Background:
Given Customer should enter mobile number "8500435582"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
And Click on my account
Then click on property insurance
Given user click on getnewpolicy button
And user enters valid current market Value "100003"
When user enters valid square feet value "600"
And user enters a valid digit Pincode "5000833"
And user is select Age Of The Building "0 to 5 years"
And user is select the Flood option "No"
And user is select the Security option "Yes"
And user is select the Salary option "Yes"
And user click on view quotes button

@Sowjanya      @Regression
Scenario: verify the premium amount by selecting 1 year term period 

And user  can click on select year option
Then user can  verify the inclusive of all taxes
Then user click on buynow

@Regression @premium2
Scenario: verify the prenium amount by selecting 2 years term period 

And user  can click on select year option2
Then user can  verify the inclusive of all taxes

@Regression @premium3
Scenario: verify the prenium amount by selecting 3 years term period 

And user  can click on select year option3
Then user can  verify the inclusive of all taxes


@Regression @premium4
Scenario: verify the prenium amount by selecting 4 years term period 

And user  can click on select year option4
Then user can  verify the inclusive of all taxes


@Regression @premium5
Scenario: verify the prenium amount by selecting 5 years term period 

And user  can click on select year option5
Then user can  verify the inclusive of all taxes
