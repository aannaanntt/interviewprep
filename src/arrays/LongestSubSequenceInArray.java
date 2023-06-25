package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestSubSequenceInArray {

	public static void main(String[] args) {
		int arr[] = { 3, 9, 1, 10, 4, 5, 20, 2 };

		Set<Integer> intSet = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			intSet.add(arr[i]);

		}

		int long_length = 0;

		for (int i = 0; i < arr.length; i++) {
			if (!intSet.contains(arr[i] - 1)) {
				int no = arr[i];

				while (intSet.contains(no)) {
					no++;
				}
				
	
				if (long_length < no - arr[i]) {
					long_length = no - arr[i];
				}
			}

		}

		System.out.println(long_length);
	}

}
