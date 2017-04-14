package com.jav.lamb.java.stati.met.ref;
import java.util.function.BiFunction;
import java.util.function.Function;

//A lambda expression represents an anonymous 
//function defined in a functional interface.
//
//A method reference creates a lambda expression using an existing method.
//
//The general syntax for a method reference is
//
//Qualifier::MethodName
//Two consecutive colons act as a separator.
//
//The MethodName is the name of the method.
//
//Qualifier tells where to find the method reference

public class StatMethodRef {

//	
//	We can use overloaded static method in static method reference.
//
//	When the overloaded method we have to pay more attention 
	//to the method signature and corresponding functional interface.
//
//	In the following list we have three versions of the valueOf() 
	//from the Integer class.
//
//	static Integer valueOf(int i)
//	static Integer  valueOf(String s)
//	static Integer  valueOf(String s, int radix)
//	The following code shows how 
//	different target functional interfaces can be used with the 
//	overloaded the Integer.valueOf() static methods.
//	
	
	public static void main(String[] argv){
	    // Uses  Integer.valueOf(int)
	    Function<Integer, Integer> func1  = Integer::valueOf;

	    // Uses  Integer.valueOf(String)
	    Function<String, Integer> func2  = Integer::valueOf;

	    // Uses  Integer.valueOf(String, int)
	    BiFunction<String, Integer,  Integer> func3  = Integer::valueOf;

	    System.out.println(func1.apply(7)); 
	    System.out.println(func2.apply("7")); 
	    System.out.println(func3.apply("101010101010", 2));
	    System.out.println(func3.apply("001", 2));
	    System.out.println(func3.apply("010", 2));
	    System.out.println(func3.apply("011", 2));
	    System.out.println(func3.apply("111", 2));
	    System.out.println(func3.apply("11", 8));
	    System.out.println("--"+func3.apply("7", 8));
	    System.out.println(func3.apply("10", 8));
	  }
	}


