package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeated {
	public static void main(String[] args) {
		String str= "AABCDBE";

		for(int i=0;i<str.length();i++) {
			
			boolean unique=true;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					unique=false;
					break;
				}
			}
			
			if(unique) {
				//System.out.println(str.charAt(i));
				break;
			}
			
		}
		
		//using collections
		
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		int count=0;
		for(int i=0;i<str.length();i++) {
//			if(map.containsKey(str.charAt(i))) {
//				
//			}
			
			Integer intValue = map.get(str.charAt(i));
		
			if(intValue==null) {
				map.put(str.charAt(i), 1);
		}
			
		else {
				intValue=intValue+1;
				map.put(str.charAt(i), intValue);
			}
			
//			char at = str.charAt(i);
//			
//			if(map.containsKey(at)){
//				map.put(at, map.get(at)+1);
//			}else {
//				map.put(at, 1);
//			}
		}
		
	for(Map.Entry<Character,Integer> es:	map.entrySet()) {
		if(es.getValue()==1) {
			System.out.println(es.getKey());
			break;
		}
	}
	}

}
