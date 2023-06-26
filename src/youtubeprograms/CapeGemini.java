package youtubeprograms;

public class CapeGemini {
	//use mathematical formula  n(n+1)/2 where n is the total elements
	public static void main(String[] args) {
		int arr [] = {1,2,3,5,6,7,8,9,10,11};
		
		int sum = (11 * 12) /2;
		
		int actualSum =0;
		
		for(int i =0 ;i <arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		
		System.out.println("Missing number is"+(sum-actualSum));
	}

}
