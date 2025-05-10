package TestNG.Training;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BeforeAfterTestAnnotation2 extends BeforeAfterTestCommonCode{
	
	@Test
	public void HandleAlerts() throws InterruptedException {
		// TODO Auto-generated method stub
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
	
	@Test
	public void HandleFrames() {
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")).click();
		
		WebElement frame = driver.findElement(By.id("singleframe"));
		
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing Frame inputbox");
		
		driver.switchTo().defaultContent(); //the driver is now pointed to the main page and out of the frame
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement parent = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(parent);
		WebElement child = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(child);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing nested frame inputbox");
		
		driver.switchTo().defaultContent(); //the driver is now pointed to the main page and out of the frames
		
	} 
	
}
