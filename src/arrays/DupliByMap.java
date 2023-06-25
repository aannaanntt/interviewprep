package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupliByMap {
	
	public static void main(String[] args) {
		int arr[]= {3,5,4,3,2,2,1,3,5,5};
		
		Map<Integer,Integer> intMap= new HashMap<>();
		
		for(int no : arr) {
			Integer count = intMap.get(no);
			
			if(count==null) {
				intMap.put(no, 1);
			}
			
			else {
				count=count+1;
				intMap.put(no, count);
			}
		}
		
		intMap.forEach((key,value)->{
		if(value>1) {
			System.out.println(key);
		}
		});
		
//		Set<Map.Entry<Integer, Integer>> es = intMap.entrySet();
//		
//		for(Map.Entry<Integer, Integer> ne :es) {
//			if(ne.getValue()>1) {
//				System.out.println(ne.getKey());
//			}
		}
	

}
