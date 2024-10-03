package stepDefination;

import org.junit.Assert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.PropertyPage;
import com.qa.propertyIns.utils.ExpWait;
import com.qa.propertyIns.utils.JSEUtility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Property {
	
	PropertyPage ProPage;
	
	public Property()
	{
		ProPage=new PropertyPage(DriverFactory.getDriver());
	}
	
	//@parushuram
	@Given("user click on getnewpolicy button")
	public void user_click_on_getnewpolicy_button() {
	    ProPage.GetNewpolicyButton();
	}

	@Given("user click on propertyinsurance button")
	public void user_click_on_propertyinsurance_button() {
		ProPage.propertyinsurancebutton();
	}
	
	@Given("user  enters valid current market Value {string}")
	public void user_enters_valid_current_market_Value(String string) {
		boolean b=ProPage.marketvalueTextbox(string);
		Assert.assertTrue(b);
	  System.out.println("market value displayed");
	    
	}

//	@When("user enters valid Current Market Value {string}")
//	public void user_enters_valid_current_market_value(String string) {
//		boolean b=ProPage.marketvalueTextbox(string);
//		  Assert.assertTrue(b);
//		  System.out.println("market value displayed");
//	}
	

	@When("user can  enters valid square feet value {string}")
	public void user_enters_valid_square_feet_value(String string) {
		boolean c=ProPage.carpetArea(string);
		  Assert.assertTrue(c);
		  System.out.println("market value displayed");
	}
	
	@When("user can  enters a valid Pincode {string}")
	public void user_enters_a_valid_Pincode(String string) {
		boolean d=ProPage.pincode(string);
		Assert.assertTrue(d);
		System.out.println("pincode displayed");
	}
	
	@And("user  is select Age Of The Building")
	public void user_is_select_Age_Of_The_Building() {
		boolean e= ProPage.selectageofbuilding();
		   Assert.assertTrue(e);
		   System.out.println("age of buliding");
	}
	
	
	@And("user is select the Floods options")
	public void user_is_select_the_Floods_options() {
		boolean f=ProPage.Effectedflood();
		   Assert.assertTrue(f);
		   System.out.println("Effected Flood");
	}
	
	
	@And("User is select No Security options")
	public void user_is_select_No_Security_options() {
		 boolean g=ProPage.SecurityDropdown();
		    Assert.assertTrue(g);
		    System.out.println("SecurityDropdown");
	}
	

	@And("user is select the Salaried options")
	public void user_is_select_the_Salaried_options() {
		boolean h=ProPage.SalriedoptionDd();
		Assert.assertTrue(h);
		System.out.println("SalaryDropdown +++++++++++");
		
		try {
			System.out.println("hello Wait");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//	ExpWait.waitForElementToBeClickable(driver, //, 0);
		
	}
	
	@And("user can click on view quotes button")
	public void user_can_click_on_view_quotes_button() {
		System.out.println("View Quote button --> click");
		ProPage.Viewquotes();
		System.out.println("View Quote button --> After click");
	}


}
