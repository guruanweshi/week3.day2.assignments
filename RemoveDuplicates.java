package week3.day2.home.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("Original String: ");
		System.out.println(text);
		System.out.println("===========================================");
		
		List<String> strlist = new ArrayList<>(Arrays.asList(text.split(" ")));
		
        Set<String> noduplicate = new LinkedHashSet<>(strlist);
      
        System.out.println("modified string: ");
      
        for(String value:noduplicate)
			System.out.print(value+" ");

	}

}
