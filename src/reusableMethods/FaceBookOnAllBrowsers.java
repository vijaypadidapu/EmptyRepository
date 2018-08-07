package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FaceBookOnAllBrowsers {

	public void AllBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.close();

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		
		driver1.get("http://www.facebook.com");
		
		driver1.manage().window().maximize();
		driver1.close();

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijay Krishna\\Desktop\\MicrosoftWebDriver.exe");
		
		WebDriver driver2 = new InternetExplorerDriver();

		driver2.get("http://www.facebook.com");
		
		driver2.manage().window().maximize();
		driver2.close();

	}

}
