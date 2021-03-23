package secondTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class secondSeleniumTest {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/Michelle/Desktop/Selenium/Drivers/chromedriver");	
			driver = new ChromeDriver();
			driver.get("https://www.github.com");
			driver.manage().window().maximize();
				Thread.sleep(1000);
			driver.get("https://www.odu.edu");
			driver.manage().window().fullscreen();
				System.out.println("Current URL: " + driver.getCurrentUrl());
				Thread.sleep(1000);
			driver.close();
	
		
	}

}
