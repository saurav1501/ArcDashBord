package com.groupten.testscriptClass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.groupten.excellibClass.ExcelLibrary;
import com.groupten.pomClass.HomePage;
import com.groupten.utilitylibClass.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class AddMemberTest2 extends BaseClass {
	ExtentReports report;
	ExtentTest logger; 
	ExcelLibrary xllib = new ExcelLibrary();
	@Test
	public void addTest() throws InterruptedException {

		String xlPath = "E:\\WorkSpaceNeon\\ArcDashBordMaven\\excel\\TestData.xlsx";
		String sheetName = "Login";
		String sheetName1 = "Member";
		String em = xllib.getExcelData(xlPath, sheetName, 1, 0);
		String pwd = xllib.getExcelData(xlPath, sheetName, 1, 1);
		System.out.println(em + "\n" + pwd);
		String tm = xllib.getExcelData(xlPath, sheetName1, 0, 0);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLoginLink();
		hp.enterEmail(em);
		Utills.driverwait(1);
		hp.enterPassword(pwd);
		Utills.driverwait(1);
		hp.clickOnSubmitButton();
		Utills.driverwait(2);
		
		  Assert.assertFalse(false);
	  	  Assert.assertFalse(false);
	  	  Assert.assertFalse(false);
		report= new ExtentReports("E:\\WorkSpaceNeon\\ArcDashBordMaven\\ExtendedReport\\ArcLogin.html");
		logger=report.startTest("VerifyBlogTitle2");
		logger.log(LogStatus.INFO, "Browser started ");
		logger.log(LogStatus.INFO, "Application is up and running");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("ArcDashbord"));  
		
		/*SoftAssert assertion = new SoftAssert();
		DashboardPage dp=new DashboardPage(driver);
		dp.clickOnBangalore();
		Utills.driverwait(8);
		dp.clickOnManage();
		Utills.driverwait(3);
		dp.clickOnTeam();
		Utills.driverwait(3);
		dp.enterEmail(tm);
		Utills.driverwait(3);
		dp.clickOnAdd();
		Utills.driverwait(4);
		dp.clickOnAccount();
		Utills.driverwait(2);
		dp.clickOnsignOut();
		Utills.driverwait(2);
		System.out.println("Logout Successfully");
		assertion.assertAll();*/
		
		 
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		logger.log(LogStatus.PASS, "Title verified");
			if(result.getStatus()==ITestResult.FAILURE)
			{
			 
			String screenshot_path=Utills.captureScreenShot(driver, result.getName());
			String image= logger.addScreenCapture(screenshot_path);
			logger.log(LogStatus.FAIL, "Title verification", image); 
			System.out.println("image taken");
			}
			report.endTest(logger);
			report.flush(); 
			driver.get("E:\\WorkSpaceNeon\\ArcDashBordMaven\\ExtendedReport\\ArcLogin.html");
			driver.close();
		}

	
	@Test(priority=1)
	
	public void verifyTitle()
    { 
	  SoftAssert assertion = new SoftAssert ();
  	  String Actualtext=driver.findElement(By.xpath(".//*[@id='banner-home']/div/h2")).getText();
  	  Assert.assertTrue(driver.getTitle().contains("Arc"));
  	  System.out.println("Title Verify");
  	  Assert.assertEquals(false, false);
  	  Assert.assertFalse(false);
  	  Assert.assertFalse(false);
  	  Assert.assertFalse(false);
  	  Assert.assertEquals("Arc DashBord",driver.getTitle());
  	  Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
  	  Assert.assertEquals(Actualtext, "Tuesday, 28 January 2016", "Title Verification is failed ");
  	  System.out.println("Hard Assertion -> 2nd pagetext assertion executed");   
  	  assertion.assertAll();
    }
}
