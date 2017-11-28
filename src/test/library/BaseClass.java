package test.library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.java.After;
import cucumber.api.java.Before;
//import com.vimalselvam.testng.listener.ExtentTestNgFormatter;
public class BaseClass extends TestListenerAdapter {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	public static String testDataPath = ".//TestData/TestData.xls";

	public static int time = 15;
	public static ObjectMap map = null;
	//public static String browser =   getExcelCell("IUHealth",0,1);// "CH"; // IE or FF or CH
	public static String objmapPath = ".//src/main/properties/objectmap.properties";
	public static String baseUrl = null;
	public static String URL =  "https://www.autogravity.com/";
	public static String Username = "Thursday1234";
	public static String Password = "Passw0rd";
	public static String chromeDriver = ".//chromedriver.exe";
	public static String ieDriver = ".//IEDriverServer.exe";
	public static String ffDriver = ".//geckodriver.exe";
	public static String edgeDriver = ".//MicrosoftWebDriver.exe";
	public static String dbfile = ".//TestData/DB_Output.txt";

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	



//	@AfterMethod
	public void getResult(ITestResult result) throws Exception{ 
		if(result.getStatus()== ITestResult.FAILURE){
			String screenshotpath = GetFullPageScreenShot.capture(driver, "screenshot");
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+" Test Case FAILED due to below issues:", ExtentColor.BROWN));
			test.fail(result.getThrowable());
			test.fail("Snapshot below: "+test.addScreenCaptureFromPath(screenshotpath));
			driver.close();
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED",ExtentColor.GREEN));
		}
		else{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED",ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	
	}

//	@AfterSuite
	public void reportTeardown() {
		extent.flush();
	}

	
	
	public static void openBrowser(String browser){
		try{
			
			if(browser.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver",".//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}
			else if (browser.equalsIgnoreCase("Chrome")){
					System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
					driver = new ChromeDriver();

			}
			else if(browser.equalsIgnoreCase("Firefox")){
					System.setProperty("webdriver.gecko.driver", ".//geckodriver.exe");
					driver = new FirefoxDriver();
				
			}
			else if(browser.equalsIgnoreCase("Edge")){
				System.setProperty("webdriver.edge.driver",".//MicrosoftWebDriver.exe"); //put actual location
				driver = new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("Ghost")) {
				driver = new PhantomJSDriver();
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}

	}



	public static void openURL(String URL){
		try{
			driver.navigate().to(URL);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


	
	public static void tearDown(){
		try {
			driver.quit();
		} catch (Exception e) {
			
		}
	}




	/** isElementPresent method */
	protected static boolean IsElementPresent(String objname) throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			driver.findElement(map.getLocator(objname));
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}


	/**
	 * waitForElementPresent method 
	 * parameters : (objname = the object name from objectmap
	 * file) , (time is in seconds)
	 * @throws Exception 
	 */
	public static void WaitForElementPresent(String objname, int time) {
		try{
			WebDriverWait newWait = new WebDriverWait(driver, time);
			newWait.until(ExpectedConditions.visibilityOfElementLocated(map.getLocator(objname)));
		}catch(Exception e){
			Assert.fail("timeout error: element '" + objname + "' not present");
		}
	}
	
	
	public static void WaitForElementToBeEnabled(String objname, int time) {
		try{
			WebDriverWait newWait = new WebDriverWait(driver, time);
			newWait.until(ExpectedConditions.elementToBeClickable(map.getLocator(objname)));
		}catch(Exception e){
			Assert.fail("timeout error: element '" + objname + "' not present");
		}
	}

	/** report information */
	public static void reportInfo(String message) {
		System.out.println(message);
		Reporter.log(message);
	}

	/** report fail */
	public static void reportFail(String message) {
		System.out.println("Fail: " + message);
		Reporter.log("Fail: " + message);
	}

	public static void reportPass(String message){
		System.err.println(message);
		Reporter.log(message);
	}


	/**
	 * selectTextFromDropdown method (objname = the object name from objectmap
	 * file)
	 */
	public static void SelectTextByValue(String objname, String value) {
		try {
			Select select = new Select(driver.findElement(map
					.getLocator(objname)));
			reportInfo("dropdown '" + objname + "' is selected");

			select.selectByValue(value);
			reportInfo("text '" + value + "' is selected from the dropdown '"
					+ objname + "'");
		} catch (Exception e) {
			reportFail("'" + objname + "' is not present or text '" + value
					+ "' is not selected");
			Assert.fail("'" + objname + "' is not present or text '" + value
					+ "' is not selected");
		}

	}



	/**
	 * sendKeys method (objname = the object name from objectmap file) , (value
	 * is the text to enter)
	 * @throws Exception 
	 */
	public static void SendKeys(String objname, String value) {
		try {
			driver.findElement(map.getLocator(objname)).clear();
			driver.findElement(map.getLocator(objname)).sendKeys(value);
			reportInfo("'" + value + "' is entered in '" + objname + "'");
		} catch (Exception e) {
			reportFail("element '" + objname + "' is not displayed");
			Assert.fail("element '" + objname + "' is not displayed");
		}
	}


	/***************************************************************************************************************/
	/**
	 * Java Script click
	 * @author Sedhu
	 */
	public static void JSClick(String objname){
		try {
			WebElement element = driver.findElement(map.getLocator(objname));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			reportInfo("clicked on '" + objname + "'");
		}
		catch(Exception E){
			reportFail("element '" + objname + "' is not displayed");
			Assert.fail("element '" + objname + "' is not displayed");
		}
	}



	/**
	 * click method (objname = the object name from objectmap file)
	 * @throws Exception 
	 */
	public static void Click(String objname) {
		try {
			driver.findElement(map.getLocator(objname)).click();
			reportInfo("clicked on '" + objname + "'");
		} catch (Exception e) {
			reportFail("element '" + objname + "' is not displayed");
			Assert.fail("element '" + objname + "' is not displayed");
		}
	}

	
	public static boolean retryingFindClick(String objname) throws Exception {
		boolean result = false;
		int attempts = 0;
		while(attempts < 4) {
			try {
				driver.findElement(map.getLocator(objname)).click();
				//JSClick("objname");
				result = true;
				break;
			} catch(StaleElementReferenceException e) {
			}
			attempts++;
		}
		return result;
	}

	
	/***************************************************************************************************************/
	/**
	 * thread sleep 
	 * @author Sedhu
	 */
	public static void sleep(int time){
		try {
			Thread.sleep(time*1000);
		}
		catch(Exception E){
			
		}
	}
	 
}


