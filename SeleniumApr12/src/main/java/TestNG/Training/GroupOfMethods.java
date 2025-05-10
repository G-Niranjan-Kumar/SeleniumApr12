package TestNG.Training;

import org.testng.annotations.Test;

public class GroupOfMethods {
	
	@Test(groups="High Pri")
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups="High Pri")
	public void Test2() {
		System.out.println("Test 2");
	} 
	
	@Test(groups="Low Pri")
	public void Test3() {
		System.out.println("Test 3");
	} 
	
	@Test(groups="High Pri")
	public void Test4() {
		System.out.println("Test 4");
	} 
	
	@Test(groups="Low Pri")
	public void Test5() {
		System.out.println("Test 5");
	} 

}
