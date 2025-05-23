package org.example;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerCase  implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println("ITestListenerCase Test START : This method is invoked before each test starts");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("ITestListenerCase Test SUCCESS : This method is invoked before each test success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("ITestListenerCase Test FAIL : This method is invoked before each test failed");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("ITestListenerCase Test case SKIP");
    }
}
