package com.groupten.utilitylibClass;

import java.io.File;
import java.net.*;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

public class Utills {
	
	public static WebDriver driver;
	
	public static void impliciteWait(int timeInsec){
		
		Reporter.log("waiting for page to load...");
		try{
		driver.manage().timeouts().implicitlyWait(timeInsec, TimeUnit.SECONDS);
		Reporter.log("Page is loaded");
		}
		catch(Throwable error){
			Reporter.log("Timeout for Page Load Request to complete after "+ timeInsec + " seconds");
			Assert.assertTrue(false, "Timeout for page load request after "+timeInsec+" second");
		}
	}
	
	
	public static void driverwait(int timeToWaitInSec) throws InterruptedException{
		Reporter.log("waiting for "+timeToWaitInSec+" seconds...");
		
		Thread.sleep(timeToWaitInSec*1000);
	}
	
	public static void expliciteWait(WebElement element, int timeToWaitInSec) {
		WebDriverWait wait = new WebDriverWait(driver, timeToWaitInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public static String captureScreenShot(WebDriver driver, String screenshortName)
	{
		try{
		    TakesScreenshot ts=(TakesScreenshot)driver; 
		    File source= ts.getScreenshotAs(OutputType.FILE);
		    // now copy the  screenshot to desired location using copyFile method
			String dest="E:\\WorkSpaceNeon\\ArcDashBordMaven\\ScreenShots\\" +screenshortName+".png";
			File destination = new File(dest);
			FileUtils.copyFile(source,destination);
			System.out.println("Screenshot taken");
			return dest;
			
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot"+e.getMessage());
			return e.getMessage();
			
		}
		
	}
	public static void highLightElement(WebDriver driver, WebElement element)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 

	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {

	System.out.println(e.getMessage());
	} 

	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element); 

	}
	
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
	}


}
