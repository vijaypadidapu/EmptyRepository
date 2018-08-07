package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonCheckBox {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay Krishna\\Desktop\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");

		driver.findElement(By.className("nav-input")).click();
		
		WebElement FSCheckbox = driver.findElement(By.name("s-ref-checkbox-1249137011"));
		
		boolean FSCheckboxIsDisplayed = FSCheckbox.isDisplayed();
		
		System.out.println("Free Shipping Checkbox is displayed :"+FSCheckboxIsDisplayed);
		
		FSCheckbox.click();

	}

}
