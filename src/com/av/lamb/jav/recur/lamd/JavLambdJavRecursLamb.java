package com.av.lamb.jav.recur.lamd;


//We can use a method reference when creating a recursive lambda expressions.
//
//Example
//The following code creates a recursive function 
//in the normal way then use the recursive function 
//as the method reference to create a lambda expression. 
//The final lambda expression becomes recursive.
//

import java.util.function.IntFunction;

public class JavLambdJavRecursLamb {

	public static void main(String[] args) {
	    IntFunction<Long> factorialCalc = JavLambdJavRecursLamb::factorial;
	    System.out.println(factorialCalc.apply(10));
	  }
	  public static long factorial(int n) {
	    if (n == 0) {
	      return 1;
	    } else {
	      return n * factorial(n - 1);
	    }
	  }
	}

