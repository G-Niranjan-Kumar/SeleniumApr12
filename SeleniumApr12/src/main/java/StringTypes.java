import java.util.regex.Pattern;

public class StringTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "1234";
		String y = new String("1234");
		System.out.println(x+" "+y);
		x = "2345";
		y = "2345";
		System.out.println(x+" "+y);
		System.out.println(x.length()+" "+y.length());
		
		System.out.println(x.charAt(0));
		
		//Reversing a string
		
		for(int i=y.length()-1;i>=0;i--) {
			System.out.print(y.charAt(i));
		}
		
		System.out.println("");
		//Reversing a sentence
		String message = "This is a test messsage";
		String[] reverse = message.split(" ");
		
		  for(int i=reverse.length-1;i>=0;i--) 
		  { System.out.print(reverse[i]+" "); }
		 
	}

}
