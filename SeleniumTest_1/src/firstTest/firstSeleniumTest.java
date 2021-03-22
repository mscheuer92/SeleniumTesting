package firstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSeleniumTest {

	
	WebDriver driver;
	
	//Launch google chrome
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Michelle/Desktop/Selenium/Drivers/chromedriver");	
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	
	}
	
	
	public static void main(String[] args) {
		
		firstSeleniumTest obj = new firstSeleniumTest();
		obj.launchBrowser();
		

	}

}