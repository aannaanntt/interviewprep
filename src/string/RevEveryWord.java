package string;

public class RevEveryWord {
	
	public static void main(String[] args) {
		String str ="java code";
//		String replace = str.replace(" ", "");
//		String rev="";
//		String outpu="";
//		for(int i=replace.length()-1;i>=0;i--) {
//			rev+=replace.charAt(i);
//		}
//		outpu=outpu+rev+" ";
//		System.out.println(outpu+"->");
		
		String[] words = str.split(" ");
		String output="";
		for(String st:words) {
			String revWord="";
	
			for(int i= st.length()-1;i>=0;i--) {
				revWord+=st.charAt(i);
			}
			
			output=output+revWord+" ";
		}
		
		System.out.println(output);
	}
}
