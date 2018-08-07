package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import reusableMethods.RealDemo;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
       
	    // Find username textbox
		
		driver.findElement(By.id("email")).sendKeys("p.vijaykrishna77@gmail.com");
		
		//Find password text box and enter text
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		//Login button
		
		driver.findElement(By.id("loginbutton")).click();
	}

}
