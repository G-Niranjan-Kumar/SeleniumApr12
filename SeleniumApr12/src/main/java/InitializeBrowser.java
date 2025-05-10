import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InitializeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.ca");
		String url = driver.getCurrentUrl();
		System.out.println("The current url is : "+url);
		String title = driver.getTitle();
		System.out.println("The title of the website is :"+title);
		
		if(driver.getTitle().contains("Google")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		driver.getPageSource(); //prints the full source code of the page opened
		
		driver.quit();
	}

}
