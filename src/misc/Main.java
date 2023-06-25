package misc;

import java.util.Map;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;

public class Main {
	public static void main(String args[]) {
//implementation of HashMap  
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//addding keys and values to HashMap  
		hm.put(23, "Yash");
		hm.put(17, "Arun");
		hm.put(15, "Swarit");
		hm.put(9, "Neelesh");
		Iterator<Integer> it = hm.keySet().iterator();
		System.out.println("Before Sorting");
		while (it.hasNext()) {
			int key = (int) it.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
		System.out.println("\n");

		System.out.println("After Sorting");
//using TreeMap constructor to sort the HashMap  
//		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new Comparator<Integer>() {
//			public int compare(Integer i1,Integer i2) {
//				return i2.compareTo(i1);
//				
//			}
//		});
		
		Comparator<Integer> cmp = (i1,i2)-> {
			return i2.compareTo(i1);
			
		};
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(cmp);
		tm.putAll(hm);
		Iterator itr = tm.keySet().iterator();
		while (itr.hasNext()) {
			int key = (int) itr.next();
			System.out.println("Roll no:  " + key + "     name:   " + hm.get(key));
		}
	}
}