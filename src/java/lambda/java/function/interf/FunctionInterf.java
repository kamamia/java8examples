package java.lambda.java.function.interf;


//There are six specializations of the Function<T, R> interface:
//
//IntFunction<R>
//LongFunction<R>
//DoubleFunction<R>
//ToIntFunction<T>
//ToLongFunction<T>
//ToDoubleFunction<T>
//IntFunction<R>, LongFunction<R>, and DoubleFunction<R> take an int, 
//a long, and a double as an argument, respectively, 
//and their return value is in type R.
//
//ToIntFunction<T>, ToLongFunction<T>, and ToDoubleFunction<T> 
//take an argument of type T and return an int, a long, and a double, respectively.
//		
//		
//		
		
//		The Function interface contains the following default and static methods:
//
//			default <V> Function<T,V> andThen(Function<? super  R,? extends V> after)
//			default <V> Function<V,R> compose(Function<? super  V,? extends T> before)
//			static <T> Function<T,T> identity()
//			andThen() creates a Function that calls the current 
//function and specified function after to get the result.
//
//			compose() creates a Function that calls the specified function 
//then current function and returns the result.
//
//			identify() creates a function that returns its argument.
//			
			
public class FunctionInterf {

}
