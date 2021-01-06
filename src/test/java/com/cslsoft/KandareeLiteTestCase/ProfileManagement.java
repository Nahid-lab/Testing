package com.cslsoft.KandareeLiteTestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ProfileManagement extends BaseClass {
	
	@Test (priority = 0)
	public void navigation() {
		CallingMethods M=new CallingMethods(driver);
		M.LoginMethods();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
	
	    driver.findElementByXPath("//android.widget.TextView[@text='View Profile']").click();
	    System.out.println("Navigate Hamburgare to View Profile!");
	}
	
	
	
	//@Test (priority = 1)
	public void updateProfilePicture() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			
			 driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[2]").click();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 driver.findElementByXPath("//android.widget.TextView[@text='Choose from Gallery']").click();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 //driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
			 driver.findElementById("android:id/button_once").click();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 //driver.findElementByXPath("//android.widget.TextView[@text='Download']").click();	
			 driver.findElementByXPath("//com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[3]").click();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			 driver.findElementByXPath("//com.sec.samsung.gallery.glview.composeView.PositionControllerBase.ThumbObject[3]").click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 //Title & Massage
			 String title=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
			 String mass=driver.findElement(By.id("bd.com.cslsoft.kandareeliteapp:id/tvMessage")).getText();
			 
			 SA.assertEquals(title,M.getstring("Automation Test Data",32,3),"Title doesn't Match");
			 SA.assertEquals(mass,M.getstring("Automation Test Data",32,2),"Massage doesn't Match");
			 
			 driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 try {
				SA.assertAll();	
				M.ScreenShots("Screenshot/Passed","update ProfilePicture");
				M.setStrData("As Expected","Automation Testcase", 88, 6);
				M.setStrData("Pass","Automation Testcase", 88, 7);

			 }catch(AssertionError e)
			 {
				M.ScreenShots("Screenshot/Failed","update ProfilePicture"); 
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 88, 6);
				M.setStrData("Fail","Automation Testcase", 88, 7);

			 }
			 
			 
				
		}catch(Exception e ){
			M.ScreenShots("Screenshot/Failed","update ProfilePicture");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 88, 6);
			M.setStrData("Fail","Automation Testcase", 88, 7);
			System.out.println("uploadProfilePicture Executed!");
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			navigation();			
			
			
		}
		
		 
		 System.out.println("uploadProfilePicture Executed!");
		
	}
	
	//@Test (priority = 2)
	public void UpdateProfileInvaliData() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			
			String testdata;
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").setValue(M.getstring("Automation Test Data", 30, 1));
			driver.hideKeyboard();
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").setValue(M.getstring("Automation Test Data", 30, 2));
			driver.hideKeyboard();

			testdata=M.getstring("Automation Test Data", 29, 3);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userGender").click();
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").setValue(M.getstring("Automation Test Data", 30, 5));
			driver.hideKeyboard();
			
			String ChangeButton = "Change";
			M.ScrollByText(ChangeButton);

			testdata=M.getstring("Automation Test Data", 29, 6);
	        driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDepartment").click();
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
			
			testdata=M.getstring("Automation Test Data", 29, 7);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDesignation").click();
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
			
			testdata=M.getstring("Automation Test Data", 29, 8);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userReportingPerson").click();
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			
			for(int i=0;i<3;i++)
			{
				String mass=driver.findElement(By.id("bd.com.cslsoft.kandareeliteapp:id/tvMessage")).getText();
				
				if(mass.equals(M.getstring("Automation Test Data",32,2))) {
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					throw new Exception("Invalid data Accept in User Profile");
				}
				else
				{
					 SA.assertEquals(mass,M.getstring("Automation Test Data",33,2),"Phone number massage doesn't valid");
					 if(i<2)
					 {
						 try {
								SA.assertAll();	
							 }catch(AssertionError e)
							 {
								 throw new Exception("Phone number massage doesn't valid");								
							 }

					 }
					 else
					 {
							M.ScreenShots("Screenshot/Passed","UpdateProfileInvaliData");	  
							M.setStrData("As Expected","Automation Testcase", 97, 6);
							M.setStrData("Pass","Automation Testcase", 97, 7);
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
							driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							break;


					 }

				}
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				Thread.sleep(5000);
				M.Scroll(2);
				int j=29;
				if (i==0)
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").setValue(M.getstring("Automation Test Data", j, 1));
					driver.hideKeyboard();
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").setValue(M.getstring("Automation Test Data", j, 2));
					driver.hideKeyboard();

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").setValue(M.getstring("Automation Test Data", j+1, 5));
					driver.hideKeyboard();

				}
				else
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").setValue(M.getstring("Automation Test Data", j+1, 1));
					driver.hideKeyboard();
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").setValue(M.getstring("Automation Test Data", j+1, 2));
					driver.hideKeyboard();
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").setValue(Integer.toString(M.getinteger("Automation Test Data", 29, 5)));
					driver.hideKeyboard();
					
				}
				
				M.ScrollByText(ChangeButton);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			}

			
			
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","UpdateProfileInvaliData");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 97, 6);
			M.setStrData("Fail","Automation Testcase", 97, 7);
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			navigation();

			
		}
		System.out.println("UpdateProfileInvaliData Executed!");
		
	}
	//@Test (priority = 3)
	public void CheckMobileField() throws Exception {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			for (int i = 1; i < 5; i++) {
				M.ScrollByText("Change");
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").setValue(M.getstring("Automation Test Data", 38, i));
				driver.hideKeyboard();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				String mass = driver.findElement(By.id("bd.com.cslsoft.kandareeliteapp:id/tvMessage")).getText();
				
				SA.assertEquals(mass, M.getstring("Automation Test Data", 33, i+2),mass+" Is not work");
					
				try {
					SA.assertAll();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				} catch (AssertionError e) {
					throw new Exception(e);
				}
			}

		}catch(Exception e) {
			M.ScreenShots("Screenshot/Failed","UpdateProfileInvaliData");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 271, 6);
			M.setStrData("Fail","Automation Testcase", 271, 7);
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			navigation();
			
		}

	}
	//@Test (priority = 4)
	public void VarifyDisableDefault() throws Exception {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			M.ScrollByText("Change");
			int change=0;
			int cancel=0;
			String str="";
			boolean tr;
			tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").isEnabled();
			if(tr==true)
			{
				change++;
				str="Change Button Doesn't Disable ";
			}

			tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCancel").isEnabled();
			if(tr==true)
			{
				cancel++;
				str=str+" "+"Cancel Button Doesn't Disable";
			}
			if(change==1 || cancel==1)
			{
				throw new Exception(str);	
			}
			M.ScreenShots("Screenshot/Passed","VarifyDisableDefault");
			M.setStrData("As Expected","Automation Testcase",272, 6);
			M.setStrData("Pass","Automation Testcase", 272, 7);
			

		}catch(Exception e) {
			M.ScreenShots("Screenshot/Failed","VarifyDisableDefault");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 272, 6);
			M.setStrData("Fail","Automation Testcase", 272, 7);
			//Thread.sleep(1000);
			//driver.quit();
			//capabilities();
			//Thread.sleep(2000);
			//navigation();
				
		}
	}

	//@Test (priority = 5)
	public void BlankFieldVerifyButton() throws Exception {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			for(int i=1;i<=3;i++)
			{
				Thread.sleep(5000);
				M.Scroll(1);
				if(i==1)
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.hideKeyboard();
				}else if(i==2)
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").setValue(M.getstring("Automation Test Data", 29, 1));
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
					driver.hideKeyboard();

				}else
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").setValue(M.getstring("Automation Test Data", 29, 2));
					
					M.ScrollByText("Change");
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
					driver.hideKeyboard();

				}

				M.ScrollByText("Change");
				int change=0;
				int cancel=0;
				String str="";
				boolean tr;
				tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").isEnabled();
				if(tr==true)
				{
					change++;
					str="Change Button Doesn't Disable ";
				}

				tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCancel").isEnabled();
				if(tr==false)
				{
					cancel++;
					str=str+" "+"Cancel Button Doesn't Enable";
				}
				if(change==1 || cancel==1)
				{
					throw new Exception(str);	
				}

				
			}
			
			M.ScreenShots("Screenshot/Passed","BlankFieldVerifyButton");
			M.setStrData("As Expected","Automation Testcase",273, 6);
			M.setStrData("Pass","Automation Testcase", 273, 7);

		}catch(Exception e) {
			M.ScreenShots("Screenshot/Failed","BlankFieldVerifyButton");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 273, 6);
			M.setStrData("Fail","Automation Testcase", 273, 7);
				
		}
	}
	
	//@Test (priority = 6)
	public void VarifyDisableToEnable() throws Exception {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			M.ScrollByText("Change");
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").setValue(Integer.toString(M.getinteger("Automation Test Data", 29, 5)));
			driver.hideKeyboard();

			int change=0;
			int cancel=0;
			String str="";
			boolean tr;
			tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").isEnabled();
			if(tr==false)
			{
				change++;
				str="Change Button Doesn't Enable ";
			}

			tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCancel").isEnabled();
			if(tr==false)
			{
				cancel++;
				str=str+" "+"Cancel Button Doesn't Enable";
			}
			if(change==1 || cancel==1)
			{
				throw new Exception(str);	
			}
			M.ScreenShots("Screenshot/Passed","VarifyDisableToEnable");
			M.setStrData("As Expected","Automation Testcase",274, 6);
			M.setStrData("Pass","Automation Testcase", 274, 7);
			

		}catch(Exception e) {
			M.ScreenShots("Screenshot/Failed","VarifyDisableToEnable");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 274, 6);
			M.setStrData("Fail","Automation Testcase", 274, 7);
			//Thread.sleep(1000);
			//driver.quit();
			//capabilities();
			//Thread.sleep(2000);
			//navigation();
				
		}
	}
	public void UpdateProfileData(int i) throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		
		Thread.sleep(5000);
		M.Scroll(1);
		Thread.sleep(1000);
		String testdata;
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").setValue(M.getstring("Automation Test Data", i, 1));
		driver.hideKeyboard();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").setValue(M.getstring("Automation Test Data", i, 2));
		driver.hideKeyboard();

		testdata=M.getstring("Automation Test Data", i, 3);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userGender").click();
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").setValue(M.getstring("Automation Test Data", i, 5));
		driver.hideKeyboard();
		
		M.ScrollByText("Change");
		
		testdata=M.getstring("Automation Test Data", i, 6);
        driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDepartment").click();
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
		
		testdata=M.getstring("Automation Test Data", i, 7);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDesignation").click();
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 
		
		testdata=M.getstring("Automation Test Data", i, 8);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userReportingPerson").click();
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click(); 

	}
	
	
	//@Test (priority = 7)
	public void UpdateProfileValidData() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		try {
			
			UpdateProfileData(29);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			 M.ScreenShots("Screenshot/Passed","Update ProfileInfo");
			  
			 M.setStrData("As Expected","Automation Testcase", 97, 6);
			 M.setStrData("Pass","Automation Testcase", 97, 7);
			
			
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","Update ProfileInfo");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 97, 6);
			M.setStrData("Fail","Automation Testcase", 97, 7);
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			navigation();

		}
		System.out.println("updateProfileInfo Executed!");
		//driver.quit();
	}
	
	
	public void VarifyProfileData(int i) throws IOException, InterruptedException {
		SoftAssert SA = new SoftAssert();
		CallingMethods M = new CallingMethods(driver);

		String testdata;
		Thread.sleep(5000);
		M.Scroll(1);

		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 1), "FullName  Doesn't Match");

		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 2), "ShortName Doesn't Match");

		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtGender").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 3), "Gender Doesn't Match");

		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtSignUpUserEmail").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 4), "SignUp User Email Doesn't Match");

		M.ScrollByText("Change");
		
		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 5), "Phone Number Doesn't Match");

		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtDepartment").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 6), "Department Doesn't Match");

		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdDesignation").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 7), "Department Doesn't Match");

		testdata = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtReportingPerson").getText();
		SA.assertEquals(testdata, M.getstring("Automation Test Data", i, 8), "Department Doesn't Match");

		SA.assertAll();
		// driver.quit();
	}
	
	//@Test (priority = 8)
	public void VarifyUpdateData() throws IOException, InterruptedException {
		SoftAssert SA=new SoftAssert();
		CallingMethods M=new CallingMethods(driver);

		try {
			VarifyProfileData(29);
			M.ScreenShots("Screenshot/Passed", "Update ProfileInfo");
			M.setStrData("As Expected", "Automation Testcase",275, 6);
			M.setStrData("Pass", "Automation Testcase", 275, 7);

		} catch (AssertionError e) {
			M.ScreenShots("Screenshot/Failed","Update ProfileInfo");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 275, 6);
			M.setStrData("Fail","Automation Testcase",275, 7);
			
		}
		System.out.println("VarifyUpdateData Executed!");
		//driver.quit();
	}
	
	
	//@Test (priority = 9)
	public void SaveButtonDenieAfterchange() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		try {
			
			UpdateProfileData(36);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnChange").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			try {
				VarifyProfileData(36);

				// nevigate
				Thread.sleep(5000);
				M.BackFun(1);
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementByXPath("//android.widget.TextView[@text='View Profile']").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				VarifyProfileData(29);

				M.ScreenShots("Screenshot/Passed", "SaveButtonDenieAfterchange");
				M.setStrData("As Expected", "Automation Testcase", 276, 6);
				M.setStrData("Pass", "Automation Testcase", 276, 7);

			} catch (AssertionError e) {
				throw new Exception(e);
			}
			
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","SaveButtonDenieAfterchange");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 276, 6);
			M.setStrData("Fail","Automation Testcase", 276, 7);
			
		}
		System.out.println("SaveButtonDenieAfterchange Executed!");
		//driver.quit();
	}
	
	//@Test (priority = 10)
	public void CancelDenieAfterchange() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		try {
			UpdateProfileData(36);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCancel").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			try {
				VarifyProfileData(36);

				// nevigate
				Thread.sleep(5000);
				M.BackFun(1);
				Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementByXPath("//android.widget.TextView[@text='View Profile']").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				VarifyProfileData(29);

				M.ScreenShots("Screenshot/Passed", "CancelDenieAfterchange");
				M.setStrData("As Expected", "Automation Testcase", 277, 6);
				M.setStrData("Pass", "Automation Testcase", 277, 7);

			} catch (AssertionError e) {
				throw new Exception(e);
			}

		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","CancelDenieAfterchange");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 277, 6);
			M.setStrData("Fail","Automation Testcase", 277, 7);
			
		}
		System.out.println("CancelDenieAfterchange Executed!");
		//driver.quit();
	}
	
	
	//@Test (priority = 11)
	public void CancelAfterchange() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		try {
			UpdateProfileData(36);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCancel").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			try {
				VarifyProfileData(29);

				M.ScreenShots("Screenshot/Passed", "CancelDenieAfterchange");
				M.setStrData("As Expected", "Automation Testcase", 278, 6);
				M.setStrData("Pass", "Automation Testcase", 278, 7);

			} catch (AssertionError e) {
				throw new Exception(e);
			}

		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","CancelDenieAfterchange");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 278, 6);
			M.setStrData("Fail","Automation Testcase", 278, 7);
			
		}
		System.out.println("CancelAfterchange Executed!");
		//driver.quit();
	}
	@Test (priority = 12)
	public void BackButtonWarningMass() throws IOException {
		CallingMethods M=new CallingMethods(driver);
		try {
			UpdateProfileData(36);
			Thread.sleep(5000);
			M.BackFun(1);
			Thread.sleep(2000);
			String mass=driver.findElement(By.id("bd.com.cslsoft.kandareeliteapp:id/tvMessage")).getText();
			if(mass.contentEquals(M.getstring("Automation Test Data", 34, 2)))
			{
				M.ScreenShots("Screenshot/Passed", "BackButtonWarningMass");
				M.setStrData("As Expected", "Automation Testcase", 279, 6);
				M.setStrData("Pass", "Automation Testcase", 279, 7);

			}
			else
			{
				throw new Exception("Cancel massage doesn't match");
			}
			
		}catch(Exception e) {
			M.ScreenShots("Screenshot/Failed","BackButtonWarningMass");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 279, 6);
			M.setStrData("Fail","Automation Testcase", 279, 7);

		}

	}
	
}
