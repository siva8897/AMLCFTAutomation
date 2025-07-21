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

public class RiskMonitoringStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public RiskMonitoringStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	@When("User is on Risk monitoring details page")
	public void user_is_on_risk_monitoring_details_page() {
		
		System.out.println("driver="+TestContextSetup.driver);
	    
	}
	@When("User Risk monitoring page clicked on ML\\/TF checkbox")
	public void user_risk_monitoring_page_clicked_on_ml_tf_checkbox() throws InterruptedException {
		
		   JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
			
		     jsexecutor.executeScript("document.getElementById(\"mat-radio-11-input\").click();");
			 Thread.sleep(1000);
	}
	@When("User Risk monitoring page clicked on AMLTFCOP checkbox")
	public void user_risk_monitoring_page_clicked_on_amltfcop_checkbox() throws InterruptedException {
		
		 JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
			
	     jsexecutor.executeScript("document.getElementById(\"mat-radio-15-input\").click();");
		 Thread.sleep(1000);

	}
	@When("User Risk monitoring page clicked on ECDD checkbox")
	public void user_risk_monitoring_page_clicked_on_ecdd_checkbox() throws InterruptedException {
		
		 JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
			
	     jsexecutor.executeScript("document.getElementById(\"mat-radio-17-input\").click();");
		 Thread.sleep(1000);

	    
	}
	@When("User Risk monitoring page clicked on Lawful purpose checkbox")
	public void user_risk_monitoring_page_clicked_on_lawful_purpose_checkbox() throws InterruptedException {
		
		 JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
			
	     jsexecutor.executeScript("document.getElementById(\"mat-radio-20-input\").click();");
		 Thread.sleep(1000);
		 
		 
	}
	@When("User Risk monitoring page clicked on AMLCFT requirment checkbox")
	public void user_risk_monitoring_page_clicked_on_amlcft_requirment_checkbox() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.getElementById(\"mat-radio-24-input\").click();");
		 Thread.sleep(1000);
	}

	@When("User Risk monitoring page select client files option")
	public void user_risk_monitoring_page_select_client_files_option() throws InterruptedException {
	    
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[58]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Yes']")).click();
		 Thread.sleep(1000);
	}
	@When("User Risk monitoring page clicked on Application for business checkbox")
	public void user_risk_monitoring_page_clicked_on_application_for_business_checkbox() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.getElementById(\"mat-radio-26-input\").click();");
		 Thread.sleep(1000);
	   
	}
	@When("User Risk monitoring page select group structure relied option")
	public void user_risk_monitoring_page_select_group_structure_relied_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[59]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='NO']")).click();
		Thread.sleep(1000);
		
	}
	@When("User Risk monitoring page select currently have place option")
	public void user_risk_monitoring_page_select_currently_have_place_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[60]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='26 to 50']")).click();
		Thread.sleep(1000);
	}
	@When("User Risk monitoring page select group realted option")
	public void user_risk_monitoring_page_select_group_realted_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[61]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='50 to 75%']")).click();
		Thread.sleep(1000);
	}
	
	@When("User Risk monitoring page select AML Legislation option")
	public void user_risk_monitoring_page_select_aml_legislation_option() throws InterruptedException {

		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[62]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='0%']")).click();
		Thread.sleep(1000);
	
	}
	@When("User Risk monitoring page select Third Party option")
	public void user_risk_monitoring_page_select_third_party_option() throws InterruptedException {
		

		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[63]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Less than 25%']")).click();
		Thread.sleep(1000);
	    
	}
	@When("User Risk monitoring page AML\\/CFT option")
	public void user_risk_monitoring_page_aml_cft_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[64]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='NO']")).click();
		Thread.sleep(1000);
	}
	@When("User Risk monitoring page Without delay option")
	public void user_risk_monitoring_page_without_delay_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[65]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='N/A']")).click();
		Thread.sleep(1000);
	
	}
	@When("User Risk monitoring page With the AMLTFCOP option")
	public void user_risk_monitoring_page_with_the_amltfcop_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[66]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='YES']")).click();
		Thread.sleep(1000);
		
	    
	}
	@When("User Risk monitoring page Arrangements option")
	public void user_risk_monitoring_page_arrangements_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[67]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='Every 3 years']")).click();
		Thread.sleep(1000);
		
	  
	}

	    
	
	
	@When("User Risk monitoring page licensee due option")
	public void user_risk_monitoring_page_licensee_due_option() throws InterruptedException {

	testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[68]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='N/A']")).click();
		Thread.sleep(1000);
		
	    
	  
	}
	
	@When("User Risk monitoring page licensee businees option")
	public void user_risk_monitoring_page_licensee_businees_option() throws InterruptedException {
		
	    testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[69]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='More than 10%']")).click();
		Thread.sleep(1000);
		
	}	
	    
	
	@When("User Risk monitoring page Due to incomplete CDD option")
	public void user_risk_monitoring_page_due_to_incomplete_cdd_option() throws InterruptedException {
	
        testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[70]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='5 to 10%']")).click();
		Thread.sleep(1000);
	    
	}
	@When("User Risk monitoring page Terminted option")
	public void user_risk_monitoring_page_terminted_option() {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[71]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='1 to 5%' and  @class='mat-option-text']")).click();
	    
	}
	@When("User Risk monitoring page clicked on Georgrapic exposusre button")
	public void user_risk_monitoring_page_clicked_on_georgrapic_exposusre_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//button[@class='action-buttons nextbutton mat-button mat-button-base _mat-animation-noopable']//span[@class='mat-button-wrapper'][normalize-space()='Geographic Exposure']")).click();
		Thread.sleep(4000);
	  
	}


	
}
