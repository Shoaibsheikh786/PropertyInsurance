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


	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[1]")
	WebElement firstOne;
	@FindBy(id = "demo-simple-select")
	WebElement selectyear;

	public void clickselectyear1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectyear.click();
		firstOne.click();
	}
	
	@FindBy(xpath = "//li[@data-value='2']")
	WebElement secondOne;
	@FindBy(id = "demo-simple-select")
	WebElement select2year;

	public void clickselectyear2() {
		select2year.click();
		ExpWait.waitForElementToBeClickable(DriverFactory.getDriver(), secondOne, 5);
		secondOne.click();
	}
	
	@FindBy(xpath = "//li[@data-value='3']")
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
	
	@FindBy(xpath = "//li[@data-value='4']")
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
	
	@FindBy(xpath = "//li[@data-value='5']")
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
