
public class ReverseofString {

	public static void main(String[] args) {
		
		
		String s1= "Facebook - Log In or sign Up";
	    //Program for only particular Text
		
		System.out.println(s1.substring(0, 8));
		
		//Program for Reverse of A String
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			System.out.print(s1.charAt(i));
		}
		
	

	}

}
