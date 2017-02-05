package com.groupten.testscriptClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.groupten.Listener.Retery;
import com.groupten.excellibClass.ExcelLibrary;
import com.groupten.pomClass.DashboardPage;
import com.groupten.pomClass.HomePage;
import com.groupten.utilitylibClass.*;


public class AddMemberTest extends BaseClass {

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
		
		SoftAssert assertion = new SoftAssert();
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
		assertion.assertAll();
		
		 
	}
	@Test(retryAnalyzer=Retery.class)
	  public void verifyTitle()
    { 
  	  String Actualtext=driver.findElement(By.xpath(".//*[@id='banner-home']/div/h2")).getText();
  	  Assert.assertTrue(driver.getTitle().contains("Arc"));
  	  System.out.println("Title Verify");
  	  Assert.assertEquals("Arc DashBord",driver.getTitle());
  	  Assert.assertEquals("Gooogle", driver.getTitle(), "Strings are not matching");
  	  Assert.assertEquals(Actualtext, "Tuesday, 28 January 2016", "Title Verification is failed ");
  	  System.out.println("Hard Assertion -> 2nd pagetext assertion executed");   
  	   
    }
	
}
