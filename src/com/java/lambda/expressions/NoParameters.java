package com.java.lambda.expressions;
import java.util.function.BooleanSupplier;

//For a lambda expression with no 
//parameters, we still need the parentheses.
//
//() -> { System.out.println("hi"); }
//The following example shows 
//how to use BooleanSupplier.

public class NoParameters {

	 public static void main(String[] args) {
		    BooleanSupplier bs = () -> true;
		    System.out.println(bs.getAsBoolean());

		    int x = 0, y= 1;
		    bs = () -> x > y;
		    System.out.println(bs.getAsBoolean());
		  }
		}

