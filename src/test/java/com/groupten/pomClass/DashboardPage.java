package com.groupten.pomClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class DashboardPage {

	//Initialization
	public DashboardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath="//span[text()='1000124392']")
	private WebElement buildElement;
	
	//Utilization
	public void clickOnBangalore(){
		buildElement.click();
	}
	
	@FindBy(xpath="//i[@class='fa fa-sliders pr10']")
	private WebElement manageElement;
	
	public void clickOnManage(){
		manageElement.click();
	}
	
	@FindBy(xpath="//i[@class='fa fa-users']")
	private WebElement teamElement;
	
	public void clickOnTeam(){
		teamElement.click();
	}
	
	@FindBy(xpath="//div[@class='col-md-8']/input")
	private WebElement emailElement;
	
	public void enterEmail(String tm){
		emailElement.sendKeys(tm);
	}
	
	@FindBy(xpath="//div[@class='col-md-4 mln20']/button")
	private WebElement addElement;
	
	public void clickOnAdd(){
		addElement.click();
	}
	
	@FindBy(xpath="//a[@class='dropdown-toggle ng-binding']")
	private WebElement accountElement;
	
	public void clickOnAccount(){
		accountElement.click();
	}
	
	
	@FindBy(xpath="//i[@class='fa fa-sign-out']")
	private WebElement signOutElement;
	
	public void clickOnsignOut() {
		signOutElement.click();
		
	}
}
