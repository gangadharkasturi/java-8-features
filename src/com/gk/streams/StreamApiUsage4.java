package com.gk.streams;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Kasturi's
 *
 */
public class StreamApiUsage4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("gangadhar", "mahesh", "kasturi", "java", "girish","java");
		/**
		 * Let's take another example. Using forEach method with combination of streams
		 */
		names.stream().forEach(a -> System.out.println(a));
		names.stream().map(x -> x+"_modified").forEach(a -> System.out.println(a));
		names.stream().distinct().map(x ->  x+"_modified").forEach(a -> System.out.println(a));
		names.stream().filter( x -> x.endsWith("h")).forEach(n -> System.out.println(n));
	}
}
