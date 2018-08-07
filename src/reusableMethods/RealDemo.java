package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class RealDemo {

	public void InvokeBrowser(String s1, String s2) {

		switch (s1) {

		case "Chromebrowser": {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get(s2);
			break;
			// browser invoke
		}
		case "Firefoxbrowser": {

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(s2);
			break;
		}
		case "IEbrowser": {

			System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijay Krishna\\Desktop\\MicrosoftWebDriver.exe");
			WebDriver driver = new InternetExplorerDriver();

			driver.get(s2);
			break;
		}

		}

	}

}
