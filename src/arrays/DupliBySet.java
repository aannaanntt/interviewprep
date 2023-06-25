package arrays;

import java.util.HashSet;
import java.util.Set;

public class DupliBySet {
	
	public static void main(String[] args) {
		int arr[]= {3,5,4,3,2,2,2,1};
		Set<Integer> inSet= new HashSet<Integer>();
		
		for(Integer i : arr) {
			if(inSet.add(i)==false) {
				System.out.println(i);
			}
		}

	}

}
    