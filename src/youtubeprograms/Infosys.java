package youtubeprograms;

public class Infosys {
	
	public static void main(String[] args) {
		int i = 1245;
//		String str = Integer.toString(i);
//		
//		System.out.println(str.length());
		int count=0;
		while(i !=0) {
			count ++;
			
			i=i/10;
		}
		
		System.out.println(count);
	}

}
