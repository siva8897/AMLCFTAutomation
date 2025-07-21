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

public class ResubmitReturnStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public ResubmitReturnStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@Given("AMLCFT Access to Resubmit Return page")
	public void amlcft_access_to_resubmit_return_page() {
	   
	}

	@Given("Resubmit Return page user has clicked on company number")
	public void resubmit_return_page_user_has_clicked_on_company_number() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//tbody/tr[2]/td[1]")).click();
		Thread.sleep(2000);
		
	    
	}

	@Given("General page user has clicked on Edit and Re-submit Return button")
	public void general_page_user_has_clicked_on_edit_and_re_submit_return_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='Edit and Re-submit Return']")).click();
		Thread.sleep(8000);
	  
	}

	@Given("General page User has select on Reporting Period option")
	public void general_page_user_has_select_on_reporting_period_option() throws InterruptedException {
		
        JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//mat-select[@name='reportingPeriod']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
	 
		
		jsexecutor.executeScript("document.evaluate(\"//span[text()=' 2050 ']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(2000);
	  
	}
	
	@Given("Declaration page User clicked on Declaration button")
	public void declaration_page_user_clicked_on_declaration_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//li[9]//a[1]//div[2]")).click();
		Thread.sleep(2000);
	   
	}

	@Given("Declaration page User enter data Amendments to the Retuns is {string}")
	public void declaration_page_user_enter_data_amendments_to_the_retuns_is(String amendments) {
		
		testContextSetup.driver.findElement(By.name("AmendmentsReturns")).sendKeys(amendments);
	   
	}



	
	

}
