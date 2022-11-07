package Assignment4;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
	/* Write a program which will accept List of String and produce another List of string of which will have only values which starts with git
      Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
      Output- Git, Github, Gitlab, GitBash */
		
		
	ArrayList<String> list = new ArrayList<>();
	list.add("Git");
	list.add("Github");
	list.add("GitLab");
	list.add("GitBash");
	list.add("Selenium");
	list.add("Java");
	list.add("Maven");
	
	
	
	ArrayList<String> result = new ArrayList<>();
	
	for(String s: list)
	{
		if(s.startsWith("Git"))
		{
			result.add(s);
		}
	}
	System.out.println(result);
	

	 
	

	}

}
