package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("cherry");
		
		// For index
		
		
		for(int i=0; i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
		
		
		// for each
		System.out.println("************");
		 fruits.forEach(fruit -> System.out.println(fruit));
		
		 System.out.println("***********");
       //Iterator
		 Iterator<String> fruit = fruits.iterator();
		
		while (fruit.hasNext())
		{
			System.out.println(fruit.next());
		}

	}

}
