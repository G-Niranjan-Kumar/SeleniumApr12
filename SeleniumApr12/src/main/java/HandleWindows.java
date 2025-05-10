import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
		
		Thread.sleep(2000);
		
		Set<String> allTabs = driver.getWindowHandles();
		List<String> allTabsinList = new ArrayList<String>(allTabs);
		
		String firstTab=allTabsinList.get(0);
		String secondTab=allTabsinList.get(1);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		driver.switchTo().window(firstTab);
		Thread.sleep(2000);
		
		driver.switchTo().window(secondTab);
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
