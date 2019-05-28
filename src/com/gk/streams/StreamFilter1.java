package com.gk.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter1 {
	public static void main(String[] args) {
		List<Integer> numbers = Stream.of(1, 5, 7, 2, 43, 10).collect(Collectors.toList());

		Predicate<Integer> p = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {

				return t > 5; // returns values only greater than 1
			}
		};

		Stream<Integer> s = numbers.stream().filter(p);
		Integer result = s.reduce(0, Integer::sum);
		System.out.println(result);

		/**
		 * Simplification of above code
		 */

		System.out.println(numbers.stream().filter(i -> i > 5).reduce(0, Integer::sum));

		/**
		 * Filtering values greater than 7,then multiply each value by 2, then
		 * sum up all values.
		 */

		System.out.println(numbers.stream().filter(i -> i > 7).map(i -> i * 2).reduce(0, Integer::sum));
	}
}
