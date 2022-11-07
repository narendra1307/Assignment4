package Assignment4;

import java.util.*;

public class Question5 {

	public static void main(String[] args) {
	/*	Create a list which can accept another list as an element.
        List 1- 11,22,33
	    List 2-  9,19,29	
	    List 3-  7,17,27
	Hint - ArrayList<ArrayList<Integer>> l1=new ArrayList<>(); 		*/
		
		ArrayList<ArrayList<Integer>> alist = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		alist.add(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(9);
		list2.add(19);
		list2.add(29);
		alist.add(list2);
		
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(7);
		list3.add(17);
		list3.add(27);
		alist.add(list3);
		
		System.out.println(alist);



	}

}
