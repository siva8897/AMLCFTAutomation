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

public class RecordKeepingStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public RecordKeepingStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}


	@Given("User has on Record keeping page")
	public void user_has_on_record_keeping_page() {
	   
		
	}

	@Given("User Record Keeping page select AMLTFCOP option")
	public void user_record_keeping_page_select_amltfcop_option() throws InterruptedException  {
		
        testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[24]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		
	  
	}

	@Given("User Record Keeping page clciked on Intranet Site option")
	public void user_record_keeping_page_clciked_on_intranet_site_option() throws InterruptedException {
		
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[3]")).click();
		
	    
	}

	@Given("User Record Keeping page Select procedures record retention option")
	public void user_record_keeping_page_select_procedures_record_retention_option() throws InterruptedException {
		
        testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[25]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='No']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Record Keeping page Select Virgin Islands option")
	public void user_record_keeping_page_select_virgin_islands_option() throws InterruptedException {
	 
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[26]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
	}

	@Given("User Record Keeping page Select licensee include transation record option")
	public void user_record_keeping_page_select_licensee_include_transation_record_option() throws InterruptedException {
	  
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[27]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='N/A']")).click();
		Thread.sleep(2000);
	}

	@Given("User Record Keeping page Select retrievable format option")
	public void user_record_keeping_page_select_retrievable_format_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[28]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		
	    
	}

	@Given("User Record Keeping page Select licensee's records held option")
	public void user_record_keeping_page_select_licensee_s_records_held_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[29]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='Digital']")).click();
		Thread.sleep(2000);
	    
	}

	@Given("User Record Keeping page User clicked on Risk profile button")
	public void user_record_keeping_page_user_clicked_on_risk_profile_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		
		Thread.sleep(3000);
		
		
	    
	}



}
