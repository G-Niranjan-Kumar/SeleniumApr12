import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BooleanOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		Boolean search = driver.findElement(By.id("checkbox1")).isDisplayed();
		System.out.println("Web element found : "+search);
		driver.findElement(By.id("checkbox2")).click();
		Boolean isSelected = driver.findElement(By.id("checkbox2")).isSelected();
		System.out.println("Web element is selected? : "+isSelected);
		Boolean isEnabled = driver.findElement(By.id("checkbox3")).isEnabled();
		System.out.println("Web element is enabled? : "+isEnabled);
		driver.quit();
	}

}
