package com.java.lambda.behaviour;


//It is not always possible for the compiler 
//to infer the type of a lambda expression.
//
//One such situation is passing lambda 
//expressions to overloaded methods.
//
//There are two functional interfaces in the following code. 
//One is for int value calculation and the other is for long value.
//
//In the Main class there are overloaded methods called engine. 
//One is expecting IntCalculator and another is for LongCalculator.
//
//In the main method we have to indicate the parameters 
//for lambda expression to indicate compiler 
//which overloaded function we want to use.


public class ParameterizationAmbiguity {
	
		  public static void main(String[] argv) {
		    engine((int x,int y)-> x + y);
		    engine((long x, long y)-> x * y);
		    engine((int x,int y)-> x / y);
		    engine((long x,long y)-> x % y);
		  }/*w ww.j  a  va 2s. c o  m*/
		  private static void engine(IntCalculator calculator){
		    int x = 2, y = 4;
		    int result = calculator.calculate(x,y);
		    System.out.println(result);
		  }
		  private static void engine(LongCalculator calculator){
		    long x = 2, y = 4;
		    long result = calculator.calculate(x,y);
		    System.out.println(result);
		  }  
		}

		@FunctionalInterface
		interface IntCalculator{
		  int calculate(int x, int y);
		}

		@FunctionalInterface
		interface LongCalculator{
		  long calculate(long x, long y);
		}
		