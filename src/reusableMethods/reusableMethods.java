package reusableMethods;

public class reusableMethods {

	// Method to add two numbers
	public static void addTwoNumbers(int a, int b) {

		int c;// stores the value
		c = a + b;
		System.out.println("The addition of two numbers is: " + c);

	}

	// Method to Subtract two numbers
	public static void substractTwoNumbers(int a, int b) {

		int c;// stores the value
		c = a - b;
		System.out.println("The Subtsraction of two numbers is: " + c);

	}

	public static void EvenorOddNumber(int E) {

		int n = E / 2;
		if (n == 0) {
			System.out.println("N is a even number");
		} else {
			System.out.println("N is a odd number");
		}
	}

	// Program for Reverse of a String

	public void ReverseOfString(String s1) {

		for (int i = s1.length() - 1; i >= 0; i--) {
			System.out.println(s1.charAt(i));
		}
	}
	public void ParticularText(String s,int beginIndex,int endIndex) {
		
		System.out.println(s.substring(beginIndex, endIndex));
	}

}
