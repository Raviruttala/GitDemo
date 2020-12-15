package AcademyProject.End2End;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReportsNG;
import resources.base;

public class LIsteners extends base implements ITestListener
{
	ExtentTest test;
	ExtentReports extent =ExtentReportsNG.getReportsObject();
	
	ThreadLocal<ExtentTest> threadextent=new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result)
	{
		// TODO Auto-generated method stub
		test =extent.createTest(result.getMethod().getMethodName());
		threadextent.set(test);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		threadextent.get().log(Status.PASS,"test is passed success");
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	
	{
		threadextent.get().fail(result.getThrowable());
		WebDriver driver=null;
	String	testmethodname=result.getMethod().getMethodName();
	try {
		driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		
	} 	
	try {
		threadextent.get().addScreenCaptureFromPath(getScreenshotpath(testmethodname,driver), result.getMethod().getMethodName())
		;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		// TODO Auto-generated method stub
		threadextent.get().log(Status.SKIP,"test is skipped ");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		threadextent.get().log(Status.FAIL,"Test Failed But WithinSuccess Percentage");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		// TODO Auto-generated method stub
		threadextent.get().log(Status.FAIL,"Test Failed With Timeout");
		
	}

	@Override
	public void onStart(ITestContext context) 
		{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}
