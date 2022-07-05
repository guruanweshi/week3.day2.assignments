package week3.day2.home.assignments;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;


public class FindMostDuplicate {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String input = "abbaba";
		char[] arr = input.toCharArray();
		
		int max=0;
		for (int i=0;i<arr.length;i++) {
			
					    
			if (map.containsKey(arr[i])){
            	map.put(arr[i], map.get(arr[i]) + 1);
            } 
            
			else
            
			{
            	map.put(arr[i], 1);
          
           }
		
				
			for (Map.Entry<Character,Integer> entry: map.entrySet()) {
				if( entry.getValue() > max){
					max= entry.getValue();
				if (max ==2) {
					System .out.println("first most duplicate is " + entry.getKey());
					break; 
				}
				}	
		
			}			
			
        }
	

}
}
