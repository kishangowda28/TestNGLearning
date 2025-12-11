package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {

	@Test(groups= {"smoke","SMOKE"})
	public void demo1() {
	System.out.println("Test21 First Testcase");
	}
	
	@Test
	public void demo2() {
	System.out.println("Test22 Second Testcase");

	System.out.println("Test22 Second Testcase");
	
	
	

	}


   @AfterTest
   public void afterTest() {
	   System.out.println("After test folder execution completed");
   }
}
