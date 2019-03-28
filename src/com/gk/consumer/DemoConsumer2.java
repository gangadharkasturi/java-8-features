package com.gk.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author Kasturi's Using inner class
 */
public class DemoConsumer2 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4, 7, 8, 1, 4, 1);
		Consumer<Integer> c = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		values.forEach(c);
	}
}
