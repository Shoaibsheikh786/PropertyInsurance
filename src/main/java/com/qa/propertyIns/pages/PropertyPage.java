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

public class PropertyPage {
	
	public PropertyPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[text()='  Get new policy']")
	WebElement Getnewpolicybutton;
	
	public void clickGetnewpolicy() {
		EleInt.click(Getnewpolicybutton);
	}
	
	@FindBy(name = "marketValue")
	WebElement CurrentMarketValue;

	public void CurrentMarketValue(String value) { 
		EleInt.typeText(CurrentMarketValue, value);
		// CurrentMarketValue.sendKeys();
	}

	@FindBy(name = "squareFeet")
	WebElement CarpetArea;

	public void CarpetArea(String value) {
		EleInt.typeText(CarpetArea, value);
		// CarpetArea.sendKeys();
	}

	@FindBy(name = "pincode")
	WebElement Pincode;

	public void Pincode(String value) {
		EleInt.typeText(Pincode, value);
		// Pincode.sendKeys();
	}

	@FindBy(name = "buildingAge")
	WebElement AgeOfTheBuilding;

	public void selectAgeOfTheBuilding(String s) {
		Dd.selectByIndex(AgeOfTheBuilding, 0);

		Select select = new Select(AgeOfTheBuilding);
		select.selectByIndex(1);

	}

	@FindBy(name = "effected")
	WebElement PropertyEffectedWithFloods;

	public void selectPropertyEffectedWithFloods(String string) {
		// Dd.selectByIndex(PropertyEffectedWithFloods, 0);
		Dd.selectByIndex(PropertyEffectedWithFloods, 0);

		Select sel = new Select(PropertyEffectedWithFloods);
		sel.selectByIndex(2);
	}

	@FindBy(name = "security")
	WebElement security;

	public void selectsecurity() {
		Dd.selectByIndex(security, 0);
		Select sel = new Select(security);
		sel.selectByIndex(1);
	}

	@FindBy(name = "security")
	WebElement security1;

	public void security() {
		Dd.selectByIndex(security, 0);
		Select sel = new Select(security);
		sel.selectByIndex(2);
	}

	@FindBy(name = "person")
	WebElement person;

	public void selectSalariedPerson() {
		Dd.selectByIndex(person, 0);
		Select sel = new Select(person);
		sel.selectByIndex(1);
	}

	@FindBy(xpath = "//button[text()=' View Quotes ']")
	WebElement ViewQuotes;

	public void clickViewQuotes() {
		JSEUtility.scrollToBottom(DriverFactory.getDriver());
		ExpWait.waitForElementToBeClickable(DriverFactory.getDriver(), ViewQuotes, 10);
		ViewQuotes.click();
	}
	

}
