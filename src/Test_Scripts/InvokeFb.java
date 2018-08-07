package Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InvokeFb {

	public static void main(String[] args) {
		// invoke Fb Application
		
		
		
		DesiredCapabilities dp = new DesiredCapabilities();
		
		dp.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

		// Open The Chrome browser and enter the valid url, press enter

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");
		 * 
		 * WebDriver driver = new ChromeDriver(); // Enter the URL //
		 * driver.get("URL");----> Method-1
		 * 
		 * // driver.get("http://www.facebook.com");
		 * 
		 * // driver.Navigate().to("URL");---->Method-2
		 * 
		 * // maximize the browser
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.navigate().to("http://www.facebook.com");
		 * 
		 * //Delete cookies driver.manage().deleteAllCookies();
		 * 
		 * // Verify face book title is displayed as expected String expTitle =
		 * "Facebook - Log In or Sign Up";
		 * 
		 * String acTitle = driver.getTitle();
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * if (expTitle.contentEquals(acTitle)) {
		 * 
		 * System.out.println("Test Case is Pass"); } else {
		 * 
		 * System.out.println("Test case is fail"); } // close the browser
		 * driver.close();closes only active window---> Method-1 driver.close(); //
		 * close the browser driver.quit();closes all the windows or terminates all the
		 * // browser windows----> Method-2 // driver.quit();
		 * driver.navigate().forward(); driver.navigate().refresh();
		 */
		// FireFox Driver
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe"); WebDriver driver = new
		 * FirefoxDriver();
		 * 
		 * driver.get("http://www.facebook.com"); System.out.println(driver.getTitle());
		 */

		// IE Driver

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vijay Krishna\\Desktop\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());

	}

}
