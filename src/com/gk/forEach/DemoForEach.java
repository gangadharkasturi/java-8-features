package com.gk.forEach;

import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author Kasturi's
 *
 */
public class DemoForEach {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("gk", "nani", "mahesh");
		/**
		 * External for loop(enhanced)
		 */
		for (String s : names) {
			System.out.println(s);
		}
		/**
		 * External for loop(Normal)
		 */
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));

		}
		
		/**
		 * Java8 Feature - forEach (it internally has a loop
		 * So no need to write iterating operation.
		 * forEach loop is faster as it has internal iteration
		 * )
		 */
		names.forEach(name -> System.out.println(name)); //lambda
		
		/**
		 * One more usage
		 */
		names.forEach(System.out::println);
	}

}
