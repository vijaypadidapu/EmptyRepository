package Test_Scripts;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class VersionOfBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.get("http://facebook.com");

		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();

		String browserName = cap.getBrowserName();

		System.out.println(browserName);
		
		String os = cap.getPlatform().toString();
		
		System.out.println(os);
		
		String v= cap.getVersion().toString();
		
		System.out.println(v);


	}

}
