package AcademyProject.End2End;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 
import org.testng.annotations.Test;

import PageObjectPattern.LandingPage;

import resources.base;

public class validationNavigationBar extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void intilize() throws IOException
	{
driver=intializeDriver();
		
driver.get(prop.getProperty("url"));
	log.info("url is intialize");
		
	}

	@Test
	public void homPageNavigation() 
	{
		
		LandingPage lp=new LandingPage(driver);
		
		Assert.assertTrue(lp.bartabs().isDisplayed());
		log.info("Navigation bar is displayed");
	}
	@AfterTest
	public void windowsClose()
	{
		driver.close();
	}
}
