package kevinNaughtonJr;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Stream;

class RemoveDuplicatesFromSortedList {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		System.out.println(list);

		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} 
		Set<Integer> set = new HashSet<>(list);
		System.out.println(set);
		
		set.forEach(i-> System.out.println(i));

		Stream<String> stream = Stream.of("Geeks", "For", 
				"Geeks", "A", 
				"Computer", 
				"Portal"); 

		// Print the stream 
		stream.forEach(s -> System.out.println(s)); 
	}
}
