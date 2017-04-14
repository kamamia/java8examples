package com.java.lambda.expression.context;

//
//We can use a lambda expression in a return statement, 
//and its target type is declared in the method return type.
//		
//		
		
public class ReturnContext {

	public static void main(String[] argv) {
	    System.out.println(create().calculate(2, 2));
	  }/*from  ww  w.  jav  a2 s.c  o  m*/
	  private static CalculatorRet create(){
	    return (x,y)-> x / y;
	  }  
	}

	@FunctionalInterface
	interface CalculatorRet{
	  long calculate(long x, long y);
	}