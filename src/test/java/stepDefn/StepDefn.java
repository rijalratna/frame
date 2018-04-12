package stepDefn;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import colln.ScreenShoot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import cucumber.api.java8.En;

public class StepDefn implements En{
	
public static WebDriver driver;
	@Given("^i am ratna$")
	public void Given() {
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	@Then("^go to school$")
	public void thens() {
		

			driver.findElement(By.id("email")).sendKeys("hello");
			driver.findElement(By.id("pass")).sendKeys("hehheleo");
		
	}
	
	@Before
    public void beforeScenario(Scenario scen){
        scen.write("This will run before the Scenario");
    }	
	
	@After
    public void afterScenario(Scenario scen) {
		scen.write("This will run after the Scenario");
        if(scen.isFailed()) {
			scen.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES),"images/png");
			ScreenShoot.ScreenShot(driver);
		}

   // scen.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
       scen.write("finished");
        driver.close();
    }
}
