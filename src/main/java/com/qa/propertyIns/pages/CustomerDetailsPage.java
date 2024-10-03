package com.qa.propertyIns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.propertyIns.utils.EleInt;

public class CustomerDetailsPage {
	EleInt elem;
	
    public  CustomerDetailsPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@name='propertyhouseNo']")
	WebElement houseno;
	public void enterhouseno(String val)
	{ 
		houseno.sendKeys(val);
	}
   @FindBy(xpath="//input[@name='propertystreetNo']")
   WebElement streetno;
   public void enterstreeatno(String val)
   {
	   streetno.sendKeys(val);
	  
   }
   @FindBy(xpath="//input[@name='propertycity']")
   WebElement city;
   public void entercity(String val)
   {
	   city.sendKeys(val);
	  
   }
   @FindBy(xpath="//input[@name='propertystate']")
   WebElement state;
   public void enterstate(String val)
   {
	   state.sendKeys(val);
	  
   }
   @FindBy(xpath="//input[@name='propertypincode']")
   WebElement pincode;
    public boolean enterpincode()
    {
    	boolean s=pincode.isDisplayed();
		return s;
    }
    @FindBy(id="address")
    WebElement address;
    public void enteraddress()
    {
    	Select select = new Select(address);
		select.selectByIndex(1);
    }
    
    @FindBy(xpath="//button[text()='Make Payment']")
    WebElement makepayment;
    public void clickmakepayment()
    {
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	makepayment.click();
    	
    }
     
   

}
  