package TestNG.Training;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class MultipleTestCases {
	
	@Test(priority=2, description = "This test case is used to test that", groups="High Pri")
	public void inCognitoWindow() {
		// TODO Auto-generated method stub
		EdgeOptions option = new EdgeOptions();
		option.addArguments("-inprivate");
		WebDriver driver = new EdgeDriver(option);
		driver.get("https://demo.automationtesting.in/Register.html"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.quit();
	}
	
	@Test(priority=1, dependsOnMethods= {"inCognitoWindow"}, enabled=true, groups="High Pri")
	public void scrollingWindow() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int x = 750;
		int y = 850;
		js.executeScript("window.scrollBy(arguments[0],arguments[1]);", x,y);
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test(priority=3, timeOut=40000, groups="Low Pri")
	public void handleAlerts() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click(); //alert pop up appears
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept(); //Confirms the alert
		//driver.switchTo().alert().dismiss(); -- Ignore the alert
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		Alert alert = driver.switchTo().alert(); //another way of accepting or ignoring the alert popup
		
		Thread.sleep(2000);
		
		alert.dismiss();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		Alert alert1 = driver.switchTo().alert();
		
		alert1.sendKeys("Niranjan Testing");
		
		Thread.sleep(2000);
		
		alert1.accept();
		
		driver.quit();
	}

}
