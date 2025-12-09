package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
    
	@Parameters({"xmlparameterized1","xmlparameterized2"})
	@Test
	public void demo1(String xmlsuitelevelvalue1, String xmlsuitelevelvalue2) {
	System.out.println("Test11 First Testcase");
	System.out.println(xmlsuitelevelvalue1);
	System.out.println(xmlsuitelevelvalue2);
	}
	
	@Test
	public void demo2() {
	System.out.println("Test12 Second Testcase");
	}

   @BeforeTest
   public void beforeTest() {
		System.out.println("Before testfolder execution started");
		}
   
   @BeforeMethod
   public void beforeMethod() {
		System.out.println("Before testmethod execution started");
		}
   
   @AfterMethod
   public void afterMethod() {
		System.out.println("After testmethod execution completed");
		}
}
