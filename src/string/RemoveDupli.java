package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDupli {

	public static void main(String[] args) {
		String str = "programming";

		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			int indexOf = str.indexOf(c, i + 1);

			if (indexOf == -1) {
				sb1.append(c);
			}
		}
		System.out.println(sb1);
		
		StringBuilder sb2= new StringBuilder();
		Set<Character> s= new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			s.add(str.charAt(i));
		}
		
		for(Character c: s) {
			sb2.append(c);
		}
		
		System.out.println(sb2);
	}

}
