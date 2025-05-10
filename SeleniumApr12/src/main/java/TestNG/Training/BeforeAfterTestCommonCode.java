package TestNG.Training;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BeforeAfterTestCommonCode {
	
	WebDriver driver;
	
	@BeforeClass
	public void CommonBrowserSession() {
		driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	
	@AfterClass
	public void CloseBrowserSession() {
		driver.quit();
	}
}
