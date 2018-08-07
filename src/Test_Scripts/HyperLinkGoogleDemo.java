package Test_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkGoogleDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 0; i <links.size(); i++) {

			
			
			if(!links.get(i).getText().contentEquals("")){
				System.out.println("Link : "+i +" : "+links.get(i).getText());
			}
		}

	}

}
