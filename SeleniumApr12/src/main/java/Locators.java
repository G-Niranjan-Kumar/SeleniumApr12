import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		driver.findElement(By.name("q")).sendKeys("who is prime minister of India");
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.id("sb_form_q")).clear();
		driver.findElement(By.id("sb_form_q")).sendKeys("who is president of India");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(5000);
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.className("btn_action")).click();
		Thread.sleep(5000);
		
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home")).click();
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("input#user-name")); //tagname#id or tagname.class
		driver.findElement(By.cssSelector("div.login-box")); //should be unique
		
		driver.get("https://www.google.com/");
		System.out.println(driver.findElement(By.tagName("title")).getTagName());
		System.out.println(driver.findElement(By.tagName("title")).getText());
		System.out.println(driver.findElement(By.tagName("title")).getAttribute("textContent"));
		System.out.println(driver.findElement(By.tagName("title")).getAttribute("innerText"));
		System.out.println("Title of the website is : "+driver.getTitle());
		
		
		//XPath
		//input[@type='checkbox' and @value='Cricket']
		
		Thread.sleep(5000);
		driver.quit();
	}

}
