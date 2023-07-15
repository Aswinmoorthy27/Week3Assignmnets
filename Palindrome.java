package SetAssessment;

public class Palindrome {

	public static void main(String[] args) {

		String A = "madam";

		String rev = "";

		for (int i = A.length() - 1; i >= 0; i--) {
			rev = rev + A.charAt(i);
		}

		if (rev.equalsIgnoreCase(A)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}
