package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingFbLabels {

	public void fbLabels(String s1, String s2, String s3, String Email, String Password) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");

		WebElement Empho = driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[1]/td[1]/label"));

		String str = Empho.getText();

		System.out.println("The text above the Email field is  field is: " + str);

		driver.findElement(By.id("email")).sendKeys(Email);

		if (str.equals("Email or Phone")) {
			System.out.println("Test case is passed ");
		} else {
			System.out.println("Test case is failed");
		}

		WebElement pass = driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[1]/td[2]/label"));

		String str1 = pass.getText();
		System.out.println("The text above the passwoord filed is :" + str1);

		driver.findElement(By.id("pass")).sendKeys(Password);

		if (str1.equals("Password")) {

			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}

		driver.findElement(By.id("loginbutton")).click();

		WebElement page = driver.findElement(By.xpath("//*[@id=\'header_block\']/span"));

		String str2 = page.getText();

		System.out.println("The text after login page is:" + str2);

		if (str2.equals("Log into Facebook")) {

			System.out.println("Test case is passed");
		} else {
			System.out.println("Test case is failed");
		}

	}

}
