package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
    
	@Parameters({"xmlparameterized"})
	@Test
	public void webLoginCarLoan(String xmlsuitelevelvalue) {
		System.out.println("Test41webLoginCarLoan");
		System.out.println(xmlsuitelevelvalue);
	}
	
	@Test(dependsOnMethods={"webLoginCarLoan"})
	public void mobileLoginCarLoan() {
		System.out.println("Test42mobileLoginCarLoan");
	}
	@Test
	public void mobileLogoutCarLoan() {
		System.out.println("Test43mobileLogoutCarLoan");
	}
	
	@Test
	public void apiLoginCarLoan() {
		System.out.println("Test44apiLoginCarLoan");
	}
	@Test(dataProvider = "getData")
	public void webLogoutCarLoan(String FirstData,String SecondData) {
		System.out.println("Test45webLogoutCarLoan");
		System.out.println(FirstData);
		System.out.println(SecondData);
	}
    
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite execution started");
	}
	
	@DataProvider
	public Object[][] getData() {
		
	return	new Object[][]{ {"First row First  Data", "Second row Second Data"},
				              {"Second row First  Data", "Second row Second Data"}
		                    };
		
	}
	
	

}
