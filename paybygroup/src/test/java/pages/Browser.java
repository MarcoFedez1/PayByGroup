package pages;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Browser {
	private static String prod = "https://go-test.paybygroup.com/signup";
	public static String appUrl = prod;
	//Method to create driver 
	public static WebDriver LaunchBrowser(String browserName) throws MalformedURLException {
        WebDriver driver= null;
		
        switch(browserName) {	        
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/Users/testjdaqa/Downloads/chromedriver");
			//set up incognito chrome windows
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			//create Chrome driver
			driver = new ChromeDriver(options);
			break;
		}
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
		
	}
}
