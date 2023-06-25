package string;

public class StringRev {
public static void main(String[] args) {
	String word="hello";
//	
//	char[] charArray=word.toCharArray();
//	for(int i=charArray.length-1;i>=0;i--) {
//		System.out.print(charArray[i]);
//	}
	
//	for(int i=word.length()-1;i>=0;i--) {
//		System.out.print(word.charAt(i));
//	}
	
//	StringBuffer sb = new StringBuffer(word).reverse();
//	System.out.println(sb);
	
	
	StringBuilder sb1 = new StringBuilder(word).reverse();
	System.out.println(sb1);
}

}
