package AcademyProject.End2End;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectPattern.ForgotPasswordPage;
import PageObjectPattern.LandingPage;
import PageObjectPattern.LoginPage;
import resources.base;

public class Homepage extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void intilize() throws IOException
	{
   driver=intializeDriver();
		

	}
	

	@Test(dataProvider = "getdata" )
	public void homPageNavigation(String username,String Password,String text)
	{
		
		driver.get(prop.getProperty("url"));
		log.info("url is intialize");
		LandingPage lp=new LandingPage(driver);
	LoginPage l=(LoginPage) lp.getLogin();
		log.info("login button is clicked");
		l.email().sendKeys(username);
		l.password().sendKeys(Password);
		log.info("send the email and password");
		
		l.submit().click();
		ForgotPasswordPage fp=l.forgotPassword();
		fp.email().sendKeys("ravvhasbcjkabsc");
		fp.SendMeInstruction().click();
		}
	 @DataProvider
	 public Object[][] getdata()
	 {
		 Object[][] data=new Object[2][3];
		 data[0][0]="restricted@email.com";
		 data[0][1]="12345678";
		data[0][2]="resticted data";
		 
		data[1][0]="non-Restricted@email.com";
		 data[1][1]="987654332";
		 data[1][2]="non-RestrictedEmails";
		 
		 return data;
	}
	 @AfterTest
		public void windowsClose()
		{
			driver.close();
		}

}
