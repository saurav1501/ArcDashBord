package com.groupten.Listener;

import org.testng.*;

public class Listener implements ITestListener, ISuiteListener, IInvokedMethodListener {

	// This belongs to ISuiteListener and will execute before the Suite start
	public void onStart(ISuite result) {

		Reporter.log("About to begin executing Suite " + result.getName(), true);

	}

	// This belongs to ISuiteListener and will execute, once the Suite is finished
	public void onFinish(ISuite result) {

		Reporter.log("About to end executing Suite " + result.getName(), true);

	}

	// This belongs to ITestListener and will execute before starting of Test set/batch 
	public void onStart(ITestContext result) {
		Reporter.log("About to begin executing Test " + result.getName(), true);

	}

	// This belongs to ITestListener and will execute, once the Test set/batch is finished
	public void onFinish(ITestContext result) {
		Reporter.log("Completed executing test " + result.getName(), true);

	}

	// This belongs to ITestListener and will execute only when the test is pass
	public void onTestSuccess(ITestResult result) {

		// This is calling the printTestResults method
		printTestResults(result);

	}

	// This belongs to ITestListener and will execute only on the event of fail test
	public void onTestFailure(ITestResult result) {

		// This is calling the printTestResults method

		printTestResults(result);

	}

	// This belongs to ITestListener and will execute before the main test start (@Test)

	public void onTestStart(ITestResult result) {

		System.out.println("The execution of the main test starts now");

	}

	// This belongs to ITestListener and will execute only if any of the main test(@Test) get skipped
	public void onTestSkipped(ITestResult result) {

		printTestResults(result);

	}

	// This is just a piece of shit, ignore this
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	// This is the method which will be executed in case of test pass or fail

	// This will provide the information on the test

	private void printTestResults(ITestResult result) {

		Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);

		if (result.getParameters().length != 0) {

			String params = null;

			for (Object parameter : result.getParameters()) {

				params += parameter.toString() + ",";

			}

			Reporter.log("Test Method had the following parameters : " + params, true);

		}

		String status = null;

		switch (result.getStatus()) {

		case ITestResult.SUCCESS:

			status = "Pass";

			break;

		case ITestResult.FAILURE:

			status = "Failed";

			break;

		case ITestResult.SKIP:

			status = "Skipped";

		}

		Reporter.log("Test Status: " + status, true);

	}

	// This belongs to IInvokedMethodListener and will execute before every method including @Before @After @Test

	public void beforeInvocation(IInvokedMethod result, ITestResult argument) {

		String textMsg = "About to begin executing following method : " + returnMethodName(result.getTestMethod());

		Reporter.log(textMsg, true);

	}

	// This belongs to IInvokedMethodListener and will execute after every method including @Before @After @Test

	public void afterInvocation(IInvokedMethod result, ITestResult argument) {

		String textMsg = "Completed executing following method : " + returnMethodName(result.getTestMethod());

		Reporter.log(textMsg, true);

	}

	// This will return method names to the calling function

	private String returnMethodName(ITestNGMethod method) {

		return method.getRealClass().getSimpleName() + "." + method.getMethodName();

	}

}