package com.inter.te;
//<aop:aspectj-autoproxy />
@FunctionalInterface
public interface Interface1 {
 
    void method1(String str);
//    void method1G(String str);only one abstract on functional
     
    default void log(String str){
        System.out.println("I1 logging::"+str);
    }
    default void logG(String str){
        System.out.println("I1 logging::"+str);
    }
     
    static void print(String str){
        System.out.println("Printing "+str);
    }
    static void printG(String str){
        System.out.println("Printing "+str);
    }
     
    //trying to override Object method gives compile time error as
    //"A default method cannot override a method from java.lang.Object"
     
//  default String toString(){
//      return "i1";
//  }
     
}
