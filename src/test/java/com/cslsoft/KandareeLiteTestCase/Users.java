package com.cslsoft.KandareeLiteTestCase;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.examples.CreateUserDefinedDataFormats;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cslsoft.KandareeLiteTestCase.CallingMethods;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Users extends BaseClass {

	@Test(priority = 0)
	public void nevigate() {
		
		CallingMethods M=new CallingMethods(driver);
		M.LoginMethods();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_nav_menu").click();
		 
	    driver.findElementByXPath("//android.widget.TextView[@text='Users']").click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Navigate Hamburgare to User");

	}
	
	public void DataFillUp(int i) throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		String testdata;
		//FullName
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", i, 1));
		driver.hideKeyboard();
		
		//ShortName
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").sendKeys(M.getstring("Automation Test Data", i, 2));
		driver.hideKeyboard();
		
		//UserGender
		testdata=M.getstring("Automation Test Data", i, 3);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userGender").click();
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Email
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").sendKeys(M.getstring("Automation Test Data", i, 4));
		driver.hideKeyboard();
	
		//Phone Number
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").sendKeys(M.getstring("Automation Test Data", i, 5));
		driver.hideKeyboard();
		
		//Department
		testdata=M.getstring("Automation Test Data", i, 6);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDepartment").click();
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(1000);
		List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
		for(int j=0;j<xyz.size();j++)
		{
			if(xyz.get(j).getText().contains("Warning"))
			{
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;				
			}
						
		}
		
		
		//Designation
		testdata=M.getstring("Automation Test Data", i, 7);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDesignation").click();
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		M.ScrollByText("Create");
		
		//ReportingPerson
		testdata=M.getstring("Automation Test Data", i, 8);
		
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userReportingPerson").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		List<AndroidElement> xyz2=driver.findElementsByClassName("android.widget.TextView");
		for(int j=0;j<xyz2.size();j++)
		{
			if(xyz2.get(j).getText().contains("Warning"))
			{
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;				
			}
						
		}
		
		//UserType
		testdata=M.getstring("Automation Test Data", i, 9);
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userTypeDropDown").click();
		M.ScrollByText("Top Mgmt.");
		List<AndroidElement> xyz1=driver.findElementsByClassName("android.widget.TextView");
		for(int j=0;j<xyz1.size();j++)
		{
			if(xyz1.get(j).getText().contains(testdata))
			{
				driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
				
			}
						
		}

	}
	
	
	//@Test(priority = 1)
	public void BlankFieldDisableCreateButton() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		try {
			String str="";
			int count=0;
			for(int i=0;i<=9;i++)
			{
				boolean tr;
				String testdata;
				Thread.sleep(1000);
				String text="Create";
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Full Field Blank
				if(i==0)
				{
					M.ScrollByText(text);
					tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").isEnabled();
					if(tr==true)
					{
						count++;
						str=str+"All Fields are Blank But Create Button is Enable";
						
					}
					Thread.sleep(5000);
					M.Scroll(1);
					i++;
	
				}
				//FullName Blank
				if(i!=1)
				{
					//FullName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", 43, 1));
					driver.hideKeyboard();
					
				}
				
				//shortNameBlank	
				if(i!=2)
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").sendKeys(M.getstring("Automation Test Data", 43, 2));
					driver.hideKeyboard();
					
				}
				//UserGender
				if(i!=3)
				{
					testdata=M.getstring("Automation Test Data", 43, 3);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userGender").click();
					driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
				}
				//Email
				if(i!=4)
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").sendKeys(M.getstring("Automation Test Data", 43, 4));
					driver.hideKeyboard();
				
				}
				
				//Phone Number
				if(i!=5)
				{				
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").sendKeys(M.getstring("Automation Test Data", 43, 5));
					driver.hideKeyboard();

				}
				
				//Department
				if(i!=6)
				{
					
					testdata=M.getstring("Automation Test Data", 43, 6);
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDepartment").click();
					driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
					for(int j=0;j<xyz.size();j++)
					{
						if(xyz.get(j).getText().contains("Warning"))
						{
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
							driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							break;				
						}
									
					}

				}
				
				//Designation
				if(i!=7)
				{
					testdata=M.getstring("Automation Test Data", 43, 7);
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDesignation").click();
					driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				}
				M.ScrollByText("Create");
				//ReportingPerson
				if(i!=8)
				{	
					
					testdata=M.getstring("Automation Test Data", 43, 8);
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userReportingPerson").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					List<AndroidElement> xyz2=driver.findElementsByClassName("android.widget.TextView");
					for(int j=0;j<xyz2.size();j++)
					{
						if(xyz2.get(j).getText().contains("Warning"))
						{
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
							driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							break;				
						}
									
					}

				}
				//UserType
				if(i!=9)
				{
					//UserType
					testdata=M.getstring("Automation Test Data", 43, 9);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userTypeDropDown").click();
					M.ScrollByText("Top Mgmt.");
					List<AndroidElement> xyz1=driver.findElementsByClassName("android.widget.TextView");
					for(int j=0;j<xyz1.size();j++)
					{
						if(xyz1.get(j).getText().contains(testdata))
						{
							driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
							driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
							driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							break;
							
						}
									
					}

				}

				tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").isEnabled();
				if(tr==true)
				{
					System.out.println(i);
					count++;
					if(i==1)
						str=str+"\n"+"Full Name Field is Blank But Create Button is Enable";
					else if(i==2)
						str=str+"\n"+"Short Name Field is Blank But Create Button is Enable";
					else if(i==3)
						str=str+"\n"+"Gender Field is Blank But Create Button is Enable";
					else if(i==4)
						str=str+"\n"+"Email Field is Blank But Create Button is Enable";
					else if(i==5)
						str=str+"\n"+"Phone Number Field is Blank But Create Button is Enable";
					else if(i==6)
						str=str+"\n"+"Department Field is Blank But Create Button is Enable";
					else if(i==7)
						str=str+"\n"+"Designation Field is Blank But Create Button is Enable";
					else if(i==8)
						str=str+"\n"+"ReportingPerson Field is Blank But Create Button is Enable";
					else if(i==9)
						str=str+"\n"+"UserType Field is Blank But Create Button is Enable";
						
				}
				if(i!=9)
				{
					Thread.sleep(1000);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
					Thread.sleep(100);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				}
				
			}
			if(count>=1)
			{
				throw new Exception(str);	
			}
			
			M.ScreenShots("Screenshot/Passed","BlankFieldDisableCreateButton");
			
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
			Thread.sleep(100);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			  
		    M.setStrData("As Expected","Automation Testcase", 280, 6);
			M.setStrData("Pass","Automation Testcase", 280, 7);

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","BlankFieldDisableCreateButton");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 280, 6);
			M.setStrData("Fail","Automation Testcase", 280, 7);
			
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			nevigate();

		}
		
		System.out.println("BlankFieldVerifyCreateButton Executed!");

	}
	
	//@Test(priority = 2)
	public void CreatebyInvalidUserName() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);		
		try {
			String str ="";
			int count=0;
			for(int i=1;i<=3;i++)
			{ 
				String title;
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				DataFillUp(45);

				if(i==1)
				{
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					title=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
					
					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						count++;
						System.out.println("dfghjkl");
						str=str+"Invalid FullName & ShortName Accept";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
					}else
					{
						i++;
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();

					}

				}
				if(i==2)
				{
					Thread.sleep(5000);
					M.Scroll(1);

					//FullName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", 43, 1));
					driver.hideKeyboard();
					
					//Email
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").sendKeys(M.getstring("Automation Test Data", 45, 11));
					driver.hideKeyboard();

					M.ScrollByText("Create");				
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					title=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
					String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
					M.setStrData(mass,"Automation Test Data", 53, 5);
					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						count++;
						str=str+"\n"+"Invalid ShortName Accept";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

						
					}else
					{
						i++;
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();

						Thread.sleep(5000);
						M.Scroll(1);

						//FullName
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", 45, 1));
						driver.hideKeyboard();

					}

				}
				if(i==3)
				{	

					//shortName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").sendKeys(M.getstring("Automation Test Data", 43, 2));
					driver.hideKeyboard();
					
					//Email
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").sendKeys(M.getstring("Automation Test Data", 45, 12));
					driver.hideKeyboard();

					M.ScrollByText("Create");
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					title=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
					String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
					M.setStrData(mass,"Automation Test Data", 53, 5);
					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						count++;
						str=str+"\n"+"Invalid ShortName Accept";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					}else
					{
						
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();

						Thread.sleep(1000);
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
						Thread.sleep(5000);
						M.ScrollDwon(1);

					}

				}

			}
			if(count>=1)
			{
				throw new Exception(str);	
			}
			

			M.ScreenShots("Screenshot/Passed","CreatebyInvalidUserName");
			  
		    M.setStrData("As Expected","Automation Testcase", 281, 6);
			M.setStrData("Pass","Automation Testcase", 281, 7);

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","CreatebyInvalidUserName");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 281, 6);
			M.setStrData("Fail","Automation Testcase", 281, 7);
			
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
		 	nevigate();

		}
		
		System.out.println("Create by Invalid User Name Executed!");
	}
	
	//@Test(priority = 3)
	public void EmailVerification() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		
		try {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			int count=0;
			String str="";
			DataFillUp(43);
			for(int i=1;i<=1;i++)
			{
				Thread.sleep(5000);
				M.Scroll(1);
				
				//Email
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").clear();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").sendKeys(M.getstring("Automation Test Data", 47, i));
				driver.hideKeyboard();
				
				Thread.sleep(100);
				M.ScrollByText("Create");
				
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
				String title = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
				if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
				{
					count++;
					str=str+"\n"+i+" .Invalid Email Accept";
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					DataFillUp(43);

				}else if(mass.contentEquals(M.getstring("Automation Test Data", 55, 3)))
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				

			}
			if(count>0)
			{
				throw new Exception(str);	
			}
			
			M.ScreenShots("Screenshot/Passed","User Email Verification");		  
		    M.setStrData("As Expected","Automation Testcase", 282, 6);
			M.setStrData("Pass","Automation Testcase", 282, 7);

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","User Email Verification");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 282, 6);
			M.setStrData("Fail","Automation Testcase", 282, 7);
			
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			nevigate();

		}
		
		System.out.println("Email Verification Executed!");
	}

	//@Test(priority = 4)
	public void MobileNumberVerification() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		
		try {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			int count=0;
			String str="";
			DataFillUp(43);
			for(int i=1;i<=6;i++)
			{
				Thread.sleep(5000);
				M.Scroll(1);
				int j=i+1;
				if(i==2 || i==3 || i==4 )
				{
					//Email
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").sendKeys(M.getstring("Automation Test Data", 50, i));
					driver.hideKeyboard();

				}

				//Phone Number
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").sendKeys(M.getstring("Automation Test Data", 49, i));
				driver.hideKeyboard();
			
				Thread.sleep(100);
				M.ScrollByText("Create");
				
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
				String title = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
				if(mass.contentEquals(M.getstring("Automation Test Data", 57, j)))
				{
					if(i==2 || i==3 )
					{
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						DataFillUp(43);

					}
					else
					{
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					}
				}
				else {
					count++;
					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						str=str+"\n"+i+" .Accept invalid Number";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						DataFillUp(43);
						
					}else
					{
						str=str+"\n"+i+" ."+mass;
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/noButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					}

				}
				

			}
			if(count>0)
			{
				throw new Exception(str);	
			}

			
			M.ScreenShots("Screenshot/Passed","User Email Verification");		  
		    M.setStrData("As Expected","Automation Testcase", 283, 6);
			M.setStrData("Pass","Automation Testcase", 283, 7);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","User Email Verification");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 283, 6);
			M.setStrData("Fail","Automation Testcase", 283, 7);
			
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			nevigate();

		}
		
		System.out.println("CreateUser Executed!");
	}
	//@Test(priority = 5)
		public void CreateUser() throws IOException, InterruptedException {
			CallingMethods M=new CallingMethods(driver);
			
			try {
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/floting_action_view").click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
				DataFillUp(43);
				
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnCreate").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				M.ScreenShots("Screenshot/Passed","Create User");
				  
			    M.setStrData("As Expected","Automation Testcase", 123, 6);
				M.setStrData("Pass","Automation Testcase", 123, 7);

				
			}catch(Exception e) {
				
				M.ScreenShots("Screenshot/Failed","Create User");
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 123, 6);
				M.setStrData("Fail","Automation Testcase", 123, 7);
				
				Thread.sleep(1000);
				driver.quit();
				capabilities();
				Thread.sleep(2000);
				nevigate();

			}
			
			System.out.println("CreateUser Executed!");
		}
	
	//@Test(priority = 6)
	public void VerifyCreatedUsers() throws InterruptedException, IOException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			M.ScrollByText("Syed Yunus");
			
			List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
			for(int i=0;i<xyz.size();i++)
			{
				if(xyz.get(i).getText().contains("Syed Yunus"))
				{
					driver.findElementByXPath("//android.widget.TextView[@text='Syed Yunus']").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;
					
				}
							
			}
			//Full Name
			String FullName=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").getText();
			SA.assertEquals(FullName,M.getstring("Automation Test Data",43,1),"Full Name Doesn't Match");
			
			//Short name
			String ShortName=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").getText();
			SA.assertEquals(ShortName,M.getstring("Automation Test Data",43,2),"Short Name Doesn't Match");
			
			//Gender
			String Gender=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtGender").getText();
			SA.assertEquals(Gender,M.getstring("Automation Test Data",43,3),"Gender Doesn't Match");
			
			Thread.sleep(5000);
			M.ScrollDwon(1);
			
			//Email
			String Email=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserEmail").getText();
			SA.assertEquals(Email,M.getstring("Automation Test Data",43,4),"Gender Doesn't Match");

			//Phone
			String Phone=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").getText();
			SA.assertEquals(Phone,M.getstring("Automation Test Data",43,5),"Phone Number Doesn't Match");

			//Department
			String Department=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtDepartment").getText();
			SA.assertEquals(Department,M.getstring("Automation Test Data",43,6),"Department Doesn't Match");

			Thread.sleep(5000);
			M.ScrollDwon(1);
			
			//Designation
			String Designation=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdDesignation").getText();
			SA.assertEquals(Designation,M.getstring("Automation Test Data",43,7),"Designation Doesn't Match");

			//ReportingPerson
			String ReportingPerson=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtReportingPerson").getText();
			SA.assertEquals(ReportingPerson,M.getstring("Automation Test Data",43,8),"ReportingPerson Doesn't Match");

			//User Type
			String UserType=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserType").getText();
			SA.assertEquals(UserType,M.getstring("Automation Test Data",43,9),"UserType Doesn't Match");
			
			try {
				SA.assertAll();	
				M.ScreenShots("Screenshot/Passed","VerifyCreatedUsers");  
			    M.setStrData("As Expected","Automation Testcase", 285, 6);
				M.setStrData("Pass","Automation Testcase", 285, 7);

			}catch(AssertionError e)
			{
				throw new Exception(e);	
			}

			
		}
		catch(Exception e){
			M.ScreenShots("Screenshot/Failed","VerifyCreatedUsers");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 285, 6);
			M.setStrData("Fail","Automation Testcase", 285, 7);
			
		}
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("ViewUserDetails Executed!");
}
	
	//@Test(priority = 7)	
	public void ViewUserDetails() throws IOException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		try {
			String str="Syed Yunus";
			Thread.sleep(3000);
			M.Searching(str);
			
			String name=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_userName").getText();
			SA.assertEquals(name,M.getstring("Automation Test Data",43,1),"Full Name doesn't Match");
			
			String designation=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_designationName").getText();
			SA.assertEquals(designation,M.getstring("Automation Test Data",43,7),"Designation Doesn't Match");

			String department=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_departmentName").getText();
			SA.assertEquals(department,M.getstring("Automation Test Data",43,6),"Department Doesn't Match");

			String mobile=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_contactNumber").getText();
			SA.assertEquals(mobile,M.getstring("Automation Test Data",43,5),"Department Doesn't Match");
			
			try {
				SA.assertAll();	
				M.ScreenShots("Screenshot/Passed","ViewUserDetails");  
			    M.setStrData("As Expected","Automation Testcase", 284, 6);
				M.setStrData("Pass","Automation Testcase", 284, 7);

			}catch(AssertionError e)
			{
				throw new Exception(e);	
			}

			
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","ViewUserDetails");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 284, 6);
			M.setStrData("Fail","Automation Testcase", 284, 7);
			
		}
		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
		System.out.println("ViewUserDetails Executed!");

	}	
	

	
	
	//@Test(priority = 8)
	public void EditUser() throws InterruptedException, IOException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		String testdata="";
		int i=52;
		try {
			
			M.ScrollByText("Syed Yunus");
			
			List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
			for(int j=0;j<xyz.size();j++)
			{
				if(xyz.get(j).getText().contains("Syed Yunus"))
				{
					driver.findElementByXPath("//android.widget.TextView[@text='Syed Yunus']").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;
					
				}
							
			}
			
			//FullName
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", i, 1));
			driver.hideKeyboard();
			
			//ShortName
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").sendKeys(M.getstring("Automation Test Data", i, 2));
			driver.hideKeyboard();
			
			//UserGender
			testdata=M.getstring("Automation Test Data", i, 3);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userGender").click();
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(5000);
			M.ScrollDwon(1);
			
			//Phone Number
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").sendKeys(M.getstring("Automation Test Data", i, 4));
			driver.hideKeyboard();
			
			//Department
			testdata=M.getstring("Automation Test Data", i, 5);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDepartment").click();
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(1000);
			List<AndroidElement> xyz1=driver.findElementsByClassName("android.widget.TextView");
			for(int j=0;j<xyz1.size();j++)
			{
				if(xyz1.get(j).getText().contains("Warning"))
				{
					String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
					
					SA.assertEquals(mass,M.getstring("Automation Test Data",61,3),"UserDepartment Massage Doesn't Match");

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;				
				}
							
			}
			
			
			//Designation
			testdata=M.getstring("Automation Test Data", i, 6);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userDesignation").click();
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Thread.sleep(5000);
			M.ScrollDwon(1);

			
			//ReportingPerson
			testdata=M.getstring("Automation Test Data", i, 7);
			
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userReportingPerson").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(1000);
			
			List<AndroidElement> xyz2=driver.findElementsByClassName("android.widget.TextView");
			for(int j=0;j<xyz2.size();j++)
			{
				if(xyz2.get(j).getText().contains("Warning"))
				{
					String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
					
					SA.assertEquals(mass,M.getstring("Automation Test Data",61,3),"ReportingPerson Massage Doesn't Match");
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;				
				}
							
			}
			
			//UserType
			testdata=M.getstring("Automation Test Data", i, 8);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userTypeDropDown").click();
			M.ScrollByText("Top Mgmt.");
			List<AndroidElement> xyz3=driver.findElementsByClassName("android.widget.TextView");
			for(int j=0;j<xyz3.size();j++)
			{
				if(xyz3.get(j).getText().contains(testdata))
				{
					driver.findElementByXPath("//android.widget.TextView[@text=\""+testdata+"\"]").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;
					
				}
							
			}			
			//select Active/inActive
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_userStatusDropDown").click();
			driver.findElementByXPath("//android.widget.TextView[@text='Inactive']").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/doneButton").click();
			String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
			
			SA.assertEquals(mass,M.getstring("Automation Test Data",59,3),"InActive Massage Doesn't Match");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			
			//Save&change
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			try {
				SA.assertAll();
				
				M.ScreenShots("Screenshot/Passed","Edit User");			  
			    M.setStrData("As Expected","Automation Testcase", 153, 6);
				M.setStrData("Pass","Automation Testcase", 153, 7);

			}catch(Exception e){
				throw new Exception(e);	
			}
			
			
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","Edit User");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 153, 6);
			M.setStrData("Fail","Automation Testcase", 153, 7);
		}
		
		Thread.sleep(5000);
		M.BackFun(1);	
		
		String user=driver.findElementByXPath("//android.widget.TextView[@text='Users']").getText();
		if(user.contains("Users")){
			System.out.println("EditUser Executed!");
		}else {
			
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			nevigate();
			System.out.println("EditUser Executed!");
		}
		
	}
	
	//@Test(priority = 9)
	public void VerifyAfterEdit() throws InterruptedException, IOException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		int j=52;
		try {
			M.ScrollByText("Yunus Nahid");
			
			List<AndroidElement> xyz=driver.findElementsByClassName("android.widget.TextView");
			for(int i=0;i<xyz.size();i++)
			{
				if(xyz.get(i).getText().contains("Yunus Nahid"))
				{
					driver.findElementByXPath("//android.widget.TextView[@text='Yunus Nahid']").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;
					
				}
							
			}
			//Full Name
			String FullName=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").getText();
			SA.assertEquals(FullName,M.getstring("Automation Test Data",j,1),"Full Name Doesn't Match");
			
			//Short name
			String ShortName=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").getText();
			SA.assertEquals(ShortName,M.getstring("Automation Test Data",j,2),"Short Name Doesn't Match");
			
			//Gender
			String Gender=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtGender").getText();
			SA.assertEquals(Gender,M.getstring("Automation Test Data",j,3),"Gender Doesn't Match");
			
			Thread.sleep(5000);
			M.ScrollDwon(1);

			//Phone
			String Phone=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").getText();
			SA.assertEquals(Phone,M.getstring("Automation Test Data",j,4),"Phone Number Doesn't Match");

			//Department
			String Department=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtDepartment").getText();
			SA.assertEquals(Department,M.getstring("Automation Test Data",j,5),"Department Doesn't Match");

			Thread.sleep(5000);
			M.ScrollDwon(1);
			
			//Designation
			String Designation=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/etdDesignation").getText();
			SA.assertEquals(Designation,M.getstring("Automation Test Data",j,6),"Designation Doesn't Match");

			//ReportingPerson
			String ReportingPerson=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtReportingPerson").getText();
			SA.assertEquals(ReportingPerson,M.getstring("Automation Test Data",j,7),"ReportingPerson Doesn't Match");

			//User Type
			String UserType=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserType").getText();
			SA.assertEquals(UserType,M.getstring("Automation Test Data",j,8),"UserType Doesn't Match");
			
			//User Status
			String UserStatus=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtUserStatus").getText();
			SA.assertEquals(UserStatus,M.getstring("Automation Test Data",j,9),"User Status Doesn't Match");
			
			
			try {
				SA.assertAll();	
				M.ScreenShots("Screenshot/Passed","VerifyAfterEdit");  
			    M.setStrData("As Expected","Automation Testcase", 286, 6);
				M.setStrData("Pass","Automation Testcase", 286, 7);

			}catch(AssertionError e)
			{
				throw new Exception(e);	
			}

			
		}
		catch(Exception e){
			M.ScreenShots("Screenshot/Failed","VerifyAfterEdit");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 286, 6);
			M.setStrData("Fail","Automation Testcase", 286, 7);
			
		}
		Thread.sleep(5000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("ViewUserDetails Executed!");
}
	
	//@Test(priority = 10)
	public void EditByInvalidUserName() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		M.ScrollByText("Yunus Nahid");

		List<AndroidElement> xyz = driver.findElementsByClassName("android.widget.TextView");
		for (int i = 0; i < xyz.size(); i++) {
			if (xyz.get(i).getText().contains("Yunus Nahid")) {
				driver.findElementByXPath("//android.widget.TextView[@text='Yunus Nahid']").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;

			}

		}

		try {
			String str ="";
			int count=0;
			for(int i=1;i<=3;i++)
			{ 
				String title;
				if(i==1)
				{
					//FullName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", 45, 1));
					driver.hideKeyboard();

					//shortName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").sendKeys(M.getstring("Automation Test Data", 45, 2));
					driver.hideKeyboard();

					Thread.sleep(5000);
					M.ScrollDwon(2);
					//Save&change
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					title=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
					
					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						count++;
						str=str+"Invalid FullName & ShortName Accept";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
					}else
					{
						i++;
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					}

				}
				if(i==2)
				{
					Thread.sleep(5000);
					M.Scroll(2);

					//FullName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", 52, 1));
					driver.hideKeyboard();
					
					Thread.sleep(5000);
					M.ScrollDwon(2);
					//Save&change
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					title=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();

					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						count++;
						str=str+"\n"+"Invalid Short Name Accept";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

						
					}else
					{
						i++;
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


					}
					Thread.sleep(5000);
					M.Scroll(2);


				}
				if(i==3)
				{	
					//FullName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", 45, 1));
					driver.hideKeyboard();


					//shortName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtShortName").sendKeys(M.getstring("Automation Test Data", 52, 2));
					driver.hideKeyboard();
					
					Thread.sleep(5000);
					M.ScrollDwon(2);
					//Save&change
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					title=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						count++;
						str=str+"\n"+"Invalid FullName Accept";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					}else
					{
						
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

					}
					Thread.sleep(5000);
					M.Scroll(2);
					//FullName
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").clear();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtFullName").sendKeys(M.getstring("Automation Test Data", 52, 1));
					driver.hideKeyboard();
					Thread.sleep(5000);
					M.ScrollDwon(2);
					//Save&change
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					Thread.sleep(5000);
					M.BackFun(1);	

				
				}

			}
			if(count>=1)
			{
				throw new Exception(str);	
			}
			
			M.ScreenShots("Screenshot/Passed","EditByInvalidUserName");
		  
		    M.setStrData("As Expected","Automation Testcase", 287, 6);
			M.setStrData("Pass","Automation Testcase", 287, 7);
			

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","EditByInvalidUserName");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 287, 6);
			M.setStrData("Fail","Automation Testcase", 287, 7);
			try {
				String user=driver.findElementByXPath("//android.widget.TextView[@text='Users']").getText();
				if(user.contains("Users")){
					System.out.println("Edit By Invalid UserName Executed!");
				}
			}catch(Exception x) {
				Thread.sleep(1000);
				driver.quit();
				capabilities();
				Thread.sleep(2000);
				nevigate();
				System.out.println("Edit By Invalid UserName Executed!");

			}
		}
	}
	
	@Test(priority = 11)
	public void MobileVerificationByEdit() throws IOException, InterruptedException {
		CallingMethods M=new CallingMethods(driver);
		SoftAssert SA=new SoftAssert();
		M.ScrollByText("Yunus Nahid");

		List<AndroidElement> xyz = driver.findElementsByClassName("android.widget.TextView");
		for (int i = 0; i < xyz.size(); i++) {
			if (xyz.get(i).getText().contains("Yunus Nahid")) {
				driver.findElementByXPath("//android.widget.TextView[@text='Yunus Nahid']").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;

			}

		}
		Thread.sleep(5000);
		M.ScrollDwon(1);

		
		try {
			int count=0;
			String str="";
			for(int i=1;i<=6;i++)
			{
				int j=i+1;

				//Phone Number
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").sendKeys(M.getstring("Automation Test Data", 49, i));
				driver.hideKeyboard();
			
				Thread.sleep(5000);
				M.ScrollDwon(1);
				
				//Save&change
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				String mass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
				String title = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvTitle").getText();
				if(mass.contentEquals(M.getstring("Automation Test Data", 57, j)))
				{
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				}
				else {
					count++;
					if(title.contentEquals(M.getstring("Automation Test Data", 53, 4)))
					{
						str=str+"\n"+i+" .Accept invalid Number";
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
					}else
					{
						str=str+"\n"+i+" ."+mass;
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					}

				}
				Thread.sleep(5000);
				M.Scroll(1);


			}
			//Phone Number
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").click();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").clear();
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/edtPhone").sendKeys(M.getstring("Automation Test Data", 52, 4));
			driver.hideKeyboard();
		
			Thread.sleep(5000);
			M.ScrollDwon(1);
			
			//Save&change
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btnSaveChanges").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			if(count>0)
			{
				throw new Exception(str);	
			}

			
			M.ScreenShots("Screenshot/Passed","User Email Verification");		  
		    M.setStrData("As Expected","Automation Testcase", 288, 6);
			M.setStrData("Pass","Automation Testcase", 288, 7);
			
			Thread.sleep(5000);
			M.BackFun(1);	

			
		}catch(Exception e) {
			
			M.ScreenShots("Screenshot/Failed","User Email Verification");
			String ErMass=e.toString();
			M.setStrData(ErMass, "Automation Testcase", 283, 6);
			M.setStrData("Fail","Automation Testcase", 283, 7);

		}
		
		String user=driver.findElementByXPath("//android.widget.TextView[@text='Users']").getText();
		if(user.contains("Users")){
			System.out.println("Edit By Invalid UserName Executed!");
		}else {
			
			Thread.sleep(1000);
			driver.quit();
			capabilities();
			Thread.sleep(2000);
			nevigate();
			System.out.println("Edit By Invalid UserName Executed!");
		}

		
		System.out.println("CreateUser Executed!");
	}
		
	//@Test(priority = 3)
	public void DeleteUser() throws InterruptedException, IOException {
		CallingMethods M=new CallingMethods(driver);
		try {

			String str="Syed Yunus";
			M.Searching(str);
			List<AndroidElement> xyz=driver.findElementsByXPath("//android.widget.TextView");
			for(int i=0;i<xyz.size();i++)
			{
				if(xyz.get(i).getText().contains(str))
				{
					Point p1=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txt_contactNumber").getCenter();
					Point p2=driver.findElementByXPath("//android.widget.TextView[@text='Yunus Nahid']").getCenter();
					Thread.sleep(5000);
					M.Swipping(p1, p2);
					Thread.sleep(8000);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_deleteMain").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;
					
				}
							
			}
			
			M.ScreenShots("Screenshot/Passed","Delete User");
			  
		    M.setStrData("As Expected","Automation Testcase", 181, 6);
			M.setStrData("Pass","Automation Testcase", 181, 7);

			
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","Delete User");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 181, 6);
			M.setStrData("Fail","Automation Testcase", 181, 7);
			
		}
		
		System.out.println("DeleteUser Executed!");

	}

	//@Test(priority = 4)
	public void SearchUser() throws InterruptedException, IOException {
		CallingMethods M=new CallingMethods(driver);
		try {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/llBack").click();
			String str="Syed Yunus";
			Thread.sleep(3000);
			M.Searching(str);
		
			M.ScreenShots("Screenshot/Passed","Search User");
			  
		    M.setStrData("As Expected","Automation Testcase", 189, 6);
			M.setStrData("Pass","Automation Testcase", 189, 7);

			
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","Search User");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 189, 6);
			M.setStrData("Fail","Automation Testcase", 189, 7);
			
		}
		
		System.out.println("DeleteUser Executed!");

	}
	
	
	
}
