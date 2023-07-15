package SetAssessment;

public class ChangeOddIndexToUppercase {
	public static void main(String[] args) {

		String test = "changeme";

		// Convert the String to character array
		char[] Arr = test.toCharArray();

		// Traverse through each character (using loop

		for (int i = 0; i < Arr.length; i++) {
			if (i % 2 != 0) {
				// within the loop, change the character to uppercase, if the index is odd else
				System.out.println(Character.toUpperCase(Arr[i]));
			} else {

			}
		}

	}
}
