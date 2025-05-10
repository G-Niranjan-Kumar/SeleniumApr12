import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InterfaceClass implements InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass maths = new InterfaceClass();
		maths.add(4,5);
		maths.subtract(4,5);
		int mul = maths.multiply(4, 5);
		System.out.println(mul);
		maths.divide();
		
		//Interface object created from the class, obj can be used to invoke other methods
		InterfaceTest obj = new InterfaceClass();
		
		//Similarly Webdriver interface obj created from the chromedriver class
		//same object can be used to invoke the other methods in the interface
		WebDriver driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver = new SafariDriver();
		
		//chromedriver object can be used to to invoke only the chromedriver method.
		ChromeDriver objChrome = new ChromeDriver();

	}
	
	/*
	 * public void add() { int a = 4; int b = 5; int c = a+b; System.out.println(c);
	 * }
	 */
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	/*
	 * public void subtract() { int a = 4; int b = 5; int c = b-a;
	 * System.out.println(c); }
	 */
	
	public void subtract(int a, int b) {
		int c = b-a;
		System.out.println(c);
	}
	
	public int multiply(int a, int b) {
		int c = a*b;
		return c;
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		System.out.println(a/b);
		
	}

}
