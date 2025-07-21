package stepdefinations;

import java.time.Duration;
import java.util.List;
import java.util.Set;
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

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegistrationStepDefinations {


	
	TestContextSetup testContextSetup;
	
	
	public UserRegistrationStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
		
		
	}
	
	@Given("Login page New User Registration")
	public void login_page_new_user_registration() throws InterruptedException {
		
		System.out.println("driver="+TestContextSetup.driver);
		
		
	}

	@Given("User clicked on New User Registration link")
	public void user_clicked_on_new_user_registration_link() throws InterruptedException {
		
        JavascriptExecutor jsexecutor = (JavascriptExecutor) TestContextSetup.driver;
		
		jsexecutor.executeScript("document.evaluate(\"//a[text()='New User Registration']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
	    Thread.sleep(3000);
		
	  
	
	}
	
	@Given("New User Registration")
	public void new_user_registration() {
	   
	}

	@Given("User Registration page FirstName {string}")
	public void user_registration_page_first_name(String First) throws InterruptedException {
		
	    
		testContextSetup.driver.findElement(By.name("firstName")).sendKeys(First);
		Thread.sleep(2000);
		
        
	    
	}
	
	@Given("User Registration page LastName {string}")
	public void user_registration_page_last_name(String Last) throws InterruptedException {
		
		testContextSetup.driver.findElement(By.name("lastName")).sendKeys(Last);
		Thread.sleep(2000);
		
        //JavascriptExecutor jsexecutor = (JavascriptExecutor) TestContextSetup.driver;
		
		//jsexecutor.executeScript("document.getElementById('mat-input-6').setAttribute('style','border:5px red solid;background:yellow');");
	    //Thread.sleep(3000);
	    
	}

	@Given("User Registration page E-Mail {string}")
	public void user_registration_page_e_mail(String e_mail) throws InterruptedException {
		
		testContextSetup.driver.findElement(By.name("email")).sendKeys(e_mail);
		Thread.sleep(2000);
	    
	}

	@Given("User Registration page Telephone {string}")
	public void user_registration_page_telephone(String Tele) throws InterruptedException {
	   
		testContextSetup.driver.findElement(By.name("telephone")).sendKeys(Tele);
		Thread.sleep(2000);
	}

	@Given("User Registration page UserId {string}")
	public void user_registration_page_user_id(String Uid) {
		
		testContextSetup.driver.findElement(By.name("userId")).sendKeys(Uid);
	    
	}

	@Given("User Registration page Password {string}")
	public void user_registration_page_password(String Pass) {
	    
		testContextSetup.driver.findElement(By.name("password")).sendKeys(Pass);
	}

	@Given("User Registration page ConfirmPassword {string}")
	public void user_registration_page_confirm_password(String cPass) {
		
		testContextSetup.driver.findElement(By.name("confirmpassword")).sendKeys(cPass);
	    
	}

    @Given("User Registration page Higlight add another liceness button")
    public void user_registration_page_higlight_add_another_liceness_button() throws InterruptedException {
    	
    	WebElement liceness=testContextSetup.driver.findElement(By.xpath("//div[@class='addLink detailsbt']"));
    	
    	JavascriptExecutor jsexecutor = (JavascriptExecutor) TestContextSetup.driver;
    	
    	jsexecutor.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", liceness);
    	
    	Thread.sleep(3000);
    
}
	
	
	@Given("User Registration page select Company Number option")
	public void user_registration_page_select_company_number_option() throws InterruptedException {
		testContextSetup.driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("1001121");
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();

		Thread.sleep(3000);
	}

	@Given("User Registration page select Licence Number option")
	public void user_registration_page_select_licence_number_option() throws InterruptedException {
		
		
		 JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
			
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-infix'])[8]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click()");
		 Thread.sleep(1000);
			
		jsexecutor.executeScript("document.evaluate(\"//span[normalize-space()='CITL02992']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click()");

		
	  
	}

	@Given("User registration page User clicked on Register button")
	public void user_registration_page_user_clicked_on_register_button() throws InterruptedException {
		
		WebElement reg= testContextSetup.driver.findElement(By.xpath("//button[text()=' REGISTER ']"));
		

    	JavascriptExecutor jsexecutor = (JavascriptExecutor) TestContextSetup.driver;
    	
    	jsexecutor.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", reg);
    	
    	Thread.sleep(3000);
	    
	}
	
	@Given("User registration page User has clicked on Home page button")
	public void user_registration_page_user_has_clicked_on_home_page_button() {
	   
		testContextSetup.driver.findElement(By.xpath("//a[text()='Home Page']")).click();
	}







	    
	}





	
	


