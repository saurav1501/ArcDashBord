package com.groupten.testscriptClass;
import org.testng.annotations.Test;
import com.groupten.excellibClass.ExcelLibrary;
import com.groupten.pomClass.HomePage;
import com.groupten.pomClass.ProjectRegistrationPage;
import com.groupten.utilitylibClass.BaseClass;
import com.groupten.utilitylibClass.Utills;

public class AddProjectTest extends BaseClass {
	
	ExcelLibrary xllib = new ExcelLibrary();
	@Test
	public void addTest() throws InterruptedException {

		String xlPath = "E:\\WorkSpaceNeon\\ArcDashBordMaven\\excel\\TestData.xlsx";
		
		//Login Parameter
		String sheetName = "Login";
		String em = xllib.getExcelData(xlPath, sheetName, 1, 0);
		String pwd = xllib.getExcelData(xlPath, sheetName, 1, 1);
		System.out.println(em + "\n" + pwd);
		
		//Add Project Parameter 
		String SheetProjectAdd = "AddProject";
		String pn = xllib.getExcelData(xlPath,SheetProjectAdd, 1,1);
		String ot = xllib.getExcelData(xlPath, SheetProjectAdd, 2,1);
		String oo=  xllib.getExcelData(xlPath,SheetProjectAdd,3,1);
		String oe = xllib.getExcelData(xlPath,SheetProjectAdd,4,1);
		String area = xllib.getExcelData(xlPath,SheetProjectAdd,5,1);
		String add=  xllib.getExcelData(xlPath, SheetProjectAdd, 6,1);
		String city = xllib.getExcelData(xlPath,SheetProjectAdd,7,1);
		String zip = xllib.getExcelData(xlPath, SheetProjectAdd, 8,1);
		
		//Billing By Check Parameter
		String bp=  xllib.getExcelData(xlPath,SheetProjectAdd,10,1);
		String be=xllib.getExcelData(xlPath, SheetProjectAdd, 11,1);
		String add1 = xllib.getExcelData(xlPath,SheetProjectAdd,12,1);
		String add2 = xllib.getExcelData(xlPath,SheetProjectAdd,13,1);
		String city1=  xllib.getExcelData(xlPath, SheetProjectAdd, 14,1);
		String zip1 = xllib.getExcelData(xlPath,SheetProjectAdd,15,1);
		
		
		//Home Page components 
		HomePage hp = new HomePage(driver);
		hp.clickOnLoginLink();
		hp.enterEmail(em);
		Utills.driverwait(1);
		hp.enterPassword(pwd);
		Utills.driverwait(1);
		hp.clickOnSubmitButton();
		Utills.driverwait(2);
		
		//Project Registration Module component 
		ProjectRegistrationPage pr = new ProjectRegistrationPage(driver);
		pr.clickAddProjectElement();
		Utills.driverwait(3);
		pr.enterProjectName(pn);
		Utills.driverwait(1);
		pr.clickSISelect();
		Utills.driverwait(1);
		pr.clickSpaceType();
		Utills.driverwait(1);
		pr.selectCirculationType();
		Utills.driverwait(1);
		pr.enterOwnerType(ot);
		Utills.driverwait(1);
		pr.enterOwnerOrg(oo);
		Utills.driverwait(1);
		pr.ownerEmail(oe);
		Utills.driverwait(2);
		pr.clickOwnCount();
		Utills.driverwait(2);
		pr.selCountCanada();
		Utills.driverwait(2);
		pr.enterArea(area);
		Utills.driverwait(2);
		pr.checkPrivate();
		Utills.driverwait(2);
		pr.enterAddress(add);
		Utills.driverwait(1);
		pr.enterCity(city);
		Utills.driverwait(1);
		pr.clickCountry();
		Utills.driverwait(1);
		pr.selRusia();
		Utills.driverwait(1);
		pr.clickState();
		Utills.driverwait(1);
		pr.selAdige();
		Utills.driverwait(1);
		pr.enterZip(zip);
		Utills.driverwait(1);
		pr.checkAgreement();
		Utills.driverwait(1);
		pr.checkNext();
		Utills.driverwait(7);
		
		//Payment Module components 
		pr.selCheckOption();
		Utills.driverwait(1);
		pr.billParty(bp);
		Utills.driverwait(1);
		pr.billEmail(be);
		Utills.driverwait(1);
		pr.add1Details(add1);
		Utills.driverwait(1);
		pr.add2Details(add2);
		Utills.driverwait(1);
		pr.cityDetails(city1);
		Utills.driverwait(1);
		pr.clickCountry1();
		Utills.driverwait(1);
		pr.rusiaSelect();
		Utills.driverwait(1);
		pr.clickStateRusuia();
		Utills.driverwait(1);
		pr.selAgiState();
		Utills.driverwait(1);
		pr.enterZipCode(zip1);
		Utills.driverwait(1);
		pr.clickNext();
		Utills.driverwait(10);
		
		//get started
		pr.getStarted();
		Utills.driverwait(10);
		
		
		
	}
	

}
