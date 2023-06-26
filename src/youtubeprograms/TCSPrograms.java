package youtubeprograms;

public class TCSPrograms {
	
	public static void main(String[] args) {
		String str= "Anant#@!$";
		int count=0;
		String removedCharacter="";
		for(int i =0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && 
					!Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
				count++;
				
			
			}else {
				removedCharacter+=str.charAt(i);
			}
		}
		
		if(count ==0) {
			System.out.println("No special characters");
		}else {
			System.out.println("count is "+" "+count);
		}
		
		System.out.println("After removing special"+" "+removedCharacter);
	}

}
