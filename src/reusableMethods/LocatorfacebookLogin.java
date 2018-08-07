package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatorfacebookLogin {

	public void LocatorsFBLogin(String Email, String Password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		/*System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijay Krishna\\Desktop\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.facebook.com");*/
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(Email);

		driver.findElement(By.id("pass")).sendKeys(Password);

		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();

	}

}
