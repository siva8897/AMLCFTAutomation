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

public class RiskProfileStepDefinations {

	public static WebDriver driver;
	
	TestContextSetup testContextSetup;
	
	
	public RiskProfileStepDefinations(TestContextSetup testContextSetup) {
		
		this.testContextSetup =testContextSetup;
		
	}
	
	@Given("User has on Risk Profile exposure page")
	public void user_has_on_risk_profile_exposure_page() throws InterruptedException {
		
		
	}

	@Given("User Risk Profile page select Products option")
	public void user_risk_profile_page_select_products_option() throws InterruptedException {
		
        testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-select-value'])[27]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='16 to 25']")).click();
		Thread.sleep(2000);
	    
	
	}

	@Given("User Risk Profile page select Services option")
	public void user_risk_profile_page_select_services_option() throws InterruptedException {
		
        testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[31]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='0 to 5']")).click();
		Thread.sleep(2000);

	}

	@Given("User Risk Profile page PS select High option")
	public void user_risk_profile_page_ps_select_high_option() throws InterruptedException {
	 
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[32]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//mat-option[@value='25 to 50%']")).click();
		Thread.sleep(2000);
		
	}

	@Given("User Risk Profile page PS select Medium option")
	public void user_risk_profile_page_ps_select_medium_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[33]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//mat-option[@value='50 to 75%']")).click();
		Thread.sleep(2000);
	
	}

	@Given("User Risk Profile page PS select Low option")
	public void user_risk_profile_page_ps_select_low_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[34]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//mat-option[@value='More than 75%']")).click();
		Thread.sleep(2000);
	
	}

	@Given("User Risk Profile page PS select Distribution Channels option")
	public void user_risk_profile_page_ps_select_distribution_channels_option() throws InterruptedException {
	    
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[35]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Less than 25%']")).click();
		Thread.sleep(2000);
		
	}

	@Given("User Risk Profile page PS Customer Exposure select High option")
	public void user_risk_profile_page_ps_customer_exposure_select_high_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[36]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='50 to 75%']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Risk Profile page PS Customer Exposure select Medium option")
	public void user_risk_profile_page_ps_customer_exposure_select_medium_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[37]")).click();
		
		testContextSetup.driver.findElement(By.xpath("(//span[@class='mat-option-text'][normalize-space()='N/A'])[1]")).click();
		Thread.sleep(2000);
	    
	}

	@Given("User Risk Profile page PS Customer Exposure select Low option")
	public void user_risk_profile_page_ps_customer_exposure_select_low_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[38]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='25 to 50%']")).click();
		Thread.sleep(2000);
	    
	}

	@Given("User Risk Profile page select Retail option")
	public void user_risk_profile_page_select_retail_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[39]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='More than 75%']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Risk Profile page select Insitutional option")
	public void user_risk_profile_page_select_insitutional_option() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-flex'])[40]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		 Thread.sleep(2000);
			
		jsexecutor.executeScript("document.evaluate(\"//span[@class='mat-option-text'][normalize-space()='N/A']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(4000);		
		
	    
	}

	@Given("User Risk Profile page select Professional option")
	public void user_risk_profile_page_select_professional_option() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-infix'])[41]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		 Thread.sleep(2000);
			
		jsexecutor.executeScript("document.evaluate(\"//span[@class='mat-option-text'][normalize-space()='N/A']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(4000);		
		
		
		
	
	}

	@Given("User Risk Profile page select Percentage of licensee option")
	public void user_risk_profile_page_select_percentage_of_licensee_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("//mat-select[@formcontrolname='businessPctPriorVerify']")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='25 to 50%']")).click();
		Thread.sleep(2000);
	  
	}

	@Given("User Risk Profile page select Specific risk management option")
	public void user_risk_profile_page_select_specific_risk_management_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[43]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='75% to 90% of the time']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Risk Profile page select percentage option")
	public void user_risk_profile_page_select_percentage_option() throws InterruptedException {
	 
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[44]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='1 to 5%']")).click();
		Thread.sleep(2000);
		
	}

	@Given("User Risk Profile page select percentage transation option")
	public void user_risk_profile_page_select_percentage_transation_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[45]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='5 to 10%']")).click();
		Thread.sleep(2000);
	  
	}

	@Given("User Risk Profile page select CDD with the last months option")
	public void user_risk_profile_page_select_cdd_with_the_last_months_option() throws InterruptedException {
	   
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-infix'])[46]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='More than 10%']")).click();
		Thread.sleep(2000);
	}

	@Given("User Risk Profile page select CDD with the incomplete CDD option")
	public void user_risk_profile_page_select_cdd_with_the_incomplete_cdd_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[47]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='Less than 1%']")).click();
		Thread.sleep(2000);
	    
	}

	@Given("User Risk Profile page PEPs select  identity whether customers PEps option")
	public void user_risk_profile_page_pe_ps_select_identity_whether_customers_p_eps_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[48]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
	  
	}

	@Given("User Risk Profile page PEPs select PEP screening option")
	public void user_risk_profile_page_pe_ps_select_pep_screening_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[49]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[normalize-space()='Both']")).click();
		Thread.sleep(2000);
	   
	}

	@Given("User Risk Profile page PEps select persons idenentified as PEps option")
	public void user_risk_profile_page_p_eps_select_persons_idenentified_as_p_eps_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[50]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[text()='Quarterly']")).click();
		Thread.sleep(2000);
		
	   
	}

	@Given("User Risk Profile page PEps select cutomer base PEPs option")
	public void user_risk_profile_page_p_eps_select_cutomer_base_pe_ps_option() throws InterruptedException {
		
		testContextSetup.driver.findElement(By.xpath("(//div[@class='mat-form-field-flex'])[51]")).click();
		
		testContextSetup.driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='N/A']")).click();
		Thread.sleep(2000);
	    
	}

	@Given("User Risk Profile page PEps select identified PEPs have NOT option")
	public void user_risk_profile_page_p_eps_select_identified_pe_ps_have_not_option() throws InterruptedException {
		

	     JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-infix'])[52]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		 
	     jsexecutor.executeScript("document.evaluate(\"//mat-option[@id='mat-option-209' or @value='5 to 10%']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(1000);		
		
		
	}

	@Given("User Risk Profile page PEps select classifed as PEP option")
	public void user_risk_profile_page_p_eps_select_classifed_as_pep_option() throws InterruptedException {
		
	    JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	    jsexecutor.executeScript("document.evaluate(\"//mat-select[@name='pctCustsPepsDeclassified']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		 
	    jsexecutor.executeScript("document.evaluate(\"//span[@class='mat-option-text'][normalize-space()='N/A']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(1000);	
	}

	@Given("User Risk Profile page PEPs select UN option")
	public void user_risk_profile_page_pe_ps_select_un_option() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-flex'])[54]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		 
			
		jsexecutor.executeScript("document.evaluate(\"//span[@class='mat-option-text'][normalize-space()='No']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(1000);	
		
	   
	}

	@Given("User Risk Profile page PEPs select Automatically option")
	public void user_risk_profile_page_pe_ps_select_automatically_option() throws InterruptedException {
		

		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-flex'])[55]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		 
			
		jsexecutor.executeScript("document.evaluate(\"//span[normalize-space()='Manual']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(1000);	
		
		
	}

	@Given("User Risk Profile page PEPs select Screening conducted option")
	public void user_risk_profile_page_pe_ps_select_screening_conducted_option() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-flex'])[56]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		 
			
		jsexecutor.executeScript("document.evaluate(\"//span[normalize-space()='Weekly']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(1000);	
		
		
		
		
	   
	}

	@Given("User Risk Profile page added to sanctions option")
	public void user_risk_profile_page_added_to_sanctions_option() throws InterruptedException {
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) testContextSetup.driver;
		
	     jsexecutor.executeScript("document.evaluate(\"(//div[@class='mat-form-field-flex'])[57]\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		
			
		jsexecutor.executeScript("document.evaluate(\"//span[@class='mat-option-text'][normalize-space()='Yes']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.click();");
		Thread.sleep(1000);
		
		
	  
	}

	@Given("User Risk Profile has clickd on Risk monitoring button")
	public void user_risk_profile_has_clickd_on_risk_monitoring_button() throws InterruptedException {
	    
		testContextSetup.driver.findElement(By.xpath("//button[@class='action-buttons nextbutton mat-button mat-button-base _mat-animation-noopable']//span[@class='mat-button-wrapper'][normalize-space()='Risk Monitoring']")).click();
		Thread.sleep(4000);
	}



	

}
