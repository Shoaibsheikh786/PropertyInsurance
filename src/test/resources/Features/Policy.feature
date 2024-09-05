@Policypage @all

Feature: Policy details page

@regression1
Scenario: As a customer,I should be able to buy any policy

Given Customer should enter mobile number "8500435582"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
And Click on my account
Then click on property insurance
Then verify the property details is displayed
And verify the contact details of customer
Then click on update to enter new mobile number
Then enter the new mobile number "9579862483"
And click on send otp on policy details page
Then Get the otp text
Then Enter the otp text "EleInt.getText(gettext)"
Then Click on verify
When click on send otp on policy details page
And click on logout button
And verify the customer navigated to homepage

Scenario: As a customer,I should be able to buy any policy

Given Customer should enter mobile number "8500435582"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
And Click on my account
Then click on property insurance
Then verify the property details is displayed
And verify the contact details of customer
Then click on update to enter new mobile number
Then enter the new mobile number "9579862483"
And click on send otp on policy details page
Then Get the otp text
Then Enter the otp text "EleInt.getText(gettext)"
Then Click on verify

@regression @negativenum
Scenario: As a customer,I should be able to login with invalid credentials 

Given Customer should enter mobile number "8765785790"
When Click on send otp
Then verify the user not exists message

@regression @negativeotp
Scenario: As a customer, I need to login with invalid otp

Given Customer should enter mobile number "8500435582"
When Click on send otp
Then enter the otp2 "0989"
Then Click on login button
Then verify the invalid otp message