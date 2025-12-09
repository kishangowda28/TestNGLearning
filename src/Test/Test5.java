package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test5 {

	@Test(enabled=false)
	public void MobileLoginCarLoan() {
		System.out.println("Test51MobileLoginCarLoan");
	}
	@Test(dataProvider= "getDataone")
	public void MobileLogoutCarLoan(String FirstData1,String SecondData1)
	{
		System.out.println("Test52mobileLogoutCarLoan");
		System.out.println(FirstData1);
		System.out.println(SecondData1);
		
	}
	@Test(groups= {"smoke"})
	public void apiLoginCarLoan() {
		System.out.println("Test53apiLoginCarLoan");
	}
	@Test(dataProvider = "getData2")
	public void MobileForgotPasswordCarLoan(String FirstData, String SecondData) {
		System.out.println("Test54mobileForgotPasswordCarLoan");
		System.out.println(FirstData);
		System.out.println(SecondData);
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite execution completed");
	}
	
	@DataProvider
	public Object[][] getDataone() {
		Object[][] testData1 = {{"First row First  Data", "Second row Second Data"}};
		return testData1;
	}
	
	@DataProvider
	public Object[][] getData2() {
		Object[][] testData = { {"First row First  Data", "Second row Second Data"},
				              {"Second row First  Data", "Second row Second Data"}
		                    };
		return testData;
	}
	
}
