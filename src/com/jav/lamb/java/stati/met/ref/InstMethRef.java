package com.jav.lamb.java.stati.met.ref;

import java.util.function.BiFunction;
// see too
//Bound Instance Method Reference   instance::MethodName
// and Unbound Instance Method Reference  ClassName::instanceMethod

public class InstMethRef {
// this is Supertype Instance Method References
	 public static void main(String[] argv){
		    new Util();
		  }
		}
		class Util extends ParentUtil{
		  
		  public Util(){
		    BiFunction<String,  String,String> strFunc = this::append; 
		    String name ="java2s.com";
		    String s=  strFunc.apply(name," hi"); 
		    System.out.println(s);
		    
		    strFunc = Util.super::append; 
		    name ="java2s.com";
		    s=  strFunc.apply(name," Java Lambda Tutorial"); 
		    System.out.println(s);

		  }
		  
		  @Override
		  public String append(String s1,String s2){
		    System.out.println("child append");
		    return s1+s2;
		  }  
		}
		class ParentUtil{
		  public String append(String s1,String s2){
		    System.out.println("parent append");
		    return s1+s2;
		  }  
		}
		