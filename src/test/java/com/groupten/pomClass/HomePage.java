package com.groupten.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Initilization
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath="//a[@id='load-menu']")
	private WebElement loginElement;	
	//utilization
	public void clickOnLoginLink(){
		loginElement.click();
	}
	
	@FindBy(id="edit-name")
	private WebElement emailElement;
	
	public void enterEmail(String em){
		emailElement.sendKeys(em);
	}
	
	@FindBy(id="edit-pass")
	private WebElement passwordElement;
	
	public void enterPassword(String pwd){
		passwordElement.sendKeys(pwd);
	}
	
	@FindBy(id="edit-submit")
	private WebElement submitElement;
	
	public void clickOnSubmitButton(){
		submitElement.click();
	}
	
}
