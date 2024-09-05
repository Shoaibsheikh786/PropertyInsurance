package com.qa.propertyIns.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.propertyIns.utils.EleInt;
import com.qa.propertyIns.utils.JSEUtility;

public class Homepage {
	WebDriverWait wait;
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	     this.driver=driver;
	}
	
	@FindBy(name = "mobileno")
	WebElement mobilenum;
	public void entermobile(String s) {
		//mobilenum.sendKeys(s);
		EleInt.typeText(mobilenum, s);
	}
	
	@FindBy(xpath = "//button[text()='Send OTP']")
	WebElement clicksendotp;
	public void sendotp() {
//		clicksendotp.click();
		EleInt.click(clicksendotp);
	}
	
	@FindBy(xpath = "//h3[@class='text-danger']")
	WebElement verifyotp;
	public void getotp() {
//		verifyotp.getText();
		EleInt.getText(verifyotp);
		System.out.println(EleInt.getText(verifyotp));
	}
	
	@FindBy(xpath = "//input[@class='w-25 border ps-lg-3 fw-semibold rounded']")
	WebElement otpbox;
	public void enterotp(String s) {
//		otpbox.sendKeys(s);
		EleInt.typeText(otpbox, EleInt.getText(verifyotp));
	}
	
	@FindBy(xpath = "//button[@class='btn btn-info text-nowrap fw-bold shadow ms-1']")
	WebElement clicklogin;
	public void loginbutton() {
//		clicklogin.click();
		EleInt.click(clicklogin);
	}
	
	@FindBy(xpath = "//img[@src='/static/media/myaccount.04fd50cc56e59e16f4e3.jpg']")
	WebElement clickonmyaccount;
	public void myaccount() {
		clickonmyaccount.click();
	}
	
	@FindBy(xpath = "//div[@class='card-body']")
	WebElement clickpropertyinsurance;
	public void propertyinsurance() {
         wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
         wait.until(ExpectedConditions.elementToBeClickable(clickpropertyinsurance));
		clickpropertyinsurance.click();
	}
	
	@FindBy(xpath = "//button[text()='Log Out ']")
	WebElement clickonlogout;
	public void logoutbutton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EleInt.click(clickonlogout);
	}
	
	@FindBy(xpath = "//div[@class='row mt-5 mt-lg-3']")
	WebElement homepage;
	public boolean verifyhome() {
		boolean b = homepage.isDisplayed();
		return b;
	}
	
	@FindBy(xpath = "//h4[text()='Mobile number is not exists']")
	WebElement message;
	public String verifymsg() {
		String s = EleInt.getText(message);
		return s;
	}
	
	@FindBy(xpath = "//input[@class='w-25 border ps-lg-3 fw-semibold rounded']")
	WebElement otp2;
	public void enterotp2(String s) {
		EleInt.typeText(otp2, s);
	}
	
	@FindBy(xpath = "//h4[@class='text-danger ms-2 mt-2']")
	WebElement message2;
	public String otpmessage() {
		String s = EleInt.getText(message2);
		return s;
		
	}
	
	@FindBy(xpath = "//div[@class='card-body']")
	WebElement PropertyDetails;
	public boolean DisplayedpropertyDetails() {
		boolean b1=EleInt.isDisplayed(PropertyDetails);
		return b1;
	}
	
	@FindBy(xpath = "//div[@class='overflow-y-scroll']")
	WebElement contactdetails;
	public boolean Displaycontactdetails() {
		boolean b =EleInt.isDisplayed(contactdetails);
		return b;
	}
	
	@FindBy(xpath = "(//a[text()='Update '])[2]")
	WebElement clickupdate;
	public void clickupdatebutton() {
		EleInt.click(clickupdate);
	}
	
	@FindBy(name = "email")
	WebElement entermail;
	public void entermailid(String s) {
		entermail.clear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("------------------>"+s);
     //   EleInt.typeText(enternum,);
		for(int i=0;i<19;i++)
		entermail.sendKeys(Keys.BACK_SPACE);
		
		JSEUtility.highlightElement(driver,entermail);
		EleInt.typeText(entermail, s); 
	}
	
	@FindBy(xpath = "//a[text()='SendOTP']")
	WebElement sendotp;
	public void clicksendotp() {
		EleInt.click(sendotp);
	}
	
	@FindBy(xpath = "//h3[@class='text-danger']")
	WebElement gettext;
	public void Otptext() {
		EleInt.getText(gettext);
		System.out.println(EleInt.getText(gettext));
	}
	
	@FindBy(id = "outlined-basic")
	WebElement Enterotp;
	public void Enterotptext(String s) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EleInt.typeText(Enterotp, EleInt.getText(gettext));
	}
	
	@FindBy(xpath = "//button[text()='Verify']")
	WebElement verifybutton;
	public void clickveifybutton() {
		EleInt.click(verifybutton);
	}
	
}
