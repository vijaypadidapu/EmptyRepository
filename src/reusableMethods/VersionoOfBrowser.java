package reusableMethods;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VersionoOfBrowser {

	public void browserversion(String s1) {
		
		if(s1.contentEquals("Chromebrowser")) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.get("http://facebook.com");

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();

		String browserName = cap.getBrowserName();

		System.out.println(browserName);
		
		Platform os = cap.getPlatform().WIN10;
		
		System.out.println(os);
		System.out.println(System.getProperty("os.name"));
		
		String v= cap.getVersion().toString();
		
		System.out.println(v);
		
		}
		
		else if(s1.equals("Firefoxbrowser")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//driver.get("http://www.facebook.com");
			
			Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();

			String browserName = cap.getBrowserName();

			System.out.println(browserName);
			
			String os = cap.getPlatform().toString();
			
			System.out.println(os);
			System.out.println(System.getProperty("os.name"));
			
			String v= cap.getVersion().toString();
			
			System.out.println(v);
			
		}
		else  if (s1.contentEquals("IEbrowser")) {
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijay Krishna\\Desktop\\MicrosoftWebDriver.exe");
			WebDriver driver = new InternetExplorerDriver();

			driver.get("http://www.facebook.com");
			Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();

			String browserName = cap.getBrowserName();

			System.out.println(browserName);
			
			String os = cap.getPlatform().toString();
			
			System.out.println(os);
			
			System.out.println(System.getProperty("os.name"));
			String v= cap.getVersion().toString();
			
			System.out.println(v);
			
			
		}

	}

}
