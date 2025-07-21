package stepdefinations;


import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) {
		
		//testContextSetup.driver;
		
	
		
		
		if(scenario.isFailed()) {
			
			//((TakesScreenshot)testContextSetup.driver)
			
			//testContextSetup.driver.
		}
		
	}

}
