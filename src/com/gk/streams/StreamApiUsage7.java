package com.gk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author Kasturi's
 *
 */
public class StreamApiUsage7 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 7, 4, 7, 4, 85, 1, 5, 1);
		//List<Integer> numbers = Stream.of(7,8,1,4,5,8).collect(Collectors.toList());
		/**
		 * multiplying each number with 2 and adding them all.
		 */
		System.out.println(numbers.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		/**
		 * Alternate code for above simple statement is given below.
		 */

		Stream<Integer> s = numbers.stream();
		Stream<Integer> s2 = s.map(t -> t*2); // Now every number has been multiplied by 2.
		Integer result = (Integer) s2.reduce(0, (a,b) -> a+b ); // here 0 is starting position.
		System.out.println(result);
		
		/**
		 * Finally, we can write as
		 */

		System.out.println(numbers.stream().map(x -> x*2).reduce(0,(a,b) -> a+b));
		
		/**
		 * Even we can use predefined methods to do sum at "reduce"
		 */
		
		System.out.println(numbers.stream().map(x -> x*2).reduce(0,(a,b) -> Integer.sum(a, b)));
		
		/**
		 * Simplify the above method as :
		 */
		System.out.println(numbers.stream().map(x -> x*2).reduce(0,Integer::sum));
	}
}
