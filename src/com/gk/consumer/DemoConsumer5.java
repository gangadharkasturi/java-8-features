package com.gk.consumer;

import java.util.Arrays;
import java.util.List;

public class DemoConsumer5{
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4, 7, 8, 1, 4, 1);
		/**
		 * forEach accepts 'accept' method.
		 * which has the below signature:
		 * void accept(T t);
		 * Hence avoiding return type and avoiding type of argument as there is only one argument.
		 * Optimizing the code
		 */
		values.forEach(i-> System.out.println(i)); 
	}
}
