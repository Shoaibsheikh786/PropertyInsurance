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

	
     
   

}
