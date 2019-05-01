package pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUp {

		WebDriver driver;
		public signUp (WebDriver driver){
	        this.driver = driver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(driver, this);
	    }
		//Register Page -------------------------------------------------------------------------------------------
		
		
		@FindBy(xpath = "//input[@name='fullName']")
		private WebElement full;
		
		@FindBy(xpath = "//input[@name='email']")
		private WebElement email;
		
		@FindBy(xpath = "//input[@name='password']")
		private WebElement pass;
		
		@FindBy(xpath = "//button[@class='btn btn-facebook btn-block undefined']")
		private WebElement facebook;
		
		@FindBy(xpath = "//button[@class='btn btn-primary full-width']")
		private WebElement createAccount;
	
		@FindBy(xpath = "//a[@href='/login']")
		public WebElement signIn;
		
		@FindBy(id = "email")
		private WebElement emailfb;
		
		@FindBy(id = "pass")
		private WebElement passfb;
		
		@FindBy(xpath = "//input[@name='login']")
		public WebElement loginFB;
		
		@FindBy(xpath = "//name[@name='__CONFIRM__']")
		public WebElement confirm;
		
		//Register Page -------------------------------------------------------------------------------------------
	    //Registrar
	    public void singUp(String fname, String email, String pass)
	    {
	    	this.email.clear();
	    	this.full.clear();
	    	this.pass.clear();
	    	this.full.sendKeys(fname);
	    	this.email.sendKeys(email);
	    	this.pass.sendKeys(pass);
	    	createAccount.click();
	    	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    }
	    public void singInFB(String email, String pass)
	    {
	    	this.emailfb.clear();
	    	this.passfb.clear();
	    	this.emailfb.sendKeys(email);
	    	this.passfb.sendKeys(pass);
	    	loginFB.click();
	    	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	    }
	    public void clickFacebook() {
	    	facebook.click();
	   
	    }
	    public void clickSingIn() {
	    	signIn.click();
	    }
	    
		public void SwitchWinTabs() {
			// It will return the parent window name as a String
			String parent=driver.getWindowHandle();
		    // This will return the number of windows opened by Webdriver and will return Set of St//rings
		 	Set<String>s1=driver.getWindowHandles();
		 	// Now we will iterate using Iterator
		 	Iterator<String> I1= s1.iterator();
		 	while(I1.hasNext())
		 	{
		 		
		 		String child_window=I1.next();
		   		// Here we will compare if parent window is not equal to child window then we            will close
		 		if(!parent.equals(child_window))	  {
		 			driver.switchTo().window(child_window);
		 		}
		 	}
		}
		
		public void clickConfirm() {
			confirm.click();
		}
		
		
}