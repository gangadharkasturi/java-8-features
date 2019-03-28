package com.gk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author Kasturi's
 *
 */
public class StreamApiUsage1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("gangadhar", "mahesh", "kasturi", "java");
		
		List<String> modifiedNames = names.stream().map(myName -> myName + "_usingJava8").collect(Collectors.toList());
		
		modifiedNames.forEach(s -> System.out.println(s));
		
		System.out.println("Hashcode of names list:" + names.hashCode());
		
		System.out.println("Hashcode of modifiedNames list:" + modifiedNames.hashCode());
	}
}
