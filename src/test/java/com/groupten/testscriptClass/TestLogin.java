package com.groupten.testscriptClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.groupten.excellibClass.ExcelLibrary;
import com.groupten.pomClass.HomePage;
import com.groupten.utilitylibClass.BaseClass;
import com.groupten.utilitylibClass.Utills;
import com.relevantcodes.extentreports.*;
public class TestLogin extends BaseClass {

	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	ExcelLibrary xllib = new ExcelLibrary();
	@Test
	public void addTest() throws InterruptedException {

		String xlPath = "E:\\WorkSpaceNeon\\ArcDashBordMaven\\excel\\TestData.xlsx";
		String sheetName = "Login";
		String em = xllib.getExcelData(xlPath, sheetName, 1, 0);
		String pwd = xllib.getExcelData(xlPath, sheetName, 1, 1);
		System.out.println(em + "\n" + pwd);
		
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLoginLink();
		hp.enterEmail(em);
		Utills.driverwait(1);
		hp.enterPassword(pwd);
		Utills.driverwait(1);
		hp.clickOnSubmitButton();
		Utills.driverwait(2);
		
		

	}
	/*@AfterMethod
	public void afterMethod(ITestResult result)
	{
		report= new ExtentReports("E:\\WorkSpaceNeon\\ArcDashBordMaven\\ExtendedReport\\ArcLogin.html");
		logger=report.startTest("VerifyBlogTitle2");
		logger.log(LogStatus.INFO, "Browser started ");
		logger.log(LogStatus.INFO, "Application is up and running");
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("ArcDashbord"));  
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
		}*/


	}



