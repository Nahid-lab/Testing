package com.cslsoft.KandareeLiteTestCase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.service.DriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.TouchAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.Dimension;
import io.appium.java_client.MobileBy;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;



public class Customer extends BaseClass  {
	
	
	@Test(priority = 0)
	public void Nevigate() {
		
		    
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
		 
		 driver.findElementByXPath("//android.widget.TextView[@text='Customers']").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 System.out.println("Navigate Hamburgare to Customers Profile!");

	}
	
	@Test (priority = 1)
	public void CreateCustomer() {
	 
//Create Customers.............
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/imgCustomerImage").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementById("android:id/text1").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementByXPath("//android.widget.TextView[@text='Download']").click();	
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Photo taken on Dec 13, 2020 6:52:19 PM\"]").click();
		 //driver.findElementsByClassName("android.view.ViewGroup").get(1).click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdCustomerFullName").sendKeys("Yunus SQA");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdCustomerShortName").sendKeys("Create New Customer");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llCountryArrow").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.widget.TextView[@text='canada']").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdCustomerEmail").sendKeys("cslsoft@gmail.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtCustomerPhone").sendKeys("01670979086");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdAddress").sendKeys("Uttora");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Submit\"))"));
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSubmit").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		

		 System.out.println("Create Customer Executed!");
	}
	
	@Test (priority = 2)
	public void UpdateCustomar()
	{
// Update...........................
		CallingMethods M=new CallingMethods(driver);
		String UpdateCustomer = "Create New Customer";
		M.ScrollByText(UpdateCustomer);
		M.ClickOn(UpdateCustomer);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/imgCustomerImage").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
		driver.findElementById("android:id/text1").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
	    //driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
				 
		driver.findElementByXPath("//android.widget.TextView[@text='Download']").click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Photo taken on Dec 13, 2020 6:52:42 PM\"]").click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdCustomerShortName").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdCustomerShortName").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdCustomerShortName").sendKeys("Update For Testing");
				
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llCountryArrow").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Bangladesh']").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdAddress").sendKeys("Narayanganj");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Save Changes\"))"));

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.ImageView[@content-desc=\"back\"]").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Update Customer Executed!");

	}
	
	
	
	@Test (priority = 3)
	public void DisableCustomer() {
		
		String DisableCustomer = "Update For Testing";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + DisableCustomer + "\"))"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<AndroidElement> xyz=driver.findElementsByXPath("//android.widget.TextView[@text='Update For Testing']");
		for(int i=0;i<xyz.size();i++)
		{
			if(xyz.get(i).getText().contains("Update For Testing"))
			{
				Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getCenter();
				Point point3=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getLocation();
							
				TouchAction tcD=new TouchAction(driver);
							
				tcD.longPress(longPressOptions().withPosition(PointOption.point(point2.x+100, point2.y+20))
				 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point3.x, point3.y+20)).release().perform();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
				
			}
						
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_disableMain").click();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Disable Customer Executed!");

	}
	
	@Test (priority = 4)
	public void EnableCustomer() {
		CallingMethods M=new CallingMethods(driver);
		String EnableCart = "Update For Testing";
		MobileElement element = (MobileElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"" + EnableCart  + "\"))"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<AndroidElement> xyz=driver.findElementsByXPath("//android.widget.TextView[@text='Update For Testing']");
		for(int i=0;i<xyz.size();i++)
		{
			if(xyz.get(i).getText().contains("Update For Testing"))
			{
				Point p1=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getCenter();
				Point p2=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getLocation();
				M.Swipping(p1, p2);			
				break;
				
			}
						
		}
		
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_enableMain").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Enable Customer Executed!");
	}
	
	@Test (priority = 5)
	public void DeleteCustomer() {
			String DeleteCart = "Update For Testing";
			MobileElement element = (MobileElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"" + DeleteCart + "\"))"));
			
			List<AndroidElement> xyz=driver.findElementsByXPath("//android.widget.TextView[@text='Update For Testing']");
			for(int i=0;i<xyz.size();i++)
			{
				if(xyz.get(i).getText().contains("Update For Testing"))
				{
					Point point2=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getCenter();
					Point point3=driver.findElementByXPath("//android.widget.TextView[@text='Update For Testing']").getLocation();
								
					TouchAction tcD=new TouchAction(driver);
								
					tcD.longPress(longPressOptions().withPosition(PointOption.point(point2.x+100, point2.y+20))
					 .withDuration(ofSeconds(3))).moveTo(PointOption.point(point3.x, point3.y+20)).release().perform();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;
					
				}
							
			}
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_deleteMain").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			System.out.println("Delete Customer Executed!");

		}
		
	
	
	@Test(priority = 6)
	public void SortingCustomer() {
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_filter").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/rbShortName").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llDescendingBg").click();
		 
		 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnApplyALl").click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 System.out.println("Sorting Customer Executed!");
		//driver.quit();

	}

	
	

}
