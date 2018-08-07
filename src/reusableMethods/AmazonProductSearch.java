package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductSearch {
	
	
	public void ProductAmazonSearch(String Product) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Product);
		
		driver.findElement(By.className("nav-input")).click();
		
		driver.close();
		
	}

}
