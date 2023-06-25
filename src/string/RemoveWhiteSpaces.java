package string;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		String str="j a va s ta r";
		
		String trim = str.trim();
		
		System.out.println(trim.replaceAll(" ", ""));
	}
}
