package reusableMethods;

import org.openqa.selenium.Capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AllBrowserVersion {

	public void allBrowserVersion() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();

		String browserName = cap.getBrowserName();

		System.out.println(browserName);

		String v = cap.getVersion().toString();

		System.out.println(v);

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();

		Capabilities cap1 = ((RemoteWebDriver) driver1).getCapabilities();

		String browserName1 = cap1.getBrowserName();

		System.out.println(browserName1);

		String v1 = cap1.getVersion().toString();

		System.out.println(v1);

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijay Krishna\\Desktop\\MicrosoftWebDriver.exe");
		WebDriver driver2 = new InternetExplorerDriver();

		Capabilities cap2 = ((RemoteWebDriver) driver2).getCapabilities();

		String browserName2 = cap2.getBrowserName();

		System.out.println(browserName2);

		String v2 = cap2.getVersion().toString();

		System.out.println(v2);
	}
}
