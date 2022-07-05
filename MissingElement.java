package week3.day2.home.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Collections.addAll(numList,1,2,3,4,7,6,8);
		System.out.println("Original List: ");
		System.out.println(numList);
		Collections.sort(numList);
		System.out.println("sorted List: ");
		System.out.println(numList);
		for (int i=0;i<=numList.size()-1;i++) {
			if ((i+1) != numList.get(i)) {
				System.out.println("missing Number is: "+ (i+1));
				break;
			}
			
		}
		
	
	}

}
