package JavaPrograms;

public class ConditionalSum {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3,6,7,8,9,10 };
		int sum = 0;
		boolean skip = false;

		for (int num : arr) {
			if (num == 6) {
				skip = true;
			}

			if (!skip) {
				sum = sum + num;
			}

			if (num == 9) {
				skip = false;
			}

		}
		System.out.println(sum);
	}

}
