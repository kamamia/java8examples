package com.ambda.predicate.example;

import java.util.function.Predicate;

//
//and has the following syntax.
//
//default Predicate<T> and(Predicate<? super T> other)
//Predicate and returns a composed predicate that represents a 
//short-circuiting logical AND of this predicate and another.


public class AndExample {
	  public static void main(String[] args) {
		    Predicate<String> i  = (s)-> s.length() > 5;
		    Predicate<String> j  = (s)-> s.length() < 3;
		    
		    System.out.println(i.and(j).test("java2s.com "));
		    
		    Predicate<Integer> intg1  = (in)-> in.intValue() > 20;
		    Predicate<Integer> intg2  = (in)-> in.intValue() < 30;

		    System.out.println(intg1.and(intg2).test(25)   );
		    
		    
		  }
	  
	  
		}
