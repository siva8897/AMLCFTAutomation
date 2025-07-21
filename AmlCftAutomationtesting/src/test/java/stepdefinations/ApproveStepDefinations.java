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

public class ApproveStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public ApproveStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}


	@Given("Approve User Details page")
	public void approve_user_details_page() {
	    
	}

	@Given("Approve User page clicked on UserName")
	public void approve_user_page_clicked_on_user_name() {
	 
		testContextSetup.driver.findElement(By.xpath("\r\n"
				+ "//table[@class='mat-elevation-z8 mat-table-bg-white mat-table']//tbody[@role='rowgroup']//td[text()=' charan5544 ']")).click();
	}

	@Given("Approve User page clicked on Select All checkbox")
	public void approve_user_page_clicked_on_select_all_checkbox() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
	   Thread.sleep(1000);
	}

	@Given("Approve User page clicked on Close button")
	public void approve_user_page_clicked_on_close_button() {
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='CLOSE']")).click();
	  
	}



}
