import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class HandleWebTable {


	static WebDriver driver;

	@BeforeTest
	public void Before() {
		driver = new EdgeDriver(); // ClassName obj = new ClassName();
		driver.get("http://seleniumpractise.blogspot.com/"); //faster
	}

	@Test
	public static void verifyHeaders() {
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']//th")); //5
		boolean b = false;
		for(WebElement e: headers) {     //for(dataType Temp: collections)
			if(e.getText().contains("Company"));
			b = true;
		}
		Assert.assertEquals(headers.size(), 5);
		Assert.assertTrue(b); 
	}

	@Test
	public static void verifyRows() {
		List<WebElement> rows = new ArrayList<WebElement>();
		rows = driver.findElements(By.xpath("//table[@id='customers']//tr")); //7
		Assert.assertEquals(rows.size()-1, 6);    
	}

	@Test
	public static void verifyTableData() {
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']//td"));
		System.out.println("Table Data : "+allData.size());
		boolean flag = false;
		for(WebElement e: allData) {
			if(e.getText().contains("Ola")) {
				flag = true;
			}
		}
		Assert.assertTrue(flag); // Pass
		Assert.assertEquals(allData.size(), 30);
	}
	@Test
	public static void verifyColumnData() {
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']//td[2]"));
		System.out.println("Column Data : "+allData.size());
		boolean flag = false;
		for(WebElement e: allData) {
			System.out.println(e.getText());
			if(e.getText().contains("Java")) {
				flag = true;
			}
		}
		Assert.assertTrue(flag);
	}
	@Test
	public static void verifyCheckbox() {
		WebElement checkbox = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr//td[text()='Ola']//preceding-sibling::td"));
		checkbox.click();
	}

	/*
	 * @AfterTest public void After() { driver.quit(); }
	 */
}



