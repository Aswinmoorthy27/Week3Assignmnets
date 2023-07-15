package String.Week3;

public class RevereString {

	public static void main(String[] args) {
		String input = "TeastLeaf";

		char[] ch = input.toCharArray();
		
		int revlen=ch.length;

		// Use for loop to iterate through each character (from end to go to the first)

		for (int i = revlen - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
