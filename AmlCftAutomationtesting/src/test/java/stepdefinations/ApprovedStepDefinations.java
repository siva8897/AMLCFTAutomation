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

public class ApprovedStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public ApprovedStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@Given("Approved User Detals page")
	public void approved_user_detals_page() throws InterruptedException {
		

		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//img[@class='showmenu']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(3000);

	   
	}
	@When("Approved User page clicked on Approved Users button")
	public void approved_user_page_clicked_on_approved_users_button() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//a[normalize-space()='Approved Users']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(3000);
	 
	}
	@When("Approved User page clicked on User name element")
	public void approved_user_page_clicked_on_user_name_element() {
		
		testContextSetup.driver.findElement(By.xpath("//table//tbody//tr//td[@class='detailsLink mat-cell cdk-column-userId mat-column-userId ng-star-inserted' and text()=' puneeth123 ' ]")).click();
	    
	}
	@When("Approved User page clicked close button")
	public void approved_user_page_clicked_close_button() {
		
		testContextSetup.driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-1']//span[@class='mat-button-wrapper'][normalize-space()='CLOSE']")).click();
	   
	}


	
	

}
