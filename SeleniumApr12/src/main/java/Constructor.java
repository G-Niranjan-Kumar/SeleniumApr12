
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor();
		System.out.println("Inside main method");
		Constructor obj2 = new Constructor(5);
		Constructor obj3 = new Constructor(5,6);
	}
	
	//default constructor
	public Constructor() { 
		System.out.println("Inside constructor");
	}
	
	//parameterized constructor
	public Constructor(int x) {
		System.out.println("Inside constructor one argument");
	}
	
	//parameterized constructor
	public Constructor(int x, int y) {
		System.out.println("Inside constructor two arguments");
	}

}
