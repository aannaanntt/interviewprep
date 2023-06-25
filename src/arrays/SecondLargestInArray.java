package arrays;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int arr[] =  {1,3,5,2,6};
//		
//		int temp=0;
//		
//		for(int i =0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//				if(i==1) {
//					break;
//				}
//			}
//		}
//		
//		System.out.println("Second largest number is "+arr[1]);
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest=arr[i];
			}
		}
		
		if(secondLargest==Integer.MIN_VALUE) {
			System.out.println("There is no second largest");
		}
		else {
			System.out.println("second largest number is"+secondLargest);
		}
	
		
	
	}

}
