package com.cslsoft.KandareeLiteTestCase;

import java.time.Duration;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.ios.touch.IOSPressOptions.iosPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import java.io.File;
import java.io.IOException;
import java.lang.NullPointerException;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.examples.CreateUserDefinedDataFormats;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CallingMethods{
	
	public AndroidDriver<AndroidElement>  driver;
	public CallingMethods(AndroidDriver<AndroidElement> driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
//Login Section 
	public void LoginMethods() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_email_address").setValue("tahsina@cslsoft.com");

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/et_login_company_code").setValue("1008");

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_continue").click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/btn_log_in").click();
		  
		  System.out.println("Login Function Executed!");

	}
	
	 
// ScreenShots
		public void ScreenShots(String FolderName, String FileName) throws IOException {
			String folder_name = FolderName;
			File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			new File(folder_name).mkdir();
			String file_name = FileName + ".png";
			FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
			System.out.println("Screenshot taken");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
	
//Swiping	
		
		
		public void Swipping(Point p1, Point p2) {

			TouchAction tcD = new TouchAction(driver);
			tcD.longPress(longPressOptions().withPosition(PointOption.point(p1.x + 100, p1.y + 20))
					.withDuration(ofSeconds(3))).moveTo(PointOption.point(p2.x, p2.y + 20)).release().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		 
//SwipBytext
		public void SwipBytext(String text) {

			Point p1 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + text + "\"]").getCenter();
			Point p2 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + text + "\"]").getLocation();

			TouchAction tcD = new TouchAction(driver);
			tcD.longPress(longPressOptions().withPosition(PointOption.point(p1.x + 100, p1.y + 20))
					.withDuration(ofSeconds(2))).moveTo(PointOption.point(p2.x, p2.y + 20)).release().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void SwipBytext1() {

			//Point p1 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + text + "\"]").getCenter();
			//Point p2 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + text + "\"]").getLocation();

			TouchAction tcD = new TouchAction(driver);
			tcD.press(element(driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txtLiabilityAmount")))
					.waitAction(waitOptions(Duration.ofMillis(100)))
					.moveTo(element(driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/txtLiabilityType"))).release()
					.perform();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
//SwipBydubletext
		public void SwipBydubletext(String text,String text1) {

			Point p1 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + text + "\"]").getCenter();
			Point p2 = driver.findElementByXPath("//android.widget.TextView[@text=\"" + text1 + "\"]").getLocation();

			TouchAction tcD = new TouchAction(driver);
			tcD.longPress(longPressOptions().withPosition(PointOption.point(p1.x + 100, p1.y + 20))
					.withDuration(ofSeconds(3))).moveTo(PointOption.point(p2.x, p2.y + 20)).release().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
//Searching
		public void Searching(String ser) {
			driver.findElementById("bd.com.cslsoft.kandareeliteapp:id/ll_search").click();
			driver.findElementById("android:id/search_src_text").clear();
			driver.findElementById("android:id/search_src_text").sendKeys(ser);
			driver.hideKeyboard();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		
//BackFun
		public void BackFun(int size) {
			for (int j = 1; j <= size; j++) {
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
		
//Scroll
		public void Scroll(int j) {
			for (int i = 0; i < j; i++) {
				Dimension dimension = driver.manage().window().getSize();
				int start_x = (int) (dimension.width * 0.5);
				int start_y = (int) (dimension.height * 0.2);

				int end_x = (int) (dimension.width * 0.5);
				int end_y = (int) (dimension.height * 0.8);

				TouchAction tcD = new TouchAction(driver);
				tcD.press(PointOption.point(start_x, start_y))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
						.moveTo(PointOption.point(end_x, end_y)).release().perform();
			}

		}
		
		public void ScrollDwon(int j){
			for(int i=0;i<j;i++)
			{
				Dimension dimension = driver.manage().window().getSize();
				int start_x = (int) (dimension.width * 0.5);
				int start_y = (int) (dimension.height * 0.8);

				int end_x = (int) (dimension.width * 0.5);
				int end_y = (int) (dimension.height * 0.2);

				TouchAction tcD = new TouchAction(driver);
				tcD.press(PointOption.point(start_x, start_y))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
						.moveTo(PointOption.point(end_x, end_y)).release().perform();
			}
			
		}
		
		public void ScrollDwonMinor(int j){
			for(int i=0;i<j;i++)
			{
				Dimension dimension = driver.manage().window().getSize();
				int start_x = (int) (dimension.width * 0.5);
				int start_y = (int) (dimension.height * 0.8);

				int end_x = (int) (dimension.width * 0.5);
				int end_y = (int) (dimension.height * 0.6);

				TouchAction tcD = new TouchAction(driver);
				tcD.press(PointOption.point(start_x, start_y))
						.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
						.moveTo(PointOption.point(end_x, end_y)).release().perform();
			}
			
		}
		
		
		
//ScrollByText
		public void ScrollByText(String text) {
			MobileElement element = (MobileElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
			
			/*
			 * MobileElement element = (MobileElement) driver .findElement(MobileBy.
			 * AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(1))"
			 * + ".scrollIntoView(new UiSelector().text(\"" + scrol + "\").instance(1))"));
			 */
		}
		
//Click on selected cart
		public void ClickOn(String text) {
			List<AndroidElement> xyz = driver.findElementsByXPath("//android.widget.TextView[@text=\"" + text + "\"]");
			for (int i = 0; i < xyz.size(); i++) {
				if (xyz.get(i).getText().contains(text)) {
					driver.findElementByXPath("//android.widget.TextView[@text=\"" + text + "\"]").click();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					break;
				}

			}

		}
		
//Data driven from excel		
		public String setStrData(String Sdata, String ShitName, int rowN, int cellN) throws IOException {
			File appDir = new File("src/test/resources");
			File datafile = new File(appDir, "KandareeLite_TC.xlsx");
			FileInputStream Dfile = new FileInputStream(datafile);

			XSSFWorkbook wb = new XSSFWorkbook(Dfile);
			XSSFSheet sheet = wb.getSheet(ShitName);
			XSSFRow row = sheet.getRow(rowN);
			if (row == null)
				row = sheet.createRow(rowN);

			XSSFCell cell = row.getCell(cellN);
			if (cell == null)
				cell = row.createCell(cellN);

			cell.setCellValue(Sdata);
			String data = cell.getStringCellValue();
			FileOutputStream fos = new FileOutputStream(datafile);
			wb.write(fos);
			fos.close();
			return data;

		}
		
		public int setIntData(int Idata, String ShitName, int rowN, int cellN) throws IOException {
			File appDir = new File("src/test/resources");
			File datafile = new File(appDir, "KandareeLite_TC.xlsx");
			FileInputStream Dfile = new FileInputStream(datafile);

			XSSFWorkbook wb = new XSSFWorkbook(Dfile);
			XSSFSheet sheet = wb.getSheet(ShitName);
			XSSFRow row = sheet.getRow(rowN);
			if (row == null)
				row = sheet.createRow(rowN);

			XSSFCell cell = row.getCell(cellN);
			if (cell == null)
				cell = row.createCell(cellN);

			cell.setCellValue(Idata);
			int data = (int) cell.getNumericCellValue();
			FileOutputStream fos = new FileOutputStream(datafile);
			wb.write(fos);
			fos.close();
			return data;

		}
		


		public String getstring(String ShitName, int rowN, int cellN) throws IOException {
			File appDir = new File("src/test/resources");
			File datafile = new File(appDir, "KandareeLite_TC.xlsx");
			FileInputStream Dfile = new FileInputStream(datafile);

			XSSFWorkbook wb = new XSSFWorkbook(Dfile);
			XSSFSheet sheet = wb.getSheet(ShitName);
			XSSFRow row = sheet.getRow(rowN);
			if (row == null)
				row = sheet.createRow(rowN);

			XSSFCell cell = row.getCell(cellN);
			if (cell == null)
				cell = row.createCell(cellN);
			String data = cell.getStringCellValue();
			return data;

		}

		public int getinteger(String ShitName, int rowN, int cellN) throws IOException {
			File appDir = new File("src/test/resources");
			File datafile = new File(appDir, "KandareeLite_TC.xlsx");
			FileInputStream Dfile = new FileInputStream(datafile);

			XSSFWorkbook wb = new XSSFWorkbook(Dfile);
			XSSFSheet sheet = wb.getSheet(ShitName);
			XSSFRow row = sheet.getRow(rowN);
			if (row == null)
				row = sheet.createRow(rowN);

			XSSFCell cell = row.getCell(cellN);
			if (cell == null)
				cell = row.createCell(cellN);
			int data = (int) cell.getNumericCellValue();
			return data;

		}




}