package com.java.lambda.expressions;

//You can use final modifier in the parameter declaration 
//for explicit lambda expressions.
//
//The following lambda expressions use final modifier.
//
//(final int x, final int y) -> { return x + y; }
//We can just use one modifier as follows.

//(int x, final int y) -> {return x + y;}

public class finalModifier {

	 public static void main(String[] argv) {
		 Processorfinal stringProcessor = (final String str) -> str.length();
		    String name = "JavaLambda";
		    int length = stringProcessor.getStringLength(name);
		    System.out.println(length);

		  }
		}

		@FunctionalInterface
		interface Processorfinal {
		  int getStringLength(String str);
		}
		
		
		
//		The lambda expression body can be a block statement or a single expression.
//
//		A block statement is enclosed in braces while a single expression 
//		can exist without braces.
//
//		In the block statement we can use return statement to return value.
//
//		The following lambda expression uses a block statement and use 
//		return statement to return the sum.
//
//		(int x, int y) -> { return x + y; }
//		While the following lambda uses an expression:
//
//		(int x, int y) -> x + y
//		The expression doesn't require the braces.
//
//		The lambda is not necessary to return a value. The following two 
//				lambda expressions just output the 
//				parameter to standard output 
//				and don't return anything.
				