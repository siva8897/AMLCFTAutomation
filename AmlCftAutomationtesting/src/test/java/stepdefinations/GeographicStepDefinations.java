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

public class GeographicStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public GeographicStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@When("User Geographic Exposure select Country option")
	public void user_geographic_exposure_select_country_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[72]")).click();
		Thread.sleep(1000);
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='India']")).click();
		Thread.sleep(1000);
	}
	
	@When("User Geographic Exposure clicked on Add Jurisdiction link")
	public void user_geographic_exposure_clicked_on_add_jurisdiction_link() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='Add Jurisdiction']")).click();
		Thread.sleep(1000);
	}

	@When("User Geographic Exposure select Countrysecond option")
	public void user_geographic_exposure_select_countrysecond_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[76]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='American Samoa']")).click();
		Thread.sleep(2000);
	}

	
	   
	

	@When("User Geographic Exposure clicked on Sars button")
	public void user_geographic_exposure_clicked_on_sars_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//button[@class='action-buttons nextbutton mat-button mat-button-base _mat-animation-noopable']//span[@class='mat-button-wrapper'][normalize-space()='SARs']")).click();
		Thread.sleep(4000);
	    
	}




}
