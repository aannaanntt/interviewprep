package string;

public class StringSort {
	public static void main(String[] args) {

		String str="java";
		
		char[] cs = str.toCharArray();
		char temp;
		for(int i=0;i<cs.length;i++) {
			for(int j=i+1;j<cs.length;j++) {
				if(cs[i]>cs[j]) {
					temp=cs[i];
					cs[i]=cs[j];
					cs[j]=temp;
				}
			}
		}
		
		System.out.println(new String(cs));
		String str1="Anant";
		String st2=str1;
		
		st2="Mishra";
		System.out.println(st2);
		
	}

}
