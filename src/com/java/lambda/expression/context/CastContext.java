package com.java.lambda.expression.context;

//We can use a lambda expression preceded by a cast. 
//The type specified in the cast is its target type.


public class CastContext {

	 public static void main(String[] argv) {
		    engine((IntCalculatorCast) ((x,y)-> x + y));
		  }
	 
		  private static void engine(IntCalculatorCast calculator){
		    int x = 2, y = 4;
		    int result = calculator.calculate(x,y);
		    System.out.println(result);
		  }
		  
		  private static void engine(LongCalculatorCast calculator){
		    long x = 2, y = 4;
		    long result = calculator.calculate(x,y);
		    System.out.println(result);
		  }  
		  
		}

		@FunctionalInterface
		interface IntCalculatorCast{
		  int calculate(int x, int y);
		}

		@FunctionalInterface
		interface LongCalculatorCast{
		  long calculate(long x, long y);
		}