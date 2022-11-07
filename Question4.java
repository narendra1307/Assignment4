package Assignment4;

import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		/*Create a list of values and print the second element, second last element.
		Input – 10,45, 90,45, 23, 90, 44
		Output – 45,90 */
		
		List<Integer> list = Arrays.asList(10,45, 90,45, 23, 90, 44);
		
		int secondElement = list.get(1);
		int secondLast = list.get(list.size()-2);
		
		System.out.println(+secondElement +" "+secondLast);
		
		


	}

}
