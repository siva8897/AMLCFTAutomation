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

public class AddReturnsStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public AddReturnsStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@Given("Login into application")
	public void login_into_application() {
	  
	}
	@Given("User enters valid username is {string}")
	public void user_enters_valid_username_is(String name) {

		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(name);
		
	}
	@Given("User enter valid password is {string}")
	public void user_enter_valid_password_is(String pass) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(pass);
	  
	}
	@Given("User has clicked on Sing in button")
	public void user_has_clicked_on_sing_in_button() throws InterruptedException {
	   
		testContextSetup.driver.findElement(By.xpath("//button[@id='signin_btn']")).click();
		
		Thread.sleep(8000); 
	}
	
	@Given("User has clicked on Submit New Return button")
	public void user_has_clicked_on_submit_new_return_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//b[text()='Submit New Return']")).click();
		
		Thread.sleep(2000);
	 
	}

	@Given("User has enter Comapney Number Option")
	public void user_has_enter_comapney_number_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.name("companyNumber")).click();
	    
		testContextSetup.driver.findElement(By.xpath("//span[text()=' 1012506']")).click();
		
		Thread.sleep(5000);
	}

	@Given("User Return page clicked on GOVERNANCE button")
	public void user_return_page_clicked_on_governance_button() throws InterruptedException {
	
		testContextSetup.driver.findElement(By.xpath("//aw-wizard-step[1]//button[1]")).click();
		
		Thread.sleep(1000);
		
	}
	
	@Given("User Governace page select Board Meetings option")
	public void user_governace_page_select_board_meetings_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.name("numBoardMtgs")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='1 to 4']")).click();
		Thread.sleep(1000);
	    
	}

	@Given("User Governace page select Senior Managements option")
	public void user_governace_page_select_senior_managements_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[9]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='9 to 12']")).click();
		Thread.sleep(2000);
	}
	@Given("User Governace page select Board Meetings1 option")
	public void user_governace_page_select_board_meetings1_option() throws InterruptedException {
	 
        testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[10]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='5 to 8']")).click();
		Thread.sleep(2000);
		
		
	}
	@Given("User Governace page select Senior Management Meetings2 option")
	public void user_governace_page_select_senior_management_meetings2_option() throws InterruptedException {
		
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[11]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='More than 12']")).click();
		Thread.sleep(2000);
	}
	

	

	@Given("User Governace page select Policies option")
	public void user_governace_page_select_policies_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[12]")).click();
	
		testContextSetup.driver.findElement(By.xpath("//span[text()='6 to 12 months']")).click();
		Thread.sleep(2000);
	}

	@Given("User Governace page select Procedures option")
	public void user_governace_page_select_procedures_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[13]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='12 to 18 months']")).click();
		Thread.sleep(2000);
	   
	}
	
	
	

	@Given("User Governace page select Was the review conducted internally or by a third party option")
	public void user_governace_page_select_was_the_review_conducted_internally_or_by_a_third_party_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[14]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Internal']")).click();
		Thread.sleep(2000);
		
	    
	}

	@Given("User Governace page select AML\\/CFT systems and controls option")
	public void user_governace_page_select_aml_cft_systems_and_controls_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[15]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Bi-Annually']")).click();
		Thread.sleep(2000);
		
		
	    
	}

	@Given("User Governace page select AML\\/CFT systems and controls presented to the Borad option")
	public void user_governace_page_select_aml_cft_systems_and_controls_presented_to_the_borad_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[16]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='No']")).click();
		Thread.sleep(2000);
	}

	@Given("User Governace page select Risks for all of its buiness line option")
	public void user_governace_page_select_risks_for_all_of_its_buiness_line_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[17]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Never']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Governace page select Board approve the risk assessment option")
	public void user_governace_page_select_board_approve_the_risk_assessment_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[18]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		Thread.sleep(2000);
	 
	}

	@Given("User Governace page select Products\\/Service option")
	public void user_governace_page_select_products_service_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[19]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Medium']")).click();
		
		Thread.sleep(2000);
	  
	}

	@Given("User Governace page select Customers option")
	public void user_governace_page_select_customers_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[20]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Low']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Governace page select Geography option")
	public void user_governace_page_select_geography_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[21]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='High']")).click();
		Thread.sleep(2000);
	}

	@Given("User Governace page select Distribution channels option")
	public void user_governace_page_select_distribution_channels_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[22]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='N/A']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Governace page select Overall licensee rating option")
	public void user_governace_page_select_overall_licensee_rating_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[23]")).click();
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text' and text()='Low' or @id='mat-option-667']")).click();
		Thread.sleep(2000);
	}


	@Given("User Governace page clicked on Record keeping button")
	public void user_governace_page_clicked_on_record_keeping_button() throws InterruptedException {
	    
		testContextSetup.driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'][normalize-space()='Record Keeping'])[1]")).click();
		Thread.sleep(3000);
	}
	

	



}
