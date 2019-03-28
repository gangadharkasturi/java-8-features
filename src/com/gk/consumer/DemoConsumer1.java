package com.gk.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/**
 * 
 * @author Kasturi's
 * Consumer interface is introduced in JAVA8
 */
class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}

public class DemoConsumer1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4, 7, 8, 1, 4, 1);
		Consumer c = new ConsumerImpl();
		values.forEach(c);

	}

}
