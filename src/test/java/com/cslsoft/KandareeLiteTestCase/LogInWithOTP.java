package com.cslsoft.KandareeLiteTestCase;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.testng.ITestResult;

public class LogInWithOTP extends BaseClass{
	
	
	@Test(priority = 0)
	public void RecievedAndEnterCorrectOTP() throws IOException{
		CallingMethods M=new CallingMethods(driver);
		
		
		
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			  String email=M.getstring("Automation Test Data",2,1);
			
			  int Intcode=M.getinteger("Automation Test Data",2, 2); 
			  String strcode =Integer.toString(Intcode);
			
			  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);
			  
			  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);
			  
			  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();
			  
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  
			  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_log_in").click();
			  Thread.sleep(50);
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  M.ScreenShots("Screenshot/Passed","Recieved And Enter CorrectOTP");
			  
			  M.setStrData("As Expected","Automation Testcase", 10, 6);
			  M.setStrData("Pass","Automation Testcase", 10, 7);
			  
		}catch(Exception e){
			M.ScreenShots("Screenshot/Failed","Recieved And Enter CorrectOTP");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 10, 6);
			M.setStrData("Fail","Automation Testcase", 10, 7);
			
			System.out.println(" Test case Fail:RecievedAndEnterCorrectOTP");
		}
		System.out.println("RecievedAndEnterCorrectOTP Executed!!");
		driver.quit();
			 
	}
	
	@Test(priority = 1)
	public void CorrectEmailIncorrertCode() throws IOException {
		
		capabilities();
		CallingMethods M = new CallingMethods(driver);
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String email = M.getstring("Automation Test Data", 2, 1);
			int Intcode;
			String strcode;
			String Errormass;
			String TestErrormass;
			for (int i = 2; i <= 7;i++) {
				try {
					Intcode = M.getinteger("Automation Test Data", 4, i);
					strcode = Integer.toString(Intcode);
				} catch (Exception e) {
					strcode = M.getstring("Automation Test Data", 4, i);
				}

				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);

				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);

				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();

				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

				Errormass = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
				TestErrormass = M.getstring("Automation Test Data", 19, 3);
				if (TestErrormass.equals(Errormass)) {
					
					if(i==7)
					{
						M.ScreenShots("Screenshot/Passed", "CorrectEmailIncorrertCode");
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					}					
					else
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

			}

			M.setStrData("As Expected", "Automation Testcase", 19, 6);
			M.setStrData("Pass", "Automation Testcase", 19, 7);

		} catch (Exception e) {
			M.ScreenShots("Screenshot/Failed", "CorrectEmailIncorrertCode");
			String ErMass=e.toString().substring(0, 123);
			M.setStrData(ErMass, "Automation Testcase", 19, 6);
			
			M.setStrData("Fail", "Automation Testcase", 19, 7);

			System.out.println(" Test case Fail:CorrectEmailIncorrertCode");
		}
		System.out.println("CorrectEmailIncorrertCode Executed!!");
		driver.quit();

	}

		@Test(priority = 2)
		public void IncorrertEmailCorrertCode() throws IOException {
		
			capabilities();
			CallingMethods M = new CallingMethods(driver);
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				int Intcode = M.getinteger("Automation Test Data", 6, 6);
				String strcode = Integer.toString(Intcode);
				String Errormass;
				String TestErrormass;
				for (int i = 1; i <= 5;i++) {
					
					String email = M.getstring("Automation Test Data", 6, i);
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();

					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

					Errormass = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
					TestErrormass = M.getstring("Automation Test Data", 19, 3);
					if (TestErrormass.equals(Errormass)) {
						
						if(i==5)
						{
							M.ScreenShots("Screenshot/Passed", "IncorrertEmailCorrertCode");
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						}else
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					}

				}

				M.setStrData("As Expected", "Automation Testcase", 27, 6);
				M.setStrData("Pass", "Automation Testcase", 27, 7);

			} catch (Exception e) {
				M.ScreenShots("Screenshot/Failed", "IncorrertEmailCorrertCode");
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 27, 6);
				M.setStrData("Fail", "Automation Testcase", 27, 7);

				System.out.println(" Test case Fail:IncorrertEmailCorrertCode");
			}
			
			System.out.println("IncorrertEmailCorrertCode Executed!!");
			driver.quit();

		}
	

		@Test(priority = 3)
		public void IncorrectEmailIncorrertCode() throws IOException {
			capabilities();
			CallingMethods M = new CallingMethods(driver);
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String email;
				int Intcode;
				String strcode;
				String Errormass;
				String TestErrormass;
				for (int i = 8; i <= 13;i++) {
					try {
						Intcode = M.getinteger("Automation Test Data", i, 2);
						strcode = Integer.toString(Intcode);
					} catch (Exception e) {
						strcode = M.getstring("Automation Test Data", i, 2);
					}
					email = M.getstring("Automation Test Data", i, 1);
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();

					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

					Errormass = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
					TestErrormass = M.getstring("Automation Test Data", 19, 3);
					if (TestErrormass.equals(Errormass)) {
						if(i==13)
						{
							M.ScreenShots("Screenshot/Passed", "IncorrectEmailIncorrertCode");
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						}else
							driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
						
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					}

				}

				
				M.setStrData("As Expected", "Automation Testcase", 34, 6);
				M.setStrData("Pass", "Automation Testcase", 34, 7);

			} catch (Exception e) {
				M.ScreenShots("Screenshot/Failed", "IncorrectEmailIncorrertCode");
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 34, 6);
				
				M.setStrData("Fail", "Automation Testcase", 34, 7);

				System.out.println("Test case Fail:IncorrectEmailIncorrertCode");
			}
			
			System.out.println("IncorrectEmailIncorrertCode Executed!!");
			driver.quit();

		}
		
		@Test(priority = 4)
		public void BlankEmailCorrectCode() throws IOException {
			capabilities();
			CallingMethods M = new CallingMethods(driver);
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				int Intcode;
				String strcode;
				for (int i = 8; i <= 14; i++) {
					try {
						Intcode = M.getinteger("Automation Test Data", i, 2);
						strcode = Integer.toString(Intcode);
					} catch (Exception e) {
						strcode = M.getstring("Automation Test Data", i, 2);
					}
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);
					boolean tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").isEnabled();
					
					if(tr==true)
					{
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();
					}
					

					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


				}

				M.ScreenShots("Screenshot/Passed", "BlankEmailCorrectCode");
				M.setStrData("As Expected", "Automation Testcase", 41, 6);
				M.setStrData("Pass", "Automation Testcase", 41, 7);

			} catch (Exception e) {
				M.ScreenShots("Screenshot/Failed", "BlankEmailCorrectCode");
				
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 41, 6);
				
				M.setStrData("Fail", "Automation Testcase", 41, 7);

				System.out.println("Test case Fail:BlankEmailCorrectCode");
			}
			
			System.out.println("BlankEmailCorrectCode Executed!!");
			driver.quit();

		}
		
		
		@Test(priority = 5)
		public void CorrectEmailBlankCode() throws IOException {
			capabilities();
			CallingMethods M = new CallingMethods(driver);
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
				String email;
				
				for (int i = 8; i <= 14; i++) {
					
					email=M.getstring("Automation Test Data",i,1);
					
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").click();
					
					boolean tr=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").isEnabled();
					
					if(tr==true)
					{
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();
					}
					

					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


				}

				M.ScreenShots("Screenshot/Passed", "CorrectEmailBlankCode");
				M.setStrData("As Expected", "Automation Testcase", 46, 6);
				M.setStrData("Pass", "Automation Testcase", 46, 7);

			} catch (Exception e) {
				M.ScreenShots("Screenshot/Failed", "CorrectEmailBlankCode");
				
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 46, 6);
				
				M.setStrData("Fail", "Automation Testcase", 46, 7);

				System.out.println("Test case Fail:CorrectEmailBlankCode");
			}
			
			System.out.println("CorrectEmailBlankCode Executed!!");
			driver.quit();
		}
		
		
		@Test(priority = 6)
		public void BlankEmailBlankCode() throws IOException {
			capabilities();

			CallingMethods M = new CallingMethods(driver);
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				for (int i = 8; i <= 9; i++) {

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").click();
					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").click();

					boolean tr = driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").isEnabled();

					if (tr == true) {
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();
					}

					driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

				}
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

				M.ScreenShots("Screenshot/Passed", "BlankEmailBlankCode");
				M.setStrData("As Expected", "Automation Testcase", 51, 6);
				M.setStrData("Pass", "Automation Testcase", 51, 7);

			} catch (Exception e) {
				M.ScreenShots("Screenshot/Failed", "BlankEmailBlankCode");
				
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 51, 6);

				M.setStrData("Fail", "Automation Testcase", 51, 7);

				System.out.println("Test case Fail:BlankEmailBlankCode");
			}
			
			System.out.println("BlankEmailBlankCode Executed!!");
			driver.quit();

		}
		
		@Test(priority = 7)
		public void ResendOTP() throws IOException{
			capabilities();
			CallingMethods M=new CallingMethods(driver);
			
	
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				  String email=M.getstring("Automation Test Data",2,1);
				
				  int Intcode=M.getinteger("Automation Test Data",2, 2); 
				  String strcode =Integer.toString(Intcode);
				
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);
				  
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);
				  
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();
				  
				  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				  
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tv_resend_code").click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_log_in").click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  M.ScreenShots("Screenshot/Passed","Recieved And Enter CorrectOTP");
				  M.setStrData("As Expected","Automation Testcase", 55, 6);
				  M.setStrData("Pass","Automation Testcase", 55, 7);
				  
			}catch(Exception e){
				M.ScreenShots("Screenshot/Failed","Recieved And Enter CorrectOTP");
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 55, 6);
				M.setStrData("Fail","Automation Testcase", 55, 7);
				
				System.out.println(" Test case Fail:RecievedAndEnterCorrectOTP");
			}
			System.out.println("ResendOTP Executed!!");
			driver.quit();
				 
		}
		
		@Test(priority = 8)
		public void ExpiredOTP() throws IOException{
			capabilities();
			CallingMethods M=new CallingMethods(driver);
			
	
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				  String email=M.getstring("Automation Test Data",2,1);
				
				  int Intcode=M.getinteger("Automation Test Data",2, 2); 
				  String strcode =Integer.toString(Intcode);
				
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);
				  
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);
				  
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();
				  
				  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				  String otp=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_six_digit_pin").getText();
				  
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tv_resend_code").click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_six_digit_pin").clear();
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_six_digit_pin").sendKeys(otp);
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_log_in").click();
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
				  String Errormass=driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/tvMessage").getText();
				  String TestData=M.getstring("Automation Test Data", 20, 3);
				  if(TestData.equals(Errormass))
				  {
					  M.ScreenShots("Screenshot/Passed","ExpiredOTP");
					  M.setStrData("As Expected","Automation Testcase", 67, 6);
					  M.setStrData("Pass","Automation Testcase", 67, 7);
					  
				  }
				  else
					  throw new Exception("Error Message Not Match"); 
				  
				  
			}catch(Exception e){
				M.ScreenShots("Screenshot/Failed","ExpiredOTP");
				String ErMass=e.toString().substring(0, 44);
				M.setStrData(ErMass, "Automation Testcase", 67, 6);
				M.setStrData("Fail","Automation Testcase", 67, 7);
				
				System.out.println(" Test case Fail:ExpiredOTP");
			}
			System.out.println("ExpiredOTP Executed!!");
			driver.quit();
				 
		}
		
		
		@Test(priority = 9)
		public void InvalidOTP() throws IOException {
			capabilities();
			CallingMethods M = new CallingMethods(driver);
			int intcode;
			String strcode;
			try {

				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				String email = M.getstring("Automation Test Data", 2, 1);

				intcode = M.getinteger("Automation Test Data", 2, 2);
				strcode = Integer.toString(intcode);

				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue(email);

				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue(strcode);

				driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				for (int i = 1; i <= 5;i++) {
					
					try {
						intcode = M.getinteger("Automation Test Data", 16, i);
						strcode = Integer.toString(intcode);
					} catch (Exception e) {
						strcode = M.getstring("Automation Test Data", 16, i);
					}

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_six_digit_pin").sendKeys(strcode);
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_log_in").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					if(i==5) {
						M.ScreenShots("Screenshot/Passed", "InvalidOTP");
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					}else
						driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/yesButton").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}

				M.ScreenShots("Screenshot/Passed", "InvalidOTP");
				M.setStrData("As Expected", "Automation Testcase", 78, 6);
				M.setStrData("Pass", "Automation Testcase", 78, 7);

			} catch (Exception e) {
				M.ScreenShots("Screenshot/Failed", "InvalidOTP");
				String ErMass=e.toString().substring(0, 123);
				M.setStrData(ErMass, "Automation Testcase", 78, 6);
				M.setStrData("Fail", "Automation Testcase", 78, 7);

				System.out.println(" Test case Fail:InvalidOTP");
			}
			System.out.println("InvalidOTP Executed!!");

		}
		

}
