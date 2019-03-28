package com.gk.lamda;

/**
 * 
 * @author Kasturi's
 *
 */
@FunctionalInterface
interface AB {
	void show();
}
/**
 * 
 * Using anonymous  inner class
 *
 */
public class DemoLambdaPrerequiste2 {
	public static void main(String[] args) {
		AB ab = new AB() {
			public void show() {
				System.out.println("hello");
			}
		};
		ab.show();
	}
}
