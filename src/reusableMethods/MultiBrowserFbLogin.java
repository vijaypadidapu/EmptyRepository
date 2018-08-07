package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowserFbLogin {

	public void FbMultiBrowserLogin(String Email, String Password) {

		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys(Email);

		driver.findElement(By.id("pass")).sendKeys(Password);

		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();

		// FireFox Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();

		driver1.get("http://www.facebook.com");

		driver1.findElement(By.id("email")).sendKeys(Email);

		driver1.findElement(By.id("pass")).sendKeys(Password);

		driver1.findElement(By.id("loginbutton")).click();

		// Internet Explorer Browser
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijay Krishna\\Desktop\\MicrosoftWebDriver.exe");

		WebDriver driver2 = new InternetExplorerDriver();

		driver2.get("http://www.facebook.com");

		driver2.findElement(By.id("email")).sendKeys(Email);

		driver2.findElement(By.id("pass")).sendKeys(Password);

		driver2.findElement(By.id("loginbutton")).click();

	}
}
