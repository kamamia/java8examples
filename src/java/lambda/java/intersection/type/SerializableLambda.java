package java.lambda.java.intersection.type;

public class SerializableLambda {

	
//The following code creates an intersection type by intersecting 
//java.io.Serializable marker interface 
//with our own functional interface.
	
	
	 public static void main(String[] argv) {
		  
		    java.io.Serializable ser = (java.io.Serializable & CalculatorSer) (x,y)-> x + y;
		  }  
		}

		@FunctionalInterface
		interface CalculatorSer{
		  long calculate(long x, long y);
		}
		