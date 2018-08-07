package Test_Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VisibleLinksCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total Number of Links is: "+links.size());
		
		int count =0;
		
		for(int i=0;i<links.size();i++) {
			
			if(!links.get(i).getText().isEmpty()) {
				
				count++;
				
			}
		}
		System.out.println("Visible Links Count =" +count);
		
		System.out.println("Hidden Links Count =" +(links.size()-count));
		

	}

}
