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

public class UploadReturnsStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public UploadReturnsStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@When("Point to Upload Excel Returns")
	public void point_to_upload_excel_returns() throws InterruptedException {
	   
	JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;

	jsexecutor.executeScript("document.evaluate(\"//img[@class='showmenu']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
	
	Thread.sleep(3000);
	
	
}

	
	
	@When("Upload Excel Return User has clicked on Upload Returns")
	public void upload_excel_return_user_has_clicked_on_upload_returns() {
		
        JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//a[normalize-space()='Upload Returns']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
	   
	}

	@Given("Upload Excel Return page Company Number {string}")
	public void upload_excel_return_page_company_number(String cnumber) throws InterruptedException {
	  
		testContextSetup.driver.findElement(By.xpath("//input[@formcontrolname='companyNumber']")).sendKeys(cnumber);
		Thread.sleep(5000);
	}

	@Given("Upload Excel Return page Enter Choose file name {string}")
	public void upload_excel_return_page_enter_choose_file_name(String file) throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//input[@placeholder='Upload file']")).sendKeys(file);
		Thread.sleep(5000);
	}

	@Given("Upload Excel Return page clicked on Upload button")
	public void upload_excel_return_page_clicked_on_upload_button() {
	   
	}

	@Then("Upload Excel Return page file uploaded sucssfully.")
	public void upload_excel_return_page_file_uploaded_sucssfully() {
	   
	}

	
	


}
