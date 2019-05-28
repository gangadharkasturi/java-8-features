package com.gk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 
 * @author Kasturi's
 *
 */
public class StreamApiUsage6 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 7, 4, 7, 4, 85, 1, 5, 1);
		/**
		 * multiplying each number with 2 and adding them all.
		 */
		System.out.println(numbers.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		/**
		 * Alternate code for above simple statement is given below.
		 */

		Stream s = numbers.stream();
		Stream s2 = s.map(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {

				return t * 2;
			}
		}); // Now every number has been multiplied by 2.
		Integer result = (Integer) s2.reduce(0, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {

				return t + u;
			}
		}); // here 0 is starting position.
		System.out.println(result);

	}
}
