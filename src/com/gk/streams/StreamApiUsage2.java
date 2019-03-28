package com.gk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Kasturi's
 *
 */
public class StreamApiUsage2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("gangadhar", "mahesh", "kasturi", "java", "girish");
		/**
		 * Let's take another example. If you want to take out a name which
		 * starts with 'g'. If you take traditional approach , you need to write
		 * boiler plate code. By using Java8, you can write as:
		 */

		List<String> namesStartWith_g = names.stream().filter(myName -> myName.startsWith("g"))
				.collect(Collectors.toList());
		namesStartWith_g.forEach( a -> System.out.println(a));
	}
}
