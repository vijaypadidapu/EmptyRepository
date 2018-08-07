package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeFBLogo {

	public void FBAttribute(String s1, String Email, String Password){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys(Email);
		
		driver.findElement(By.id("pass")).sendKeys(Password);
		
		driver.findElement(By.id("loginbutton")).click();
		
		WebElement s11 = driver.findElement(By.xpath("//*[@id=\'blueBarDOMInspector\']/div/div[1]/div/div/h1/a/i"));
		
		  System.out.println("Name of the Logo is:-" + s11.getAttribute("name"));
		
		
		

		
	}
}
