package Test_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelelements {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		List<WebElement> la=driver.findElements(By.className("html7magic"));
		
		int length = la.size();
		
		System.out.println("number of elements: " + length);
		
		String Email = la.get(0).getText();
		String Pass  = la.get(1).getText();
		
		if(Email.equals("Email or Phone")) {
			
			System.out.println("Email Test Case is passed");
		}
		else {
			System.out.println("Test Case is failed");
		}
		
		if(Pass.equals("Password")) {
			System.out.println("Password  Test case is passed");
		}
		else {
			System.out.println("Test case is failed");
		}
		
		/*for(int i=0; i<length; i++) {
			System.out.println(la.get(i).getText());
		}*/

	}

}
