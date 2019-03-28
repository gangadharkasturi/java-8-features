package com.gk.streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/**
 * 
 * @author Kasturi's
 *
 */
public class StreamApiPrerequisite {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("gangadhar", "mahesh", "kasturi", "java");
		/**
		 * If you want to append some text to every member of the names
		 * ArrayList. Traditional approach is:
		 */

		CopyOnWriteArrayList<String> nameZ = new CopyOnWriteArrayList<String>();// using
																				// CopyOnWriteArrayList
																				// to
																				// avoid
																				// ConcurrentModificationException
		nameZ.addAll(names);
		Iterator<String> iterator = nameZ.iterator();
		while (iterator.hasNext()) {
			String data = iterator.next();
			nameZ.remove(data);
			nameZ.add(data + "_appendingSomething");
		}
		/**
		 * using another iterator as the above iterator points to last result
		 * when it reaches to end of the while loop.
		 */
		Iterator<String> demoIterator = nameZ.iterator();
		while (demoIterator.hasNext()) {
			System.out.println(demoIterator.next());
		}
		/**
		 * or you can use for loop or enhanced for loop or JAVA8's forEach method to print the data
		 * (retrieving the data)
		 *  **TODO**
		 */
		

	}

}
