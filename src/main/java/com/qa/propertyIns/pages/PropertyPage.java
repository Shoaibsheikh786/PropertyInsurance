package com.qa.propertyIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.propertyIns.utils.Dd;
import com.qa.propertyIns.utils.EleInt;

public class PropertyPage {
	
	public PropertyPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	
	
	@FindBy(xpath="//button[text()='  Get new policy']")
	WebElement GetNewpolicyButton;
	
	
	public void GetNewpolicyButton()
	{
		EleInt.click(GetNewpolicyButton);
		
	}
	
	

	@FindBy(xpath="//a[@href='/property']")
	WebElement propertyinsurance;

	public void propertyinsurancebutton()
	{
		EleInt.click(propertyinsurance);
		
	}
	
	@FindBy(id = "outlined-textarea")
	WebElement currentmarketvalue;
	
	public boolean marketvalueTextbox(String value) 
	{
		EleInt.typeText(currentmarketvalue, value);
		//currentmarketvalue.isDisplayed();
		
		boolean b=EleInt.isDisplayed(currentmarketvalue);
		return b;	
	}

	@FindBy(name="squareFeet")
	WebElement carpetArea;
	
	public boolean carpetArea(String value) 
	{
		EleInt.typeText(carpetArea, value);;
		//carpetArea.isDisplayed();
		boolean c=EleInt.isDisplayed(carpetArea);
		return c;
		
	}
	
	@FindBy(xpath="//input[@name='pincode']")
	WebElement pincode;
	public boolean pincode(String value) 
	
	{
		EleInt.typeText(pincode, value);
		//pincode.sendKeys();
		
		boolean d=EleInt.isDisplayed(pincode);
		return d;
	}
	
	@FindBy(xpath="//select[@id='age']")
	WebElement ageofbuilding;
	
	public boolean selectageofbuilding(String string) 
	{
		
		Dd.selectByIndex(ageofbuilding, 1);
		boolean e=EleInt.isDisplayed(ageofbuilding);
		return e;
		
	}
	
	@FindBy(xpath="//select[@id='effect']")
	WebElement Effectedflood;
	
	public boolean Effectedflood(String string)
	{
		
		Dd.selectByIndex(Effectedflood, 2);
		boolean f=EleInt.isDisplayed(Effectedflood);
		return f;
		
	}
	
	@FindBy(xpath="//select[@id='security']")
	WebElement SecurityDropdown;
	
	public boolean SecurityDropdown(String string)
	{
		Dd.selectByIndex(SecurityDropdown, 1);
		boolean g=EleInt.isDisplayed(SecurityDropdown);
		return g;
	
	}
	
	@FindBy(xpath="//select[@id='person']")
	WebElement SalriedoptionDd;
	
	public boolean SalriedoptionDd(String string)
	{
		
		Dd.selectByIndex(SalriedoptionDd, 1);
		boolean h=EleInt.isDisplayed(SalriedoptionDd);
		return h;
			
	}
	
	@FindBy(xpath="//button[text()=' View Quotes ']")
	WebElement ViewQuotesbutton;
	
	public void Viewquotes()
	{
		EleInt.click(ViewQuotesbutton);	
	}
	
	@FindBy(xpath="(//button[@type=\"button\"])[1]")
	WebElement CallusButton;
	
	public void callus()
	{
		EleInt.click(CallusButton);
	}
	

//	@FindBy(id = "demo-simple-select")
//	WebElement selectpremiumyear;
//	
//	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[1]")
//	WebElement selectyear;
//	@FindBy(id = "demo-simple-select")
//	WebElement selectpremiumyear;
//
//	public void selectpremiumyear()	
//	{
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		EleInt.click(selectpremiumyear);
//		//Dd.selectByIndex(selectpremiumyear, 1);
//		//Dd.selectByIndex(selectpremiumyear, 2);
//		EleInt.click(selectyear);
//		
//	}
//	
//	@FindBy(xpath="//button[@class='btn btn-primary rounded buy shadow fw-bold']")
//	WebElement buynowbutton;
//	
//	public void buynowbutton()
//	{
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		EleInt.click(buynowbutton);
//	}
//
//	
//		
//	@FindBy(name = "marketValue")
//	WebElement CurrentMarketValue;
//
//	public void CurrentMarketValue(String value) { 
//		EleInt.typeText(CurrentMarketValue, value);
//		// CurrentMarketValue.sendKeys();
//	}
//
//	@FindBy(name = "squareFeet")
//	WebElement CarpetArea;
//
//	public void CarpetArea(String value) {
//		EleInt.typeText(CarpetArea, value);
//		// CarpetArea.sendKeys();
//	}
//
//	@FindBy(name = "pincode")
//	WebElement Pincode;
//
//	public void Pincode(String value) {
//		EleInt.typeText(Pincode, value);
//		// Pincode.sendKeys();
//	}
//
//	@FindBy(name = "buildingAge")
//	WebElement AgeOfTheBuilding;
//
//	public void selectAgeOfTheBuilding(String s) {
//		Dd.selectByIndex(AgeOfTheBuilding, 0);
//
//		Select select = new Select(AgeOfTheBuilding);
//		select.selectByIndex(1);
//
//	}
//
//	@FindBy(name = "effected")
//	WebElement PropertyEffectedWithFloods;
//
//	public void selectPropertyEffectedWithFloods(String string) {
//		// Dd.selectByIndex(PropertyEffectedWithFloods, 0);
//		Dd.selectByIndex(PropertyEffectedWithFloods, 0);
//
//		Select sel = new Select(PropertyEffectedWithFloods);
//		sel.selectByIndex(2);
//	}
//
//	@FindBy(name = "security")
//	WebElement security;
//
//	public void selectsecurity() {
//		Dd.selectByIndex(security, 0);
//		Select sel = new Select(security);
//		sel.selectByIndex(1);
//	}
//
//	@FindBy(name = "security")
//	WebElement security1;
//
//	public void security() {
//		Dd.selectByIndex(security, 0);
//		Select sel = new Select(security);
//		sel.selectByIndex(2);
//	}
//
//	@FindBy(name = "person")
//	WebElement person;
//
//	public void selectSalariedPerson() {
//		Dd.selectByIndex(person, 0);
//		Select sel = new Select(person);
//		sel.selectByIndex(1);
//	}
//
//	@FindBy(xpath = "//button[text()=' View Quotes ']")
//	WebElement ViewQuotes;
//
//	public void clickViewQuotes() {
//		JSEUtility.scrollToBottom(DriverFactory.getDriver());
//		ExpWait.waitForElementToBeClickable(DriverFactory.getDriver(), ViewQuotes, 10);
//		ViewQuotes.click();
//	}
//	


	
	@FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[1]")
	WebElement selectyear;
	@FindBy(id = "demo-simple-select")
	WebElement selectpremiumyear;

	public void selectpremiumyear()	
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EleInt.click(selectpremiumyear);
		//Dd.selectByIndex(selectpremiumyear, 1);
		//Dd.selectByIndex(selectpremiumyear, 2);
		EleInt.click(selectyear);
		
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary rounded buy shadow fw-bold']")
	WebElement buynowbutton;
	
	public void buynowbutton()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EleInt.click(buynowbutton);
	}
	
	


}
