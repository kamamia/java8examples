package com.java.lambda.expression.context;


//Lambda expressions can be used only in the following four contexts.
//
//Assignment Context
//Method Invocation Context
//Return Context
//Cast Context
//

//
//Assignment Context
//A lambda expression can appear 
//to the right of the assignment operator.

public class AssignmentContext {

	  public static void main(String[] argv) {
		    Calculator iCal = (x,y)-> x + y;
		    System.out.println(iCal.calculate(1, 2));
		  }
		}

		@FunctionalInterface
		interface Calculator{
		  int calculate(int x, int y);
		}
		