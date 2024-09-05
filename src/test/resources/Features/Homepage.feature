@all 

Feature: Login features
@home    
Scenario Outline: Verify that Customer login with  mobile number
Given Customer enter existing mobile number <number>
And click on send otp button 
And Customer get otp
And Customer enter the otp <otp>
And Customer clcik on Login Button
And click on my account
And click on property insurance
Then click on invoce button
Examples: 
| number | otp |
| "8977797956" | "otp.getText()" | 

#valid existiing number
