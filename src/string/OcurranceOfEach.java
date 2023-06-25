package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OcurranceOfEach {
	public static void main(String[] args) {
		String str ="Anant";
		
		str=str.toLowerCase();		
		char[] ch = str.toCharArray();
		
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(Character c: ch) {
			Integer count = map.get(c);
			
			if(count==null) {
				map.put(c, 1);
			}else {
				
				map.put(c,count+1);
			}
		}
		
		System.out.println(map);
		
	}

}
