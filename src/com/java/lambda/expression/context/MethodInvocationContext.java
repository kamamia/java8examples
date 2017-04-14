package com.java.lambda.expression.context;


//Method Invocation Context
//We can use a lambda expression as an argument 
//for a method or constructor.
//

public class MethodInvocationContext {

	public static void main(String[] argv) {
	    engine((x,y)-> x / y);//
	  }
	  private static void engine(CalculatorInv calculator){
	    long x = 2, y = 4;
	    long result = calculator.calculate(x,y);
	    System.out.println(result);
	  }  
	}

	@FunctionalInterface
	interface CalculatorInv{
	  long calculate(long x, long y);
	}
	
