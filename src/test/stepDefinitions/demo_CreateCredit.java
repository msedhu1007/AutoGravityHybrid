package test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.library.GetFullPageScreenShot;
import test.library.BaseClass;
import test.library.ExcelToProperty;
import test.library.ObjectMap;

public class demo_CreateCredit extends BaseClass{

	public static Scenario scenario;

	@Before
	 public void before(Scenario scenario) {
	 this.scenario = scenario;
	 }
	
	
	public static void launchApp(String browser) {
		try {
			ExcelToProperty.ExcelSheetToPropertyFileConvert();
			map = new ObjectMap(objmapPath);
			openBrowser(browser);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			scenario.write("Browser is Launched");
			reportPass("Launch is successful");
		} catch (Exception E) {
			Reporter.log("Launch has failed");
		}
	}




	@Given("^User launches an \"([^\"]*)\" browser$")
	public void user_launches_an_browser(String browser) throws Throwable {
		launchApp (browser);
	}

	@Given("^navigates to the HomePage$")
	public void navigates_to_the_HomePage() throws Throwable {
		openURL(URL);
	}


	@When("^user selects \"([^\"]*)\" car Make and \"([^\"]*)\" Model$")
	public void clickOnMake(String car_make, String model){
		try {
			WaitForElementPresent("btn_GetStarted_HomePage", time);
			Click("btn_GetStarted_HomePage");
			WaitForElementPresent("img_Volvo_SelectMake", time);
			WaitForElementPresent("img_BMW_SelectMake", time);
			switch(car_make) {
			case "Acura":
				Click("img_Acura_SelectMake");
				break;

			case "Alfa Romeo": 
				Click("img_AlfaRomeo_SelectMake");
				break;

			case "Aston Martin": 
				Click("img_AstonMartin_SelectMake");
				break;

			case "Audi": 
				Click("img_Audi_SelectMake");
				break;

			case "Bentley": 
				Click("img_Bentley_SelectMake");
				break;

			case "BMW": 
				Click("img_BMW_SelectMake");
				break;

			case "Buick": 
				Click("img_Buick_SelectMake");
				break;	

			case "Cadillac": 
				Click("img_Cadillac_SelectMake");
				break;	

			case "Chevrolet": 
				Click("img_Chevrolet_SelectMake");
				break;	

			case "Chrysler": 
				Click("img_Chrysler_SelectMake");
				break;	

			case "Dodge": 
				Click("img_Dodge_SelectMake");
				break;	

			case "Ferrari": 
				Click("img_Ferrari_SelectMake");
				break;	

			case "Fiat": 
				Click("img_Fiat_SelectMake");
				break;	

			case "Ford": 
				Click("img_Ford_SelectMake");
				break;	

			case "Genesis": 
				Click("img_Genesis_SelectMake");
				break;	

			case "GMC": 
				Click("img_GMC_SelectMake");
				break;	

			case "Honda": 
				Click("img_Honda_SelectMake");
				break;	

			case "Hyundai": 
				Click("img_Hyundai_SelectMake");
				break;	

			case "Infiniti": 
				Click("img_Infiniti_SelectMake");
				break;	

			case "Jaguar": 
				Click("img_Jaguar_SelectMake");
				break;

			case "Jeep": 
				Click("img_Jeep_SelectMake");
				break;

			case "KIA": 
				Click("img_KIA_SelectMake");
				break;

			case "Lamborgini": 
				Click("img_Lamborgini_SelectMake");
				break;

			case "LandRover": 
				Click("img_LandRover_SelectMake");
				break;

			case "Lexus": 
				Click("img_Lexus_SelectMake");
				break;


			case "Lincoln": 
				Click("img_Lincoln_SelectMake");
				break;	

			case "Maserati": 
				Click("img_Maserati_SelectMake");
				break;	

			case "Mazda": 
				Click("img_Mazda_SelectMake");
				break;	

			case "McLaren": 
				Click("img_McLaren_SelectMake");
				break;	

			case "MercedesBenz": 
				Click("img_MercedesBenz_SelectMake");
				break;	

			case "Mini": 
				Click("img_Mini_SelectMake");
				break;	

			case "Mitsubishi": 
				Click("img_Mitsubishi_SelectMake");
				break;	

			case "Nissan": 
				Click("img_Nissan_SelectMake");
				break;	

			case "Porsche": 
				Click("img_Porsche_SelectMake");
				break;

			case "RollsRoyce": 
				Click("img_RollRoyce_SelectMake");
				break;

			case "Smart": 
				Click("img_Smart_SelectMake");
				break;	

			case "Subaru": 
				Click("img_Subaru_SelectMake");
				break;	

			case "Tesla": 
				Click("img_Tesla_SelectMake");
				break;

			case "Toyota": 
				Click("img_Toyata_SelectMake");
				break;

			case "Volkswagen": 
				Click("img_Volkswagen_SelectMake");
				break;

			case "Volvo": 
				Click("img_Volvo_SelectMake");
				break;
			}
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			sleep(3);
			driver.findElement(By.xpath("(//img[contains(@alt,'"+model+"')]/.)[1]")).click();
		} catch (Exception e) {
			reportFail(car_make+" or "+model+" is not Displayed");
			e.printStackTrace();
		}
	}


	@When("^user enters zipcode \"([^\"]*)\"$")
	public static void enterZipcode(String zip) {
		try {
			WaitForElementPresent("txt_ZipCode_SelectMake", time);
			SendKeys("txt_ZipCode_SelectMake",zip);
			WaitForElementToBeEnabled("btn_Find_SelectMake",time);
			Click("btn_Find_SelectMake");
			sleep(2);
		}
		catch(Exception e) {

			e.printStackTrace();
		}
	}

	@When("^user selects the first model and reviews the details in ReviewDetails screen$")
	public static void selectModel_ChooseACar() {

		try {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			if(IsElementPresent("ele_CarModels_ChooseACar")) {
				WaitForElementPresent("ele_CarModels_ChooseACar", time);
				Click("ele_CarModels_ChooseACar");
			//	WaitForElementPresent("btn_Next_ChooseACar", time);
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				sleep(3);
				retryingFindClick("btn_Next_ChooseACar");
				WaitForElementPresent("btn_Next_ReviewDetailsChooseACar", time);
				Click("btn_Next_ReviewDetailsChooseACar");
			}
			else if(IsElementPresent("ele_SelectAnTrim_ChooseACar")) {
				WaitForElementPresent("ele_SelectAnTrim_ChooseACar", time);
				Click("ele_SelectAnTrim_ChooseACar");
				WaitForElementPresent("btn_NEXT_ReviewDetails_ChooseACar", time);
				Click("btn_NEXT_ReviewDetails_ChooseACar");
				WaitForElementPresent("txt_zipcode_SelectDealership", time);
				SendKeys("txt_zipcode_SelectDealership","91381");
				WaitForElementPresent("btn_SelectThisDealer_SelectDealership", time);
				Click("btn_SelectThisDealer_SelectDealership");
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}



	@Then("^Verify the presence of all fields in Search For Financing screen$")
	public static void verifyPresenceOfFiends() {
		try {
			WaitForElementPresent("txt_FirstName_SearchForFinancing", time);
			IsElementPresent("txt_LastName_SearchForFinancing");
			IsElementPresent("txt_DOB_SearchForFinancing");
			IsElementPresent("txt_MobilePhone_SearchForFinancing");
			IsElementPresent("txt_HomePhone_SearchForFinancing");
			IsElementPresent("txt_Email_SearchForFinancing");
			IsElementPresent("txt_Pwd_SearchForFinancing");
			IsElementPresent("txt_ConfirmPwd_SearchForFinancing");
			IsElementPresent("btn_CreateAndContinue_SearchForFinancing");

		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
	}

	@Then("^Close the browser$")
	public static void closeBrwoser() {
		tearDown();
	}
	
	@After
	 public void embedScreenshot(Scenario scenario) {
	 if (scenario.isFailed()) {
	 try {
	 byte[] screenshot = ((TakesScreenshot) driver)
	 .getScreenshotAs(OutputType.BYTES);
	 scenario.embed(screenshot, System.getProperty("user.dir") + "/screenshots/"+"image/png");
	 } catch (Exception e) {
	 e.printStackTrace();
	 }
	 }
	 }
	 
}

