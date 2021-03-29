package thirdTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * I am still working on this. 
 * I will find the most efficient way to lay this out in the future.
 * 
 */


public class thirdSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/michelle/Desktop/Selenium/Drivers/chromedriver_linux64/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
		
			driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
			Thread.sleep(500);
			
			driver.findElement(By.name("firstname")).sendKeys("Michelle");
			driver.findElement(By.name("lastname")).sendKeys("Scheuer");
			
			driver.findElement(By.name("reg_email__")).sendKeys("testemail@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("password");
	
		
			driver.findElement(By.name("birthday_month")).sendKeys("April");
			driver.findElement(By.name("birthday_day")).sendKeys("1");
			driver.findElement(By.name("birthday_year")).sendKeys("1905");
			
			
			driver.findElement(By.name("sex")).click();
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//f_name.sendKeys("password");
				
	/*		
		WebElement email = driver1.findElement(By.id("email"));
		WebElement pswd = driver1.findElement(By.id("pass"));		
			email.sendKeys("tester@gmail.com");
			pswd.sendKeys("QWERTY");
			driver1.findElement(By.name("login")).click();
		
			
		Thread.sleep(5000);
		driver1.navigate().to(URL);	
		*/
			
		

		
		//HOW DO I CLICK ON THE ADD NAME 
	
	
		/*
				WebElement fName = driver1.findElement(By.name("u_11_b_oB"));
				WebElement lName = driver1.findElement(By.name("lastname"));
				WebElement regEmail = driver1.findElement(By.name("reg_email__"));
				WebElement regPswd = driver1.findElement(By.name("reg_passwd__"));
		
		*/
					//
		//fName.sendKeys("Michael");
					//lName.sendKeys("Jackson");
					//regEmail.sendKeys("Ahheehee1234@gmail.com");
					//regPswd.sendKeys("MJ2000");
				
				
				
				
				
				
	
		
		
	}
}
