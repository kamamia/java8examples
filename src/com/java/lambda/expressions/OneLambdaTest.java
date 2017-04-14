package com.java.lambda.expressions;


//A lambda expression is an unnamed function with parameters and a body.
//
//The lambda expression body can be a block statement or an expression.
//
//-> separates the parameters and the body.
//
//(int x) -> x + 1 takes an int parameter and returns the parameter value incremented by 1.
//
//(int x, int y) -> x + y takes two int parameters and returns the sum.
//
//(String msg)->{System.out.println(msg);} takes a String parameter and prints it on the standard output.
//
//msg->System.out.println(msg) takes a parameter and prints it on the standard output. It is identical to the code above.
//
//() -> "hi" takes no parameters and returns a string.
//
//(String str) -> str.length() takes a String parameter and returns its length.


//(Parameters) -> { Body }

public class OneLambdaTest {

//	(int x, int y) -> x + y;
	
	  public static void main(String[] args) {
		    MyIntegerCalculator myIntegerCalculator = (Integer s1) -> s1 * 2;

		    System.out.println("1- Result x2 : " + myIntegerCalculator.calcIt(5));

		  }
		}
		interface MyIntegerCalculator {

		  public Integer calcIt(Integer s1);

		  
		}
		

