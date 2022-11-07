package Assignment4;

import java.util.*;


public class Question1 {

	public static void main(String[] args) {
		/*Create a list of String and print the values in reverse order
		    Input – Java, Selenium, TestNG, Git, Github
			Output- Github, Git, TestNG, Selenium, Java*/
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
		list.add("Git");
		list.add("Githun");
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		


	}

}
