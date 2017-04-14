package com.ambda.predicate.example;

import
java.util.function.Predicate;
//edicate or returns a composed predicate that 
//represents a short-circuiting logical OR 
//of this predicate and another.
//
//Syntax
//or has the following syntax.

//default Predicate<T> or(Predicate<? super T> other)


public class OrExample {

	 public static void main(String[] args) {
		    Predicate<String> i  = (s)-> s.length() > 5;
		    Predicate<String> j  = (s)-> s.length() < 3;
		    
		    System.out.println(i.or(j).test("java2s.com "));
		    System.out.println(i.or(j).test("java"));
		    System.out.println(i.or(j).test("ja"));
		  }
		}
