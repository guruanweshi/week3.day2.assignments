package week3.day2.home.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
;

public class FindSecondLargest {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Collections.addAll(numList,3,2,11,4,6,7);
		Collections.sort(numList);
		int num = numList.size()-2;
		System.out.println(num);
		System.out.println("Second Largest Number is: "+ numList.get(num));
	}

}
