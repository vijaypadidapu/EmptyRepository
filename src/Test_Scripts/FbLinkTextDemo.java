package Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLinkTextDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay Krishna\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		/*WebElement username = driver.findElement(By.id("email"));
		
		if(username.isDisplayed()==true) {
			
				username.sendKeys("myfbusername");
		}
		else {
			System.out.println("User name field deos not exist -- test failed");
		}
		WebElement pass = driver.findElement(By.id("pass"));
		
		if(pass.isDisplayed()==true) {
			
			pass.sendKeys(("1234"));
		}
		else {
			System.out.println("Password field doesnot exist --- test failed");
		}

		WebElement loginbtn = driver.findElement(By.id("loginbutton"));
		
		if(loginbtn.isDisplayed()==true) {
			
			loginbtn.click();
			//driver.close();
		}
		else {
			System.out.println("Log In button does not respond to the input --- test failed");
		}*/
      // driver.findElement(By.partialLinkText("For")).click();
       
       WebElement linktext =driver.findElement(By.partialLinkText("For"));
       
       String linktext1 = linktext.getText();
       
       System.out.println(linktext.getText());
       
       if(linktext1.equals("Forgot account?")) {
    	   
    	    linktext.click();
    	    
    	    WebElement htext = driver.findElement(By.className("uiHeaderTitle"));
    	    
    	    String htxt =htext.getText();
    	    
    	    System.out.println("header text is :  " +htxt);
    	    
    	    if(htxt.equals("Find Your Account")) {
    	    	System.out.println("Test case pass");
    	    }
    	    else {
    	    	System.out.println("Text case failed");
    	    }
       }
       else {
    	   System.out.println("Link Doesnot exist---test case failed");
       }
		
	}

}
