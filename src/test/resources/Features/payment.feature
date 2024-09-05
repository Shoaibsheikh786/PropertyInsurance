@invoice
Feature: Policy Details
Background:
Given Customer should enter mobile number "9381440569"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
Given user click on propertyinsurance button
Given user  enters valid Current Market Value "1000000"
When user can  enters valid square feet value "99999"
And user can  enters a valid Pincode "500083"
And user  is select Age Of The Building "0 to 5 years"
And user is select the Floods options "NO"
And User is select No Security options
And user is select the Salaried options
And user can click on view quotes button
And user  can click on select year option
Then user click on buynow
Given user should be able to enter house no "43-9"
When user should be able to enter street "nilagiri"
And user should be able to enter city "chirala"
And user should be able to enter state "bihar"
And verify the Pincode
And user can select these options
Then user can click on makepayment button

Scenario: verify the policy details page
Given user click on proceed to payment
When user can select netbanking option
And user can select the bank 
And user click on paynow button
And user click on success button
And user can enter mobile no
And user click on sendotp button
And user can enter sendotpbutton
And user click on loginbutton
And user click on my account
And user click on propertyinsurancebutton
Then user can able to view the  name,property value,Square feet,Address,premium account,No.of years,Age of the buliding


