package Test_Scripts;

import reusableMethods.AmazonProductSearch;
import reusableMethods.LocatorfacebookLogin;
import reusableMethods.MultiBrowserFbLogin;
import reusableMethods.RealDemo;
import reusableMethods.VerifyingFbLabels;

public class FBLoginTwoParam {

	public static void main(String[] args) {
		
		// Facebook by using method and 2 parameters
		
		//RealDemo obj = new RealDemo();
		
		//obj.InvokeBrowser("Chromebrowser","http://www.facebook.com");
		
		//LocatorfacebookLogin obj1 = new LocatorfacebookLogin();
		
		//obj1.LocatorsFBLogin("vijaypadidapu@yahoo.com", "123456");
		
		//  Facebook on All Browsers
		
		//MultiBrowserFbLogin obj3 = new MultiBrowserFbLogin();
		
		//obj3.FbMultiBrowserLogin("vijaypadidapu@yahoo.com", "123456");
		
		
		// Amazon Product Search
		//AmazonProductSearch obj4 = new AmazonProductSearch();
		
		//obj4.ProductAmazonSearch("Iphone 8 plus case");
		
		//Verifying the facebook labels
		
		VerifyingFbLabels obj5 = new VerifyingFbLabels();
		
		obj5.fbLabels("Email or Phone","Password","Log into Facebook","vijaypadidapu@yahoo.com","123456");
		
	}

}
