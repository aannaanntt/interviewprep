package youtubeprograms;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8ArrayPrograms {
	
	
	public static void main(String[] args) {
//		int [] numbers = {5,2,8,3,1,1};
//		
//		findSecondSmallest(numbers);
//		
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {4,5,6,7,8};
		//commonInTwoArrays(arr1,arr2);
		
		String strs[] = {"Apple","Banana","Avacado","Appricot","Grapes"};
		
		findLengthOfLongestString(strs);
	
	}
	


	private static void findLengthOfLongestString(String[] strs) {

		int else1 = Arrays.stream(strs).mapToInt(str->str.length()).max().orElse(0);
		System.out.println(else1);
	}



	private static void commonInTwoArrays(int[] arr1, int[] arr2) {
		 List<Integer> common = Arrays.stream(arr1).
		 filter(number->Arrays.stream(arr2).
				 anyMatch(ar->ar==number)).boxed().collect(Collectors.toList());
		 
		 common.forEach(System.out::println);
		
	}

	public static void findSecondSmallest(int []num) {
		int secondSmallest=Arrays.stream(num).distinct().sorted().skip(1)
				.findFirst().orElseThrow(()-> new IllegalArgumentException("no element is present"));
		
		
		System.out.println(secondSmallest);
	}

}
