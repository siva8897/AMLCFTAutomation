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

public class ReturnsExtensionStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public ReturnsExtensionStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}


	@Given("Point to Returns Extension Details")
	public void point_to_returns_extension_details() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//img[@class='showmenu']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(3000);

	    
	}
	@When("User is clicked on the Menu button")
	public void user_is_clicked_on_the_menu_button() {
	    
	}
	@When("User clicked on the Returns Extension")
	public void user_clicked_on_the_returns_extension() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//a[normalize-space()='Returns Extension']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(3000);
		
	    
	}
	@When("Return extension page select Comany Number option")
	public void return_extension_page_select_comany_number_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("1000201");
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
	    
		Thread.sleep(3000);
	}
	@When("Return extension page select Licence Number option")
	public void return_extension_page_select_licence_number_option() throws InterruptedException {
		
		
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//mat-select[@name='licenceNumber']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click()");
		Thread.sleep(3000);
		
		jsexecutor.executeScript("document.evaluate(\"//span[@class='mat-option-text']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
	}
}
