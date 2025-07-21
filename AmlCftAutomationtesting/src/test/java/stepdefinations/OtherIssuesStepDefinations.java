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

public class OtherIssuesStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public OtherIssuesStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@When("User Other Issues page details page")
	public void user_other_issues_page_details_page() {
	   
	}

	@When("User Other Issues page clicked on NO button")
	public void user_other_issues_page_clicked_on_no_button() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-radio-inner-circle'])[14]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(1000);
	    
	
	}

	@When("User Other Issues page clicked on Declaration button")
	public void user_other_issues_page_clicked_on_declaration_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'][normalize-space()='Declaration'])[1]")).click();
		Thread.sleep(3000);
	   
	}


	

}
