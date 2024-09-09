package stepDefination;

import org.junit.Assert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.PropertyPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Property {
	
	PropertyPage ProPage;
	
	public Property()
	{
		ProPage=new PropertyPage(DriverFactory.getDriver());
	}
	

	//@parushuram
	

	@Given("user click on propertyinsurance button")
	public void user_click_on_propertyinsurance_button() {
		ProPage.propertyinsurancebutton();
	}

	@When("user enters valid Current Market Value {string}")
	public void user_enters_valid_current_market_value(String string) {
		boolean b=ProPage.marketvalueTextbox(string);
		  Assert.assertTrue(b);
		  System.out.println("market value displayed");
	}
	

	@When("user enters valid square feet value {string}")
	public void user_enters_valid_square_feet_value(String string) {
		boolean c=ProPage.carpetArea(string);
		  Assert.assertTrue(c);
		  System.out.println("market value displayed");
	}
	
	@When("user enters a valid digit Pincode {string}")
	public void user_enters_a_valid_digit_pincode(String string) {
		boolean d=ProPage.pincode(string);
		Assert.assertTrue(d);
		System.out.println("pincode displayed");
	}
	
	@When("user is select Age Of The Building {string}")
	public void user_is_select_age_of_the_building(String string) {
		boolean e= ProPage.selectageofbuilding(string);
		   Assert.assertTrue(e);
		   System.out.println("age of buliding");
	}
	
	
	@When("user is select the Flood option {string}")
	public void user_is_select_the_flood_option(String string) {
		boolean f=ProPage.Effectedflood(string);
		   Assert.assertTrue(f);
		   System.out.println("Effected Flood");
	}
	
	
	@When("user is select the Security option {string}")
	public void user_is_select_the_security_option(String string) {
		 boolean g=ProPage.SecurityDropdown(string);
		    Assert.assertTrue(g);
		    System.out.println("SecurityDropdown");
	}
	

	@When("user is select the Salary option {string}")
	public void user_is_select_the_salary_option(String string) {
		boolean h=ProPage.SalriedoptionDd(string);
		Assert.assertTrue(h);
		System.out.println("SalaryDropdown");
	}
	
	@When("user click on view quotes button")
	public void user_click_on_view_quotes_button() {
		ProPage.Viewquotes();
	}

}
