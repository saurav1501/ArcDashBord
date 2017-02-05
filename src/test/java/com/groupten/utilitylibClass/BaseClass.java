package com.groupten.utilitylibClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import com.groupten.excellibClass.ExcelLibrary;


public class BaseClass {

	protected WebDriver driver;
	
	@BeforeClass
	public void preConditionTest() {
		ExcelLibrary xllib = new ExcelLibrary();
		String xlPath = "E:\\WorkSpaceNeon\\ArcDashBordMaven\\excel\\TestData.xlsx";
		String sheetName = "Config";
		String browser = xllib.getExcelData(xlPath, sheetName, 2, 0);
		String url = xllib.getExcelData(xlPath, sheetName, 1, 1);
		if(browser.equals("firefox") || browser.equals("FIREFOX")){
			System.setProperty("webdriver.gecko.driver","E:\\WorkSpaceNeon\\ArcDashBordMaven\\DriversFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equals("chrome") || browser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "E:\\WorkSpaceNeon\\ArcDashBordMaven\\DriversFiles\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equals("ie") || browser.equals("IE")){
			System.setProperty("webdriver.ie.driver","E:\\WorkSpaceNeon\\ArcDashBordMaven\\DriversFiles\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
	}
     
     
 
}
