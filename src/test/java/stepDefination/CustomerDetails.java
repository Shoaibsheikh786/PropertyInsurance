package stepDefination;

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


	
}
