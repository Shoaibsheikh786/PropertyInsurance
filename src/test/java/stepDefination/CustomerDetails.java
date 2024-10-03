package stepDefination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.CustomerDetailsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CustomerDetails {
	CustomerDetailsPage n1; 
	
//	public CustomerDetails(WebDriver webDriver) {
//		
//		n1 = new CustomerDetailsPage(DriverFactory.getDriver());
//	}
	public CustomerDetails() // parameterized constructor create
	{
		//PageFactory.initElements(driver, this); // initialize the webelement
		n1=new CustomerDetailsPage(DriverFactory.getDriver());
	}

	@Given("user should be able to enter houseno {string}")
	public void user_should_be_able_to_enter_houseno(String s) {
		 n1.enterhouseno(s);
	   
	}

	@And("user should be able to enter street {string}")
	public void user_should_be_able_to_enter_street(String s) {
	   
		n1.enterstreeatno(s);
	   
	}

	

	@And("user should be able to enter city {string}")
	public void user_should_be_able_to_enter_city(String s) {
	  
		n1.entercity(s);
	  
	}

	

	@And("user should be able to enter state {string}")
	public void user_should_be_able_to_enter_state(String s) {
	   
		n1.enterstate(s);
	    
	}

	@And("verify the Pincode")
	public void verify_the_pincode() {
		Assert.assertEquals(n1.enterpincode(), true);
	   
	}


	@And("user click on Above is Current Address button and select options")
	public void user_click_on_above_is_current_address_button_and_select_options() {
		n1.enteraddress();
	    
	}
	

	
	@Then("user can click on makepayment button")
	public void user_can_click_on_makepayment_button()  {
		n1.clickmakepayment();
		
	}
	
}
