package youtubeprograms;

public class StringRotation {
	
	public static void main(String[] args) {
	String result=isStringRotated("ABCD","CDAB") ? "Strings are rotated":"String are not rotated";
	System.out.println(result);
	}

	private static boolean isStringRotated(String str1, String str2) {
		
		return (str1.length()==str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	
		
	}

}
