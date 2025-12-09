package TestUtils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

   
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test succeeded: " + result.getName());
    }


    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }
	
	
}
