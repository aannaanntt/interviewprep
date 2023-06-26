package youtubeprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InfosysCommonEle {
	
	public static void main(String[] args) {
		int arr1[]= {80,10,15,2,35,60};
		int arr2[] = {35,80,60,20,75};
		commonElements(arr1,arr2);
	}

	private static void commonElements(int[] arr1, int[] arr2) {
		List<Integer> collect = Arrays.stream(arr1).distinct().filter(number-> Arrays.stream(arr2).anyMatch(x->x==number)).boxed().collect(Collectors.toList());
		System.out.println(collect);
	}

}
