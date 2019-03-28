package com.gk.consumer;

import java.util.Arrays;
import java.util.List;

public class DemoConsumer3 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4, 7, 8, 1, 4, 1);
		/**
		 * forEach accepts 'accept' method.
		 * which has the below signature:
		 * void accept(T t);
		 * Hence avoiding return type and considering arguments as it is in the below code
		 */
		values.forEach( i -> {
			System.out.println(i);
		});
	}
}
