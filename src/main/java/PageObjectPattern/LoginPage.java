package PageObjectPattern;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{

	public WebDriver driver;
	By email=By.name("email");
	By passwd=By.id("user_password");
	By submit=By.name("commit");
	By Fg=By.xpath("//a[contains(text(),'Forgot Password?')]");
	By popup=By.xpath("button[text()='NO THANKS']");
	
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement email()
	{
		return driver.findElement(email);
	}

	public WebElement password()
	{
		return driver.findElement(passwd);
	}
	

	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	 public ForgotPasswordPage forgotPassword()
	 {
		   driver.findElement(Fg).click();
		   ForgotPasswordPage fp=new ForgotPasswordPage(driver);
		   return fp;
	 }
	 public List<WebElement> getPopupSize()
		{
			return driver.findElements(popup);
		}
	 public WebElement getPopup()
	 {
		 return driver.findElement(popup);
	 }
		
	
}
