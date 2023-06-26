package youtubeprograms;

public class Capegemini2 {
	
	public static void main(String[] args) {
		String str = "This is Java This is Java";
		
		int mid = str.length()/2;
		String lowerCaseString="";
		String upperString="";
		
		for(int i=0;i<str.length();i++) {
			if(i<mid) {
				lowerCaseString=lowerCaseString+Character.toLowerCase(str.charAt(i));
			}else {
				upperString=upperString+Character.toUpperCase(str.charAt(i));
			}
		}
		
		
		System.out.println(lowerCaseString + upperString);
		
	}

}
