package stepDefination;


import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.Homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomepageTest {
	
	Homepage h1;
	
	public HomepageTest() {
		h1 = new Homepage(DriverFactory.getDriver());
	}

	@Given("Customer should enter mobile number {string}")
	public void customer_should_enter_mobile_number(String s) {
		h1.entermobile(s);
	}

	@When("Click on send otp")
	public void click_on_send_otp() {
		h1.sendotp();
	}

	@Then("verify and get the generated otp")
	public void verify_and_get_the_generated_otp() {
		h1.getotp();
	   System.out.println();
	}

	@Then("enter the otp {string}")
	public void enter_the_otp(String s) {
		h1.enterotp(s);
	}

	@Then("Click on login button")
	public void click_on_login_button() {
		h1.loginbutton();
	}

	@And("Click on my account")
	public void click_on_my_account() {
		h1.myaccount();
	}

	@Then("click on property insurance")
	public void click_on_property_insurance() {
		h1.propertyinsurance();
	}

	@And("click on logout button")
	public void click_on_logout_button() {
		h1.logoutbutton();
	}

	@Then("verify the customer navigated to homepage")
	public void verify_the_customer_navigated_to_homepage() {
		Assert.assertEquals(h1.verifyhome(), true);
		System.out.println(h1.verifyhome() + "-->Navigated to homepage");
	}

	@Then("verify the user not exists message {string}")
	public void verify_the_user_not_exists_message(String message) {
		Assert.assertEquals(h1.verifymsg(),message);
		System.out.println("Mobile number is not exists");
	}

	@Then("enter the otp2 {string}")
	public void enter_the_otp2(String s) {
		h1.enterotp2(s);
	}

	@Then("verify the invalid otp message")
	public void verify_the_invalid_otp_message() {
		SoftAssert softAssert = new SoftAssert();
		//Assert.assertEquals(p1.otpmessage(), "Invalid OTP...!");
		softAssert.assertEquals(h1.otpmessage(), "Invalid OTP...!");
		System.out.println("--->worng otp entered");
	}

	@Then("verify the property details is displayed")
	public void verify_the_property_details_is_displayed() {
		Assert.assertTrue(h1.DisplayedpropertyDetails());
		System.out.println(h1.DisplayedpropertyDetails());
	}

	@Then("verify the contact details of customer")
	public void verify_the_contact_details_of_customer() {
		Assert.assertTrue(h1.Displaycontactdetails());
		System.out.println(h1.Displaycontactdetails());
	}

	@Then("click on update to enter new mail")
	public void click_on_update_to_enter_new_mail() {
		h1.clickupdatebutton();
	}

	@Then("enter the new mail {string}")
	public void enter_the_new_mail(String a) {
		h1.entermailid(a);
	}
	
	@Then("click on send otp on policy details page")
	public void click_on_send_otp_on_policy_details_page() {
	    h1.clicksendotp();
	}
	
	@Then("Get the otp text")
	public void get_the_otp_text() {
	   h1.Otptext();
	}

	@Then("Enter the otp text {string}")
	public void enter_the_otp_text(String s) {
	   h1.Enterotptext(s);
	}

	@Then("Click on verify")
	public void click_on_verify() {
	    h1.clickveifybutton();
	}
	
}
