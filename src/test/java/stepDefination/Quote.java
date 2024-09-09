package stepDefination;

import org.testng.Assert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.QuotePage;

import io.cucumber.java.en.*;

public class Quote {
	QuotePage qp;

	public Quote() {
		qp = new QuotePage(DriverFactory.getDriver());
	}
	
	@And("user  can click on select year option")
	public void user_can_click_on_select_year_option() {
		qp.clickselectyear1();
	}

	@Then("user can  verify the inclusive of all taxes")
	public void user_can_verify_the_inclusive_of_all_taxes() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals(qp.verifyinclusiveofalltaxes(), "₹6000/-");
		System.out.println(qp.verifyinclusiveofalltaxes());
	}

	@Then("user can  verify the inclusive of all taxes1")
	public void user_can_verify_the_inclusive_of_all_taxes1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(qp.inclusiveofalltaxes(), "₹8000/-");
		System.out.println(qp.inclusiveofalltaxes());
	}
	
	@Then("user click on buynow")
	public void user_click_on_buynow() {
	   qp.clickbuynow();
	}

}