package Assignment4;

import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		/*Write a program that will remove duplicate values from List
		Input – Java, TestNG, Maven, Java, 
		Output – Java, TestNG, Maven*/
		ArrayList<String> lst = new ArrayList<>();
		lst.add("Java");
		lst.add("TestNG");
		lst.add("Maven");
		lst.add("Java");
		
		System.out.println(removeDuplicate(lst));
		


	}
	
	
	public static List<String> removeDuplicate(ArrayList<String> list)
	{
		
		
		ArrayList<String> lst = new ArrayList<>();
		for(int i=0 ; i<list.size(); i++)
		{
			if(lst.contains(list.get(i)))
			{
				continue;
				
			}
			lst.add(list.get(i));
		}
				
	    return lst;
		
		
	}

}
