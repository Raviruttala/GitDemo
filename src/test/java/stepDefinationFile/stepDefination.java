package stepDefinationFile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import PageObjectPattern.LandingPage;
import PageObjectPattern.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import resources.base;

@RunWith(Cucumber.class)
public class stepDefination extends base  {
	
	LoginPage l;


    @Given("^intilize the browser with chorme$")
    public void intilize_the_browser_with_chorme() throws Throwable {
    	driver=intializeDriver();
       
    }
    @And("^click on login button in home page to land sercure sigh in$")
    public void click_on_login_button_in_home_page_to_land_sercure_sigh_in() throws Throwable {
    	LandingPage lp=new LandingPage(driver);
    
    	 l=(LoginPage) lp.getLogin();
        
    }

    @When("^user enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable  {
    	l.email().sendKeys(username);
    	l.password().sendKeys(password);
    	l.submit().click();
    	
        
    }

    @Then("^verify and login succesfull$")
    public void verify_and_login_succesfull() throws Throwable {
  
      
    }

    @And("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String strArg1) throws Throwable {
    	driver.get(strArg1);
           }
    @And("^close browser$")
    public void close_browser() throws Throwable {
        driver.close();
    }


    

}