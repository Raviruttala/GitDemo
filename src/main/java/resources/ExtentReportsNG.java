package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG
{
	static ExtentReports extent;
	public  static ExtentReports getReportsObject()
	{

		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter repoter=new ExtentSparkReporter(path);
		repoter.config().setReportName("Web Automation Results");
		repoter.config().setDocumentTitle("Extent Results");
		
		extent=new ExtentReports(); 
		extent.attachReporter(repoter);
		extent.setSystemInfo("Tester", "RaviRuttala");
		return extent;
	}

}
