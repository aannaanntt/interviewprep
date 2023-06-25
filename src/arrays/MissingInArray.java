package arrays;

public class MissingInArray {

	public static void main(String[] args) {
		//using XOR
		int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
		 
		int xor1=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			xor1=xor1^arr[i];
		}
		
		int xor2=1;
		for(int i=2;i<=6;i++) {
			xor2=xor2^arr[i];
			
		}
		
		System.out.println("missing number is "+(xor1^xor2));
		
		
		
		
		
		
		
//		int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
//
//		int expected_elements = arr.length + 1;
//		System.out.println(expected_elements);
//		int total_sum = expected_elements * (expected_elements + 1) / 2;
//
//		System.out.println(total_sum);
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//
//		System.out.println("Missing number is" + (total_sum - sum));
	}

}
