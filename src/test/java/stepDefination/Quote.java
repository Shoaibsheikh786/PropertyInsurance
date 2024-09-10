package stepDefination;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.pages.QuotePage;

import io.cucumber.java.en.*;

public class Quote {
	QuotePage qp;
 SoftAssert SoftAssert = new SoftAssert();
	public Quote() {
		qp = new QuotePage(DriverFactory.getDriver());
	}
	
	@And("user  can click on select year option")
	public void user_can_click_on_select_year_option() {
		qp.clickselectyear1();
	}
	
	@And("user  can click on select year option2")
	public void user_can_click_on_select_year_option2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		qp.clickselectyear2();
	}
	
	@And("user  can click on select year option3")
	public void user_can_click_on_select_year_option3() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		qp.clickselectyear3();
	}
	
	@And("user  can click on select year option4")
	public void user_can_click_on_select_year_option4() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		qp.clickselectyear4();
	}
	
	@And("user  can click on select year option5")
	public void user_can_click_on_select_year_option5() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		qp.clickselectyear5();
	}

	@Then("user can  verify the inclusive of all taxes")
	public void user_can_verify_the_inclusive_of_all_taxes() throws InterruptedException {
		Thread.sleep(1000);
		SoftAssert.assertEquals(qp.verifyinclusiveofalltaxes(), "₹6000/-", "Asseration Message");
		//Assert.assertEquals(qp.verifyinclusiveofalltaxes(), "₹6000/-");
		System.out.println(qp.verifyinclusiveofalltaxes());
	}

	
	@Then("user click on buynow")
	public void user_click_on_buynow() {
	   qp.clickbuynow();
	}

}