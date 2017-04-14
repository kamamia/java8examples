package com.inter.te;


public interface Interface3 {
 
    void method3();
    void method3g();//here you can add another one
     
    default void log(String str){
        System.out.println("I2 logging::"+str);
    }
 

    default String mylog(String str){
       return "I2 logging::"+str;
    }
    static void print(String str){
        System.out.println("Printing "+str);
    }
    static void printG(String str){
        System.out.println("Printing "+str);
    }
     
}
