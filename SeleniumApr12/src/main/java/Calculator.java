
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator maths = new Calculator();
		maths.add(4,5);
		maths.subtract(4,5);
		int mul = maths.multiply(4, 5);
		System.out.println(mul);
		
		int y = Calculator(5);
		System.out.println(y);
	}
	
	public static int Calculator(int x) {
		return 5;
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

}
