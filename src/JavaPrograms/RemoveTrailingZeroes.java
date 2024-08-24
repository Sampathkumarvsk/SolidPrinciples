package JavaPrograms;

public class RemoveTrailingZeroes {

	public static void main(String[] args) {

		String trailingZeroes = "4010000000";

		for (int i = trailingZeroes.length() - 1; i > 0; i--) {
			if (trailingZeroes.charAt(i) != '0') {
				System.out.println(trailingZeroes.substring(0, i + 1));
				break;
			}
		}

	}

}
