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

public class UpdateUserStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public UpdateUserStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}


	@Given("Point ot Update User Details")
	public void point_ot_update_user_details() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//img[@class='showmenu']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(3000);
	  
	}

	@When("User has clicked on the menu button")
	public void user_has_clicked_on_the_menu_button() {
	    
	}

	@When("User clicked on update user details")
	public void user_clicked_on_update_user_details() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//a[normalize-space()='Update User Details']")).click();
		Thread.sleep(5000);
	 
	}

	@When("Update User page select Userid option")
	public void update_user_page_select_userid_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("123456");
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='123456']")).click();
		Thread.sleep(3000);
	   
	}

}
