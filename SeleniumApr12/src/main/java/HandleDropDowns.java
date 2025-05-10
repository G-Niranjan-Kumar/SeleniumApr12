import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html"); //default wait time is 60 seconds
		driver.manage().window().maximize();
		//this implicit wait overrides the default wait time to 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select options = new Select(dropdown); //invoking constructor by passing the arguments
		options.selectByValue("Adobe Photoshop");
		options.selectByIndex(2);
		options.selectByVisibleText("Adobe Photoshop");
		
		driver.get("https://demoqa.com/select-menu");
		Select select = new Select(driver.findElement(By.id("cars")));
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		select.selectByIndex(3);
		select.deselectByValue("audi");
		select.deselectAll();
		Boolean isSelectMultiple = select.isMultiple();
		System.out.println(isSelectMultiple);
		select.selectByIndex(0);
		select.selectByIndex(3);
		List<WebElement> selectedElements = select.getAllSelectedOptions();
		System.out.println(selectedElements);
		
		List<WebElement> allElements = select.getOptions();
		System.out.println(allElements);
		for(int i=0;i<allElements.size();i++) {
			System.out.println(allElements.get(i));
		}
		for(WebElement item: allElements) {
			System.out.println(item);
		}
		//driver.quit();
	}

}
