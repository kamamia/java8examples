package com.ambda.predicate.example;

import java.util.function.Predicate;

public class NegateExample {
	 public static void main(String[] args) {
		    Predicate<String> i  = (s)-> s.length() > 5;
		    
		    System.out.println(i.negate().test("java2s.com "));
		    
		    
		    System.out.println(i.negate().test("ja"));
		    
		    
		    Predicate<Integer> intg  = (in)-> in.intValue() > 20;

		    System.out.println(intg.negate().test(10));
		    
		    System.out.println(intg.negate().test(30));
		    
		    
		    
		  }
		}
