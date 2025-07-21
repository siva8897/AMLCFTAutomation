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

public class DeclartionStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public DeclartionStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}


	@When("User Declaration page clicked on Accept the declartion button")
	public void user_declaration_page_clicked_on_accept_the_declartion_button() {
		
		testContextSetup.driver.findElement(By.xpath("//mat-checkbox[@name='confirmcheck1']")).click();
	   
	}

	@When("User Declaration page clicked on Submit button")
	public void user_declaration_page_clicked_on_submit_button() {
	  
	}

}
