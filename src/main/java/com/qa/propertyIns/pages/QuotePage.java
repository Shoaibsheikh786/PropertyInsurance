package com.qa.propertyIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.propertyIns.driverfactory.DriverFactory;
import com.qa.propertyIns.utils.Dd;
import com.qa.propertyIns.utils.EleInt;
import com.qa.propertyIns.utils.ExpWait;
import com.qa.propertyIns.utils.JSEUtility;

public class QuotePage {
	
	public QuotePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this); 
	}

	@FindBy(xpath = "//div[text()='1 Years']]")
	WebElement firstOne;
	@FindBy(id = "demo-simple-select")
	WebElement selectyear1;

	public void clickselectyear1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectyear1.click();
		firstOne.click();
	}
	
	
	@FindBy(xpath = "//div[text()='2 years']")
	WebElement secondOne;
	@FindBy(id = "demo-simple-select")
	WebElement select2year;

	public void clickselectyear2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		select2year.click();
		secondOne.click();
	}
	
	@FindBy(xpath = "//div[text()='3 years']")
	WebElement thirdOne;
	@FindBy(id = "demo-simple-select")
	WebElement select3year;
	
	public void clickselectyear3() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		select3year.click();
		thirdOne.click();
	}
	
	@FindBy(xpath = "//div[text()='4 years']")
	WebElement fourOne;
	@FindBy(id = "demo-simple-select")
	WebElement selectyear4;

	public void clickselectyear4() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectyear4.click();
		fourOne.click();
	}
	
	@FindBy(xpath = "//div[text()='5 years']")
	WebElement fiveOne;
	@FindBy(id = "demo-simple-select")
	WebElement selectyear5;

	public void clickselectyear5() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectyear5.click();
		fiveOne.click();
	}
	
	
	

	@FindBy(xpath = "//button[@class='btn btn-primary rounded buy shadow fw-bold']")
	WebElement taxes;

	public String verifyinclusiveofalltaxes() {
		String b1 = EleInt.getText(taxes);
		return b1;
		
	}

	@FindBy(xpath = "//button[@class='btn btn-primary rounded buy shadow fw-bold']")
	WebElement taxes1;

	public String inclusiveofalltaxes() {
		String b1 = EleInt.getText(taxes);
		return b1;

	}


	@FindBy(xpath = "//div[text()='Buy Now']")
	WebElement buynow;

	public void clickbuynow() {
		EleInt.click(buynow);
	}

}
