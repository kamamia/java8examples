package com.java.lambda.behaviour;


//The following code creates a functional interface called Calculator.
//
//Inside the Calculator there is a method called calculate which accepts 
//two int parameters and return an int value.
//
//In the Main class there is an engine method 
//which accepts the functional interface Calculator as the 
//parameter. And it calls the calculate method from 
//the Calculator and outputs the result.
//
//In the main method we call the engine methods 
//four times with different lambda expressions.

public class BehaviourParameter {
	 public static void main(String[] argv) {
		    engine((x,y)-> x + y);
		    engine((x,y)-> x * y);
		    engine((x,y)-> x / y);
		    engine((x,y)-> x % y);
		  }
		  private static void engine(Calculator calculator){
		    int x = 2, y = 4;
		    int result = calculator.calculate(x,y);
		    System.out.println(result);
		  }
		}

		@FunctionalInterface
		interface Calculator{
		  int calculate(int x, int y);
		}
		