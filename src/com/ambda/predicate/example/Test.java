package com.ambda.predicate.example;

import java.util.function.Predicate;

//test has the following syntax.
//
//boolean test(T t)


//Predicate interface contains the following default and static methods.
//
//We can use NOT, AND, and OR methods to create a predicate based on other predicates.
//
//default  Predicate<T> negate()
//default  Predicate<T> and(Predicate<? super T> other)
//default  Predicate<T> or(Predicate<?  super T> other)
//static <T> Predicate<T> isEqual(Object  targetRef)
//negate() negates a Predicate from the original predicate.
//
//and() combines two predicates with a short-circuiting logical AND.
//
//or() combines two predicates with a short-circuiting logical OR.
//
//isEqual() returns a predicate that tests 
//if two arguments are equal according to Objects.equals(Object, Object).
//
//We can chain the above methods to create complex predicates.
//

public class Test {

public static void main(String[] args) {
Predicate<String> str  = (s)-> s.length() > 5;

System.out.println(str.test("java2s.com "));

Predicate<Integer> intg  = (i)-> i.intValue() > 20;

System.out.println(intg.test(10));


}
}