package com.groupten.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProjectRegistrationPage {
	
	//Initialization 
	public ProjectRegistrationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	 //Declaration
	@FindBy(xpath="//button[text()='+ Add']")
 	private WebElement AddProjectElement;
	//utilization
	public void clickAddProjectElement(){
		AddProjectElement.click();																																								   
	}
	
	//Declaration Project Name
	@FindBy(xpath="//input[@id='project_name']")
	private WebElement ProjectNameElement;
	//Utilization
	public void enterProjectName(String pn){
	ProjectNameElement.sendKeys(pn);
	}
	
	//Unit Type Radio SI
	@FindBy(xpath="//input[@id='unitType2']")
	private WebElement IpSelectElement;
	public void clickSISelect(){
	IpSelectElement.click();	
	}
	
	//Click on Space Type Selection
	@FindBy(xpath="//select[@id='space_type']")
	private WebElement SpaceTypeElement;
	public void clickSpaceType(){
		SpaceTypeElement.click();
	}
	
	//Select Circulation space
	@FindBy(xpath="//option[@label='Circulation space']")
	private WebElement CirculationElement;
	public void selectCirculationType(){
		CirculationElement.click();
	}
	//Owner Type
	@FindBy(xpath="//input[@id='ownerType']")
	private WebElement OwnerTypeElement;
	public void enterOwnerType(String ot){
		OwnerTypeElement.sendKeys(ot);
		
	}
	//Owner Organization
	@FindBy(xpath="//input[@id='organization']")
	private WebElement OwnerOrgElement;
	public void enterOwnerOrg(String oo){
		OwnerOrgElement.sendKeys(oo);
	}
	//Owner Email
	@FindBy(xpath="//input[@id='owner_email']")
	private WebElement OwnerEmailElement;
	public void ownerEmail(String oe){
		OwnerEmailElement.sendKeys(oe);
	}
	//Owner country
	@FindBy(xpath="//select[@id='manageEntityCountry']")
	private WebElement OwnerContElement;
	public void clickOwnCount(){
		OwnerContElement.click();
	}
	
	//Select Country Canada
	@FindBy(xpath="//option[@value='CA'][text()='Canada']")
	private WebElement SelContElement;
	public void selCountCanada(){
		SelContElement.click();
	}
	//Fill the Area
	@FindBy(xpath="//input[@id='gross_area']")
	private WebElement AreaElement;
	public void enterArea(String area){
		AreaElement.sendKeys(area);
	}
	
	//This project is Private Check Box click
	@FindBy(xpath="//input[@id='confidential']")
	private WebElement PrivateElement;
	public void checkPrivate(){
		PrivateElement.click();
	}
	//Enter Address
	@FindBy(xpath="//input[@id='street']")
	private WebElement EnterAddElement;
	public void enterAddress(String add){
		EnterAddElement.sendKeys(add);
	}
	//Enter City
	@FindBy(xpath="//input[@id='city']")
	private WebElement EnterCityElement;
	public void enterCity(String city){
		EnterCityElement.sendKeys(city);
	}
	//Click on Country
	@FindBy(xpath="//select[@id='country']")
	private WebElement ClickCountryElement;
	public void clickCountry(){
		ClickCountryElement.click();
		
	}
	//Select Country Rusia
	@FindBy(xpath="//option[text()='Russia' and @value='RU']")
	private WebElement SelRusiaElement;
	public void selRusia(){
		SelRusiaElement.click();
	}
	//Click on State of Rusia
	@FindBy(xpath="//select[@name='state']")
	private WebElement ClickStateElement;
	public void clickState(){
		ClickStateElement.click();
	}
	
	//Select State of Rusia Adigeja Republic'
	@FindBy(xpath="//select[@id='state']/option[2]")
	private WebElement SelAdigejaElement;
	public void selAdige(){
		SelAdigejaElement.click();
	}
	//Enter Zip code
	@FindBy(xpath="//input[@id='zip_code']")
	private WebElement EntZipElement;
	public void enterZip(String zip){
		EntZipElement.sendKeys(zip);
	}
	//Sign Agreement
	@FindBy(xpath="//input[@id='reg_agreement']")
	private WebElement CheckAgreemntElement;
	public void checkAgreement(){
		CheckAgreemntElement.click();
	}
	//Click on Next
	@FindBy(xpath="//button[text()='Next']")
	private WebElement ClickNextElement;
	public void checkNext(){
		ClickNextElement.click();
	}
	
	
	//Payment Module 
	//Radio Button Check option Select
	@FindBy(xpath="//input[@id='rbl_check']")
	private WebElement SelCheckOptionElement;
	public void selCheckOption(){
		SelCheckOptionElement.click();
	}
	
	//Bill-to-Party Name
	@FindBy(xpath="//input[@name='party_name']")
	private WebElement BillPartyElement;
	public void billParty(String bp){
		BillPartyElement.sendKeys(bp);
	}
	
	//Bill-to-party email
	@FindBy(xpath="//input[@name='email']")
	private WebElement BillEmailElement;
	public void billEmail(String be){
		BillEmailElement.sendKeys(be);
	}
	//Address 1
	@FindBy(xpath="//input[@placeholder='Street address']")
	private WebElement Add1Element;
	public void add1Details(String add1){
		Add1Element.sendKeys(add1);	
	}
	//Address 2
	@FindBy(xpath="//input[@id='street' and @name='street']")
	private WebElement Add2Element;
	public void add2Details(String add2){
		Add2Element.sendKeys(add2);
	}
	//City Details 
	@FindBy(xpath="//input[@id='city']")
	private WebElement CityElement;
	public void cityDetails(String city1){
		CityElement.sendKeys(city1);
	}
	
	//Country Details Click 
	@FindBy(xpath="//select[@id='country']")
	private WebElement CountryElement;
	public void clickCountry1()
	{
		CountryElement.click();
	}
	//Select Country Rusia
	@FindBy(xpath="//select[@id='country']/option[182]")
	private WebElement RusiaElement;
	public void rusiaSelect(){
		RusiaElement.click();
	}
	//Select State
	@FindBy(xpath="//select[@id='state']")
	private WebElement ClickStateRusiaElement;
	public void clickStateRusuia(){
		ClickStateRusiaElement.click();
	}
	//Select State as Aginsk Buryat Aut.di
	@FindBy(xpath="//select[@id='state']/option[3]")
	private WebElement SelectAgiElement;
	public void selAgiState(){
		SelectAgiElement.click();
	}
	//enter Zip Code
	@FindBy(xpath="//input[@id='zip_code']")
	private WebElement ZipCodeElement;
	public void enterZipCode(String zip1){
		ZipCodeElement.sendKeys(zip1);
	}
	
	//Click on Next
	@FindBy(xpath="//button[text()='Next']")
	private WebElement ClickNextElement1;
	public void clickNext(){
		ClickNextElement1.click();
	}
	
	//get Started
	@FindBy(xpath="//button[@id='create-project']")
	private WebElement ClickGetStartedElement;
	public void getStarted(){
		ClickGetStartedElement.click();
		
	}
	
	
}