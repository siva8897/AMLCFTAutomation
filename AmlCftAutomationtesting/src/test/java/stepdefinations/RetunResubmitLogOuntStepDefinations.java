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

public class RetunResubmitLogOuntStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public RetunResubmitLogOuntStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@Given("AMLCFT Application Logout Details")
	public void amlcft_application_logout_details() {
	   
	}

	@When("AMLCFT User clciked on Logout logo")
	public void amlcft_user_clciked_on_logout_logo() {
		
        JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//mat-icon[@role='img']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
	    
		
	   
	}

	@When("AMLCFT User has clicked on logout button")
	public void amlcft_user_has_clicked_on_logout_button() {
	    
        JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//button[normalize-space()='Sign Out']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
	}


	
}
