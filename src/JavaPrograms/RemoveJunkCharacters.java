package JavaPrograms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {

		// Remove Junk Characters

		String str = "22442!@##^&*****(*abcdeff";
		String alphaNum = "[^a-z A-Z 0-9]";

		String removedJunkCharacters = str.replaceAll(alphaNum, "");
		System.out.println(removedJunkCharacters);

	}

}
