package com.cslsoft.KandareeLiteTestCase;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.touch.offset.PointOption;

public class LibraryManagement extends BaseClass  {
	
	@Test (priority = 0)
	public void VerifyLibraryView() throws IOException {
		CallingMethods M=new CallingMethods(driver);
		M.LoginMethods();

		try {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
			
			driver.findElementByXPath("//android.widget.TextView[@text='Library']").click();

			
			M.ScreenShots("Screenshot/Passed","Verify Library View");
			  
		    M.setStrData("As Expected","Automation Testcase", 196, 6);
			M.setStrData("Pass","Automation Testcase", 196, 7);

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","Verify Library View");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 196, 6);
			M.setStrData("Fail","Automation Testcase", 196, 7);
		}
		System.out.println("Navigate Hamburgare to Library!");
		
		}
	
	
	
	@Test (priority = 1)
	public void VerifyLibraryEntityType() throws IOException {

		CallingMethods M=new CallingMethods(driver);
		
		try {
		    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_libraryDepartment").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Bank Loan Type']").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
			
			M.ScreenShots("Screenshot/Passed","Verify Library Entity Type");
			  
		    M.setStrData("As Expected","Automation Testcase", 201, 6);
			M.setStrData("Pass","Automation Testcase", 201, 7);

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","Verify Library Entity Type");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 201, 6);
			M.setStrData("Fail","Automation Testcase", 201, 7);
		}
		
		System.out.println("Verify Library Entity Type Executed!");
		
	}
	
	@Test (priority = 2)
	public void AddNewLibrary() throws IOException { 
		CallingMethods M=new CallingMethods(driver);
		
		try {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_libraryValues").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_libraryValues").setValue("Create A New Library");
			driver.hideKeyboard();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			//Successful Added Message
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			
			M.ScreenShots("Screenshot/Passed", "Add New Library");

			M.setStrData("As Expected", "Automation Testcase", 210, 6);
			M.setStrData("Pass", "Automation Testcase", 210, 7);

		} catch (Exception e) {

			M.ScreenShots("Screenshot/Failed", "Add New Library");
			String ErMass = e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 210, 6);
			M.setStrData("Fail", "Automation Testcase", 210, 7);
		}
		System.out.println("Add New Library Entity Value Executed!");
	
	}
	
	@Test (priority = 3)
	public void librarySearch() throws IOException {
		CallingMethods M=new CallingMethods(driver);
		
		try {
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_search").click();
			driver.hideKeyboard();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("android:id/search_src_text").setValue("Project Loan");

			M.ScreenShots("Screenshot/Passed", "Search library");

			M.setStrData("As Expected", "Automation Testcase", 219, 6);
			M.setStrData("Pass", "Automation Testcase", 219, 7);

		} catch (Exception e) {

			M.ScreenShots("Screenshot/Failed", "Search library");
			String ErMass = e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 219, 6);
			M.setStrData("Fail", "Automation Testcase", 219, 7);
		}
	
		
		
		System.out.println("Search library Executed!");
		
	}
	
	
	
	
	//@Test (priority = 3)
	public void addAttribute() {
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_libraryValues").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_libraryValues").setValue("Create A New Library");
		driver.hideKeyboard();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		//Successful Added Message
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("AddAttribute Executed!");
		
		//Need to check if it added in list?
	}
		
	//@Test (priority = 4)
	public void editAttribute() {
		
		String EditCart = "Create A New Library";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + EditCart + "\"))"));
		
		List<AndroidElement> xyz=driver.findElementsByXPath("//android.widget.TextView");
		for(int i=0;i<xyz.size();i++)
		{
			if(xyz.get(i).getText().contains("Create A New Library"))
			{
				Point point1=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_libraryImage").getCenter();
				Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Create A New Library']").getCenter();
							
				TouchAction tcD=new TouchAction(driver);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
				tcD.longPress(longPressOptions().withPosition(PointOption.point(point1.x, point1.y))
				 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point2.x+100, point2.y)).release().perform();
				
				break;
				
			}
						
		}
		
		//Swipe to Left Code 
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_editMain").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_libraryValues").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_libraryValues").setValue("A New Update for Testing Purpose");
		driver.hideKeyboard();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Successful Edited Message
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		System.out.println("editAttribute Executed!");
	}
	
	
	//@Test (priority = 5)
	public void disableAttribute() {
		
		String DisCart = "A New Update for Testing Purpose";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + DisCart + "\"))"));
		
		List<AndroidElement> xyz=driver.findElementsById("bd.com.cslsoft.kandareeliteapp:id/textView");
		
		for(int i=0;i<xyz.size();i++)
		{
			String t=xyz.get(i).getText();
			
			if(t.contains("A New Update for Testing Purpose"))
			{				
				Point point1=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_libraryImage").getCenter();
				Point point2=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/textView").getCenter();
											
				TouchAction tcD=new TouchAction(driver);
							
				tcD.longPress(longPressOptions().withPosition(PointOption.point(point1.x, point1.y))
				 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point2.x+100, point2.y)).release().perform();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			}
			
						
		}

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_disableMain").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		System.out.println("Disable Attribute Executed!");
		
		
	}	
	
	//@Test (priority = 6)
	public void EnableAttrivute() {
		String DisCart = "A New Update for Testing Purpose";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + DisCart + "\"))"));
		
		List<AndroidElement> xyz=driver.findElementsById("bd.com.cslsoft.kandareeliteapp:id/textView");
		
		for(int i=0;i<xyz.size();i++)
		{
			String t=xyz.get(i).getText();
			
			if(t.contains("A New Update for Testing Purpose"))
			{				
				Point point1=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_libraryImage").getCenter();
				Point point2=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/textView").getCenter();
							
				TouchAction tcD=new TouchAction(driver);
							
				tcD.longPress(longPressOptions().withPosition(PointOption.point(point1.x, point1.y))
				 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point2.x+100, point2.y)).release().perform();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			}
			
						
		}

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_enableMain").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		System.out.println("Enable Attribute Executed!");
		
		
	}
	
	

	//@Test (priority = 8)
	public void deleteAttribute() {
		
		String DisCart = "A New Update for Testing Purpose";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + DisCart + "\"))"));
		
		List<AndroidElement> xyz=driver.findElementsById("bd.com.cslsoft.kandareeliteapp:id/textView");
		
		for(int i=0;i<xyz.size();i++)
		{
			String t=xyz.get(i).getText();
			
			if(t.contains("A New Update for Testing Purpose"))
			{
				
				Point point1=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/img_libraryImage").getCenter();
				Point point2=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/textView").getCenter();
							
				TouchAction tcD=new TouchAction(driver);
							
				tcD.longPress(longPressOptions().withPosition(PointOption.point(point1.x, point1.y+20))
				 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point2.x+100, point2.y)).release().perform();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
			}
			
						
		}
		
		
		//Swipe to Left Code 
				
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_deleteMain").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//Successful Deleted Message
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("deleteAttribute Executed!");
		//driver.quit();
		
	}


	

}
