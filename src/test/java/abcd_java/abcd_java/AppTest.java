package abcd_java.abcd_java;


import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void test1(){
		System.out.println("Pass");
		System.out.println("Job Number : "+ System.getProperty("Job_Number"));
		System.out.println("User Directory : "+System.getProperty("user.dir"));
	}
}
