package com.jav.lamb.var.capt.fin;

import java.util.function.Function;

//A lambda expression can access final local variables 
//or local-non-final-initialized-only-once variables.

public class LambVarCaptur {

	 public static void main(String[] argv) {
		 // works 
		   // final String x = "Hello"; 
		    // or 
		     String x = "Hello"; 
		//    Function<String,String> func1 = y -> {return y + " "+ x ;};
		     Function<String,String> func1 =
		    y -> {/*x="a"  this  is not accepted by java*/;return y + " "+ x ;};
		    System.out.println(func1.apply("java2s.com"));

		  }
		}
