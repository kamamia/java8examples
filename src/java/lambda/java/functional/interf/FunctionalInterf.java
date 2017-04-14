package java.lambda.java.functional.interf;


//A functional interface is an interface with 
//one method and used 
//as the type of a lambda expression.

public class FunctionalInterf {
	

//	In the following code we assign 
//	a lambda expression to its functional interface. 
//	Then we execute the lambda expression 
//	by calling the method defined in the 
//	functional interface and pass in a parameter.
//	
	 public static void main(String[] argv) {
		    Processor stringProcessor = (String str) -> str.length();
		    String name = "Java Lambda";
		    int length = stringProcessor.getStringLength(name);
		    System.out.println(length);

		  }
		}

		@FunctionalInterface
		interface Processor {
		  int getStringLength(String str);
		}
		