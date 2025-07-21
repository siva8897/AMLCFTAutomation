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

public class UpdateCompanyStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public UpdateCompanyStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@Given("Ponit to Update company details")
	public void ponit_to_update_company_details() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//img[@class='showmenu']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(3000);

		
	}
	@When("User has clicked on the Menu button")
	public void user_has_clicked_on_the_menu_button()  {
		
	
	    
	}
	@When("User clicked on update company details")
	public void user_clicked_on_update_company_details() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

		jsexecutor.executeScript("document.evaluate(\"//a[normalize-space()='Update Company Details']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
		Thread.sleep(5000);
	   
	}
	
	@When("Update Company profile page select company number option")
	public void update_company_profile_page_select_company_number_option() throws InterruptedException {
		
	
        testContextSetup.driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("1000175");
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='1000175']")).click();

		Thread.sleep(5000);
	  
	}
	@When("Update Company profle page select Licence Number option")
	public void update_company_profle_page_select_licence_number_option() {
	  
	}


	

	

}
