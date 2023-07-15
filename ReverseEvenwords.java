package SetAssessment;

public class ReverseEvenwords {
	public static void main(String[] args) {
		
		String test = "Ia am as software tester";

		String split[] = test.split(" ");
		for (String Spl : split) {
			System.out.println(Spl);
		}

		for (int i = 0; i < split.length; i++) {

			if (i % 2 != 0) {
				char[] Str = split[i].toCharArray();

				// Print the even position words in reverse order
				for (int j = Str.length - 1; j >= 0; j--) {
					System.out.print(Str[j]);
				}
				System.out.print(" ");

			} else {
				// Print the word as it is (concatenate space at the end)
				System.out.print(split[i] + " ");
			}

		}

	}
}
