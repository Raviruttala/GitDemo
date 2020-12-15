package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage
{
	public WebDriver driver;
 	By email=By.id("user_email");
 	By SendMeButton=By.name("commit");
 
	
 	public ForgotPasswordPage(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("rAXHGCH");
	} 
 

 
 public WebElement email()
 {
	 return driver.findElement(email);
 }
 public WebElement SendMeInstruction()
 {
	 return driver.findElement(SendMeButton);
 }
}
