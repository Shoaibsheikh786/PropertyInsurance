package stepDefination;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.PropertyPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Property {
	
	PropertyPage proPage;
	
	public Property()
	{
		proPage=new PropertyPage(DriverFactory.getDriver());
	}
	@Given("user click on get new policy")
	public void user_click_on_get_new_policy() {
		proPage.clickGetnewpolicy();
	
	}

	
	@Given("user  enters valid Current Market Value {string}")
	public void user_enters_valid_current_market_value(String value) {
		proPage.CurrentMarketValue(value);
	}

	@When("user can  enters valid square feet value {string}")
	public void user_can_enters_valid_square_feet_value(String value) {
		proPage.CarpetArea(value);
	}

	@And("user can  enters a valid Pincode {string}")
	public void user_can_enters_a_valid_digit_pincode(String value) {
		proPage.Pincode(value);
	}

	@When("user  is select Age Of The Building {string}")
	public void user_is_select_age_of_the_building(String string) {
		proPage.selectAgeOfTheBuilding(string);
	}

	@And("user is select the Floods options {string}")
	public void user_is_select_the_floods_options(String string) {
		proPage.selectPropertyEffectedWithFloods(string);
	}

	@And("User is select the Security options")
	public void user_is_select_the_security_options() {
		proPage.selectsecurity();
	}

	@And("User is select No Security options")
	public void user_is_select_no_security_options() {
		proPage.security();
	}

	@And("user is select the Salaried options")
	public void user_is_select_the_salaried_options() {
		proPage.selectSalariedPerson();
	}

	@And("user can click on view quotes button")
	public void user_can_click_on_view_quotes_button() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		proPage.clickViewQuotes();
	}
}
