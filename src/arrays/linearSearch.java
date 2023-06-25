package arrays;

import java.util.ArrayList;
import java.util.List;

public class linearSearch {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		list.add(4);
		list.add(2);
		Integer elementToSearch = 13;
//		
//		boolean anyMatch = list.stream().anyMatch(x-> x == elementToSearch);
//		
//		list.stream().
		int temp = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == elementToSearch) {
				System.out.println("element is present at this location in list" + " "+list.indexOf(elementToSearch));
				temp++;
			}
		}

		if (temp == 0) {
			System.out.println("No element is matched");
		}
	}

}
