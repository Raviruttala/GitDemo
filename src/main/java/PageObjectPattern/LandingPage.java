package PageObjectPattern;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
	public WebDriver driver;
	By Loginpageclick=By.xpath("//span[contains(text(),'Login')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By barNavigations=By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]");
	By banner=By.cssSelector("div[class*='video-banner'] p"); 
	
	
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	} 

	public LoginPage getLogin()
	{
		 driver.findElement(Loginpageclick).click();
		 LoginPage l=new LoginPage(driver);
		 return l;
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
		System.out.println("new commit");
		
	}
	public WebElement bartabs()
	{
		return driver.findElement(barNavigations);
		System.out.println("new commit");
	}

	public WebElement header()
	{
		return driver.findElement(banner);
		System.out.println("new commit");
	}

}
