package week3.day2.home.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Collections.addAll(numList,3,2,11,4,6,7);
		List<Integer> numList1 = new ArrayList<>();
		Collections.addAll(numList1,1,2,8,4,9,7);
		
		for(int x=0;x<numList.size();x++){
			for(int y=0;y<numList1.size();y++) {
				if (numList.get(x) == numList1.get(y)) {
					System.out.println(numList.get(x));
		}

}
}
}
}