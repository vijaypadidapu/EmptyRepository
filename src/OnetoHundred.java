import reusableMethods.reusableMethods;

public class OnetoHundred {

	// One to Hundred number program
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.print("\n" + i);
		}

		// Program for multiples of 2

		int k = 0;
		for (int i = 1; i <= 100 & k < 100; i++) {

			k = i * 2;

			System.out.println("The multiples of 2 are:");
			System.out.println(k);

		}

		// Program for Prime numbers

		int i = 0;
		int num = 0;
		// Empty String
		String primeNumbers = "";

		for (i = 1; i <= 100; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);

		// Program for Reverse of a String

		reusableMethods obj = new reusableMethods();
		obj.ReverseOfString("My name is Facebook");
		
		//Program for Particular Text
		
		obj.ParticularText("Login page of FaceBook", 13, 22);
	}

}
