import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement filebutton = driver.findElement(By.xpath("//input[@type='file']")); 
		 String filename = "D:\\Personal\\Selenium\\Busy QA Training\\demo\\demo\\UnionBank.java";
		    File file = new File(filename);
		    String path = file.getAbsolutePath();
		    // give the URL to upload
		    filebutton.sendKeys(path);
	}
}
