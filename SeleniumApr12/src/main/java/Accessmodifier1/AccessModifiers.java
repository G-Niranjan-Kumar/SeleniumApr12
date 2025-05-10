package Accessmodifier1;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj = new AccessModifiers();
		obj.method1();
		obj.method2();
		obj.method3();
		method4(); //If declared static then this method is accessible without creating an object
		method5(); //If declared static then this method is accessible without creating an object
		method6(); //If declared static then this method is accessible without creating an object
		method7(); //If declared static then this method is accessible without creating an object
		method8(); //If declared static then this method is accessible without creating an object
	}
	
	public void method1() {}
	
	void method2() {}
	
	private void method3() {}
	
	protected static void method4() {}
	
	public static void method5() {}
	
	static void method6() {}
	
	private static void method7() {}
	
	protected static void method8() {}
	
	

}
