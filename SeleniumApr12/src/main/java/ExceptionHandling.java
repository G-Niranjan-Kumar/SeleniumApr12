
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		try {
			//unchecked exception
			System.out.println(x/0); //java.lang.ArithmeticException: / by zero 
		}
		catch(ArithmeticException e) {
			System.out.println("Handled the exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("In the final block");
		}
		System.out.println("code not interrupted after exception");
	}
	
	public void method() {} //java.lang.Error: Unresolved compilation problem: 

}
