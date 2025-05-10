import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo{

	public static void main(String[] args) {

		//Step 1 - open browser
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.cnbc.com/");
			driver.quit();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		//Data types
	    int myNum = 5;               // integer (whole number)
	    float myFloatNum = 5.99f;    // floating point number
	    char myLetter = 'D';         // character
	    boolean myBool = true;       // boolean
	    String myText = "Hello";     // String    
	    System.out.println(myNum);
	    System.out.println(myFloatNum);
	    System.out.println(myLetter);
	    System.out.println(myBool);
	    System.out.println(myText);
		
	}

}
