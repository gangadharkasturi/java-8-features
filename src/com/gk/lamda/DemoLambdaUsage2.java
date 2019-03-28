package com.gk.lamda;

/**
 * 
 * @author Kasturi's
 */
interface GK {
	void show(int age);
}

public class DemoLambdaUsage2 {
	public static void main(String[] args) {

		/**
		 * Old way of providing impl to interface AC , method show()
		 */
		GK gk = new GK() {
			public void show(int age) {
				System.out.println("Hello:" + age);
			}
		};
		gk.show(25);

		/**
		 * Using JAVA 8 Lambda Feature
		 */

		GK lambdaOne = (age) -> {
			System.out.println("Hello" + age);
		};
		lambdaOne.show(50);

		/**
		 * Another way of using lambda
		 */
		GK lmbdaTwo = (age) -> System.out.println("hello" + age);
		lmbdaTwo.show(80);
		
		/**
		 * Another way of using lambda
		 */
		GK lmbdaThree = (int age) -> System.out.println("hello" + age);
		lmbdaThree.show(800);
	}
}
