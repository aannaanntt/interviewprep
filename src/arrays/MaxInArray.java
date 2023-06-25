package arrays;

public class MaxInArray {
	
	public static void main(String[] args) {
		
		int arr[] =  {4,3,5,2,6};
		int max=arr[0];
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("max is "+" "+max);
	}

}
