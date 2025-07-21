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

public class RetunResubmitLoginStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public RetunResubmitLoginStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@Given("AMLCFT Login into application")
	public void amlcft_login_into_application() {
	   
	}

	@Given("AMLCFT User enters valid username is {string}")
	public void amlcft_user_enters_valid_username_is(String username1) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(username1);
	   
	}

	@Given("AMLCFT User enter valid password is {string}")
	public void amlcft_user_enter_valid_password_is(String password1) {
		
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password1);
	   
	}

	@Given("AMLCFT User has clicked on Sing in button")
	public void amlcft_user_has_clicked_on_sing_in_button() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//button[@id='signin_btn']")).click();
		
		Thread.sleep(8000); 
		
}





	
	

}
