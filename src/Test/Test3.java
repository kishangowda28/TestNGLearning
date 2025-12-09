package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
    
	
	@Parameters({"xmlparameterized"})
	@Test
	public void webLoginHomeLoan(String xmlsuitelevelvalue) {
		System.out.println("Test31 webLoginHomeLoan");
		System.out.println(xmlsuitelevelvalue);
	}
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("Test32 mobileLoginHomeLoan");
	}
	@Test
	public void apiLoginHomeLoan() {
		System.out.println("Test33 apiLoginHomeLoan");
	}


}
