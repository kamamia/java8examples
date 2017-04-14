package com.java.lambda.expressions;

//We can choose to omit parameter types in lambda expressions.
//
//In lambda expression (int x, int y) -> { return x + y; } 
//the types of parameters are declared.
//
//We can safely rewrite the lambda expression by 
//omitting the types of parameters as
//
//(x, y) -> { return x + y; }
//If we choose to omit the types of parameters, 
//we have to omit types for all parameters.

public class OmittingParameterTypes {

	  public static void main(String[] argv) {
//		    Processor stringProcessor = (str) -> str.length();
		    Processor stringProcessor = str -> str.length();
		    String name = "Java Lambda";
		    int length = stringProcessor.getStringLength(name);
		    System.out.println(length);

		  }
		}

		@FunctionalInterface
		interface Processor {
		  int getStringLength(String str);
		}
		