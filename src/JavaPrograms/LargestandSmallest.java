package JavaPrograms;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {
		int numbers[]= {-10,24,50,88,-88,9889};
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
			System.out.println("\n given num is:"+Arrays.toString(numbers
					));
			System.out.println("Largest num is:"+largest);
				System.out.println("Smallest num is:"+smallest);
		
		
		
		}

}
}
