package test.paybygroup.test;

import org.testng.annotations.Test;

import pages.Browser;
import pages.signUp;

import org.testng.Assert;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class signUpTest {
		WebDriver driver;
	    String Error;
	    String URL;
	    String homeURL;
	    @BeforeTest
	    public void setup() throws MalformedURLException {
	    	driver = Browser.LaunchBrowser("chrome");
	    	homeURL = driver.getCurrentUrl();
	    }
	    
	    @Test (priority = 0, description = "Verify that clicking on 'Quote' from main menu Request a Quote Page is displayed")
		public void clickQoute() throws InterruptedException {
			signUp suPage = new signUp(driver);
			suPage.singUp("Marco Fernandez", "fedez.marco1@gmail.com", "1234PayBy");
			Assert.assertEquals(driver.getCurrentUrl(), "https://go-test.paybygroup.com/my-groups");
		}
	    
}
