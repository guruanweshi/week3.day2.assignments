package week3.day2.home.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Collections.addAll(numList,14,12,13,11,15,14,18,16,17,19,18,17,20);
		System.out.println(numList);
		for (int i=0;i<numList.size();i++) {
			for (int x=i+1;x<numList.size()-1;x++) {
				if (numList.get(i) == numList.get(x)) {
						System.out.println(numList.get(x));
				        numList.remove(x);
				}	
				
			}
				
		}
	}

}
