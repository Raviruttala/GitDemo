package AcademyProject.End2End;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectPattern.LandingPage;
import PageObjectPattern.LoginPage;
import resources.base;

public class Homepage1 extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	LandingPage lp=new LandingPage(driver);
	@BeforeTest
	public void intilize() throws IOException
	{
driver=intializeDriver();
		
driver.get(prop.getProperty("url"));
	}
	

	@Test
	public void homPageNavigation() 
	{
		
	
		
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COU12RSES");
		log.info("finishe comparision");
		}
	@Test
	public void banner() 
	{
		Assert.assertEquals(lp.getTitle().getText(), "acadamic");
		
	}
	@AfterTest
	public void windowsClose()
	{
		driver.close();
	}
}
