@Policypage @all

Feature: Policy details page

@regression1 @Akhil
Scenario: As a customer,I should be able to buy any policy

Given Customer should enter mobile number "8500435582"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
And Click on my account
Then click on property insurance
And click on logout button
And verify the customer navigated to homepage

@verifydetails @Akhil
Scenario: verify and modify customer details in policy details page

Given Customer should enter mobile number "8500435582"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
And Click on my account
Then click on property insurance
Then verify the property details is displayed
And verify the contact details of customer
Then click on update to enter new mail
Then enter the new mail "rajiniaknth25@gmail.com"
And click on send otp on policy details page
Then Get the otp text
Then Enter the otp text "EleInt.getText(gettext)"
Then Click on verify

@regression @negativenum @Akhil
Scenario: As a customer,I should be able to login with invalid credentials 

Given Customer should enter mobile number "8765785790"
When Click on send otp
Then verify the user not exists message "Mobile number is not exists"

@regression @wrongotp @Akhil
Scenario: As a customer, I need to login with invalid otp

Given Customer should enter mobile number "8500435582"
When Click on send otp
Then enter the otp2 "0989"
Then Click on login button
Then verify the invalid otp message



