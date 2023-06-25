package string;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String str ="programming";
		
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		
		//Approach 2 
		StringBuilder sb2= new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			int idxV = str.indexOf(c,i+1);
			if(idxV==-1) {
				sb2.append(c);
			}
		}
		
		System.out.println(sb2);
		
		
		char[] chA = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for(int i=0;i<chA.length;i++) {
			boolean repeated=false;
			for(int j=i+1;j<chA.length;j++) {
				if(chA[i]==chA[j]) {
					repeated=true;
					break;
				}
			}
			
			if(!repeated) {
				sb3.append(chA[i]);
			}
		}
		
		//just aqdd in set and create a stringbuilder and print
		
		
	}
}
