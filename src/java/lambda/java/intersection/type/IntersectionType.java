package java.lambda.java.intersection.type;


//Java 8 introduced a new type called an intersection type
//
//An intersection type is an intersection of multiple types.
//
//An intersection type may appear as the target type in a cast.
//
//An ampersand is used between two types 
//as Type1 & Type2 to represent a 
//new type that is an intersection of Type1, Type2.

public class IntersectionType {

	
	
//	The following code uses a cast with an 
//	intersection type that creates a 
//	new synthetic type that is a subtype of all types.
//
//	It creates two interfaces, 
//	Calculator is a functional interface and can be used with lambda expression. 
//	The other is called NonFunction 
//	which is not a functional interface. 
//	In order to create a lambda expression and assign to NonFunction 
//	we use the & to create a new subtype.
//
//	The intersection 
//	type NonFunction & Calculator is a functional interface.
	
	
	 public static void main(String[] argv) {
		    
		    NonFunction nonFunction = (NonFunction & Calculator) (x,y)-> x + y;
		    
		  }  
		}

		@FunctionalInterface
		interface Calculator{
		  long calculate(long x, long y);
		}

		interface  NonFunction{
		}
		