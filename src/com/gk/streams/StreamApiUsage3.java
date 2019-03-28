package com.gk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Kasturi's
 *
 */
public class StreamApiUsage3 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("gangadhar", "mahesh", "kasturi", "java", "girish");
		/**
		 * Let's take another example. If you want to do a sort.
		 */

		List<String> namesOfAfterSorting = names.stream().sorted().collect(Collectors.toList());
		namesOfAfterSorting.forEach(a -> System.out.println(a));
	}
}
