package Test_Scripts;


import reusableMethods.AllBrowserVersion;
import reusableMethods.FaceBookOnAllBrowsers;
import reusableMethods.LocatorfacebookLogin;
import reusableMethods.RealDemo;
import reusableMethods.VersionoOfBrowser;
import reusableMethods.reusableMethods;

public class FbLogin {

	public static void main(String[] args) {

		/*reusableMethods rm = new reusableMethods();

		rm.addTwoNumbers(20, 30);
		rm.substractTwoNumbers(50, 40);
		rm.EvenorOddNumber(89);*/
		
		
		/*RealDemo obj = new RealDemo();
		
		obj.InvokeBrowser("chromebrowser", "http://www.youtube.com");
		//obj.InvokeBrowser("Firefoxbrowser", "http://google.com");*/
		
		
        /* VersionoOfBrowser obj1 = new VersionoOfBrowser();
          
          obj1.browserversion("IEbrowser");*/
          
         /*FaceBookOnAllBrowsers obj2 = new FaceBookOnAllBrowsers();
          
         obj2.AllBrowser();*./
		
		/*AllBrowserVersion obj3 = new AllBrowserVersion();
		
		obj3.allBrowserVersion();*/
		
		LocatorfacebookLogin obj4 = new LocatorfacebookLogin();
		obj4.LocatorsFBLogin("vijaypadidapu@yahoo.com", "12345");
	}

}
