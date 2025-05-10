package Accessmodifier2;

import Accessmodifier1.AccessModifiers;

public class AccessModifiersTest extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj = new AccessModifiers();
		obj.method1(); // -- Has access due to public
		//obj.method2(); -- No access due to default which is package private
		//obj.method3(); -- No access due to private
		//obj.method4(); -- No access due to protected unless child parent relation exists
		method4(); // -- If declared static then this method is accessible without an object
		method5(); // -- If declared static then this method is accessible without an object
		method8(); // -- If declared static then this method is accessible without an object
	}

}
