package com.ambda.predicate.example;
import java.util.function.Predicate;

//Predicate isEqual returns a predicate that tests if 
//two arguments are equal according to
//.equals(Object, Object).
//
//Syntax
//isEqual has the following syntax.
//
//static <T> Predicate<T> isEqual(Object targetRef)


public class IsEqualExample {
	  public static void main(String[] args) {
		    Predicate<String> i  = Predicate.isEqual("asdf");
		    
		    System.out.println(i.test("java2s.com "));
		    
		    System.out.println(i.test("asdf"));
		    
		    Predicate<Integer> itgr  = Predicate.isEqual(20);
		    
		    System.out.println(itgr.test(10));
		    System.out.println(itgr.test(20));
		    System.out.println(itgr.test(30));
		    
		    
		    
		    
		  }
		}
