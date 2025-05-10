import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
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
		
		
	}

}
