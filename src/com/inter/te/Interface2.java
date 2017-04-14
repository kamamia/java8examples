package com.inter.te;

@FunctionalInterface
public interface Interface2 {
 
    void method2();
    
     
    default void log(String str){
        System.out.println("I2 logging::"+str);
    }
 

    default String mylog(String str){
       return "I2 logging::"+str;
    }
 
}
