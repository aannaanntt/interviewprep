package string;

import java.util.Arrays;

public class ReplaceWithOccurance {
	public static void main(String[] args) {
		String str = "opentext";
		char charToReplace = 't';

		int indexOf = str.indexOf(charToReplace);

		if (indexOf == -1) {
			System.out.println("Given character is not available in String");
			System.exit(0);
		}

		// logic to replace char occurance

		int cnt = 1;
		for (int i = 0; i < str.length(); i++) {
			char at = str.charAt(i);
			if (at == charToReplace) {
				str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));

				cnt++;
			}

		}
		System.out.println(str);

//	char[] array = str.toCharArray();
//	int cnt=1;
//	
//	for(int i=0;i<array.length;i++) {
//		if(array[i]==charToReplace) {
//			array[i]=String.valueOf(cnt).charAt(0);
//			cnt++;
//		}
//	}
//	System.out.println(Arrays.toString(array));
//	
	}
}
