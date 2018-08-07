package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell Laptop");

		driver.findElement(By.className("nav-input")).click();

		WebElement Drop = driver.findElement(By.id("sort"));

		// use select class and pass the element

		Select Drop1 = new Select(Drop);

		// Drop1.selectByIndex(3);

		// Drop1.selectByValue("price-desc-rank");

		Drop1.selectByVisibleText("Featured");

	}

}
