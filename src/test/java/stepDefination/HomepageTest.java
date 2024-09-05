package stepDefination;


import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.Homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomepageTest {
	
	Homepage h1;
	
	public HomepageTest() {
		h1 = new Homepage(DriverFactory.getDriver());
	}

	
}
