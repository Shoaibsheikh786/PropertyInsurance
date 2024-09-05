
Feature: quote page

Scenario Outline: User can verify the quote page
Given user  can click on select year option
Then user can  verify the inclusive of all taxes1

@positive
Scenario Outline: User can verify the property page
Given user click on propertyinsurance button
Given user  enters valid Current Market Value <market>
When user can  enters valid square feet value <square>
And user can  enters a valid Pincode <pincode>
And user  is select Age Of The Building <years>
And user is select the Floods options <Floods>
And User is select the Security options
And user is select the Salaried options
And user can click on view quotes button
And user  can click on select year option
Then user can  verify the inclusive of all taxes
Examples:
| market | square | pincode | years | Floods |
| "10000000" | "99999" | "500083" | "0 to 5 years" | "NO" |


@negative
Scenario Outline: User can verify the property page
Given user click on propertyinsurance button
Given user  enters valid Current Market Value <market>
When user can  enters valid square feet value <square>
And user can  enters a valid Pincode <pincode>
And user  is select Age Of The Building <years>
And user is select the Floods options <Floods>
And User is select No Security options
And user is select the Salaried options
And user can click on view quotes button
And user  can click on select year option
Then user can  verify the inclusive of all taxes1

Examples:
| market | square | pincode | years | Floods |
| "10000000" | "99999" | "500083" | "0 to 5 years" | "NO" |


Scenario Outline: User can verify the checkout page
Given Customer should enter mobile number "9381440569"
When Click on send otp
Then verify and get the generated otp
Then enter the otp "EleInt.getText(verifyotp)"
Then Click on login button
Given user click on propertyinsurance button
Given user  enters valid Current Market Value <market>
When user can  enters valid square feet value <square>
And user can  enters a valid Pincode <pincode>
And user  is select Age Of The Building <years>
And user is select the Floods options <Floods>
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
Then user can click on makepayent button
Examples:
| market | square | pincode | years | Floods |
| "10000000" | "99999" | "500083" | "0 to 5 years" | "NO" |


