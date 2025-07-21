package stepdefinations;

import java.time.Duration;
import java.util.List;
import java.util.Set;
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

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogOutStepDefinations {

	
	TestContextSetup testContextSetup;
	
	
	public LogOutStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
		
		
	}
	
	@Given("Application Logout Details")
	public void application_logout_details() {
	    
	}

	@When("User clciked on Logout logo")
	public void user_clciked_on_logout_logo() {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//mat-icon[@role='img']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
	    
		
	}


@When("User has clicked on logout button")
public void user_has_clicked_on_logout_button() {
	   
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//button[normalize-space()='Sign Out']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
	}

	    
	}





	
	


