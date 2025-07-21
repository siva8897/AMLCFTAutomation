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

public class SARSStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public SARSStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}


	@When("User has on SARS details page")
	public void user_has_on_sars_details_page() {
	  
	}

	@When("User SARS page reported to the MLRO last month {string}")
	public void user_sars_page_reported_to_the_mlro_last_month(String month) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@name='numSuspActsMlro']")).sendKeys(month);
	 
	}

	@When("User SARS page SARS being filed with the FIA {string}")
	public void user_sars_page_sars_being_filed_with_the_fia(String month1) {
	  
		
		testContextSetup.driver.findElement(By.xpath("//input[@name='numSuspActsMlroSar']")).sendKeys(month1);
		
	}
		
	    
	

	@When("User SARS page select documented in each instance option")
	public void user_sars_page_select_documented_in_each_instance_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-select-value'])[71]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='YES']")).click();
		Thread.sleep(1000);
	   
	}
	

    @When("User SARS page value of associated transaction {string}")
     public void user_sars_page_value_of_associated_transaction(String  month3) throws InterruptedException {
    	
    	testContextSetup.driver.findElement(By.xpath("//input[@name='txnsValueSar']")).sendKeys(month3);
    	Thread.sleep(1000);
    	
    
     }

	
	
	
	@When("User SARS page select suspicious activity option")
	public void user_sars_page_select_suspicious_activity_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[86]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='1 to 2 days']")).click();
		Thread.sleep(1000);
		
	   
	}
	@When("User SARS page select analyse a suspicious option")
	public void user_sars_page_select_analyse_a_suspicious_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[87]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='3 to 5 days']")).click();
		Thread.sleep(1000);
		
		
	 
	}
	@When("User SARS page clicked on other issues button")
	public void user_sars_page_clicked_on_other_issues_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'][normalize-space()='Other Issues'])[1]")).click();
		Thread.sleep(3000);
		   
	
		
	
	}
}
