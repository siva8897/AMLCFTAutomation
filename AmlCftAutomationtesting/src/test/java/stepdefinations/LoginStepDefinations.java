package stepdefinations;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public LoginStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}


	@SuppressWarnings("deprecation")
	@Given("Login into AMLCFT Application")
	public void login_into_amlcft_application() throws InterruptedException {

		 WebDriverManager.chromedriver().setup();

		 testContextSetup.driver = new ChromeDriver();

		 testContextSetup.driver.get("http://bvifsc-urfs.amlreturns.radiant.digital:8080/BVIFSC_RETURNS/#/login");
		 
		 testContextSetup.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		 
	     testContextSetup.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 testContextSetup.driver.manage().window().maximize();
		 
		 
	}
	
	@When("User login into appliction username is {string}")
	public void user_login_into_appliction_username_is(String username) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(username);
		
	   
	}

	@When("User login into application password is {string}")
	public void user_login_into_application_password_is(String password) {
	    
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password);
	}

	@When("User clicked on the Sign in button")
	public void user_clicked_on_the_sign_in_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//button[@id='signin_btn']")).click();
			
		Thread.sleep(8000); 
	}

	@Then("Home page should be opend")
	public void home_page_should_be_opend() {
	 
	}

	
	@Given("Create Interal User Details")
	public void create_interal_user_details() {

		System.out.println("driver=" + driver);

	}

	@When("User clicked on the Menu button")
	public void user_clicked_on_the_menu_button() throws InterruptedException {

		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//img[@class='showmenu']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(5000);

	}

	@When("User clicked on the Internal User button")
	public void user_clicked_on_the_internal_user_button() {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//a[text()='Create Internal Users']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");

		//driver.findElement(By.xpath("//a[text()='Create Internal Users']")).click();

	}
	

     @When("VerifyInteralUserTitle")
     public void verify_interal_user_title() {
    	 String expectedTitle = "BVI FSC - VIRRGIN Returns";
    	 String actualTitle = testContextSetup.driver.getTitle();
    	 Assert.assertEquals(actualTitle, expectedTitle);
    
}


	@When("User Create Interal Userss page UserId is {string}")
	public void user_create_interal_userss_page_user_id_is(String userid) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='UserId']")).sendKeys(userid);

	}

	@When("User Create Interal Userss page First Name {string}")
	public void user_create_interal_userss_page_first_name(String fname) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='firstName']")).sendKeys(fname);

	}

	@When("User Create Interal Userss page Last Name {string}")
	public void user_create_interal_userss_page_last_name(String lname) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='lastName']")).sendKeys(lname);

	}

	@When("User Create Interal Userss page Email {string}")
	public void user_create_interal_userss_page_email(String email) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(email);

	}

	@When("User Create Interal Userss page Phone Number {string}")
	public void user_create_interal_userss_page_phone_number(String pnumber) throws InterruptedException {

		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='Phonenumber']")).sendKeys(pnumber);
		Thread.sleep(1000);
		
		
	}

	@When("User Create Interal Userss page select Role option")
	public void user_create_interal_userss_page_select_role_option() throws InterruptedException {

     JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
     jsexecutor.executeScript("document.evaluate(\"//div[@class='mat-select-arrow']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click()");
	 Thread.sleep(4000);
		
	jsexecutor.executeScript("document.getElementById('mat-option-4').click()");

		  
  		
	}

	@When("User Crate Interal Userss page clicked on Reset button")
	public void user_crate_interal_userss_page_clicked_on_reset_button() {
		
		//driver.findElement(By.id("reset")).click();

	}

}
