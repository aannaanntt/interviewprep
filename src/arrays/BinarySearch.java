package arrays;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		List<Integer> list = (List<Integer>) ListProducer.getListObject().get();
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(12);
		list.add(14);

		int a[] = { 2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28 };

		int search = 28;

		int li = 0;

		int hi = a.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (a[mi] == search) {
				System.out.println("Element is at" + " " + mi + " index position ");
				break;
			}

			else if (a[mi] < search) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}

			mi = (li + hi) / 2;

		}
		if(li>hi) {
			System.out.println("Element not found");
		}

//		Integer toSearch = 2;
//
//		int li = 0;
//
//		Integer lastPointer = list.size() - 1;
//
//		Integer middle = (li + lastPointer) / 2;
//
//		while (li <= lastPointer) {
//			if (list.get(middle) == toSearch) {
//				System.out.println("Element is at position" + middle + " " + "index position");
//				break;
//			} else if (list.get(middle) < toSearch) {
//				li = middle + 1;
//
//			}
//
//			else {
//				lastPointer = middle - 1;
//			}
//			
//			middle=(li+lastPointer)/2;
//			
//			if(li>lastPointer) {
//				System.out.println("invalid position");
//			}
//		}
	}
}
