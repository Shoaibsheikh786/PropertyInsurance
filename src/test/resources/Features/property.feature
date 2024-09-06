@all
Feature: property  page

Background: 
Given Customer should enter mobile number "8500435582"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
And Click on my account

@sowjanya
Scenario Outline: User can verify the property page
Given user click on get new policy
When user  enters valid Current Market Value <market>
When user can  enters valid square feet value <square>
And user can  enters a valid Pincode <pincode>
And user  is select Age Of The Building <years>
And user is select the Floods options <Floods>
And User is select No Security options
And user is select the Salaried options
And user can click on view quotes button

Examples:
| market | square | pincode | years | Floods |
| "10000000" | "99999" | "500083" | "0 to 5 years" | "NO" |
