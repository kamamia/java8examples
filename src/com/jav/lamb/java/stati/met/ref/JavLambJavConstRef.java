package com.jav.lamb.java.stati.met.ref;

import java.util.function.Function;
import java.util.function.Supplier;

//We can use constructor to create a lambda expression.
//
//The syntax to use a constructor reference is
//
//ClassName::new
//The keyword new refers to the constructor of the class. 
//The compiler chooses a constructor based on the context.

public class JavLambJavConstRef {

	 public static void main(String[] argv){
		    Supplier<String> func1  = () ->  new String();
		    System.out.println("Empty String:"+func1.get());
		    
		    Function<String,String> func2  = str ->  new String(str);
		    
		    System.out.println(func2.apply("java2s.com"));

		    Supplier<String> func3  = String::new;
		    System.out.println("Empty String:"+func3.get());
		    
		    Function<String,String> func4  = String::new;
		    System.out.println(func4.apply("java2s.com"));
		  }
		}

