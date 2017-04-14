package com.inter.te;

public class App {

	public static void main(String[] args) {
		MyClass mc= new MyClass();
		mc.log("aa");
		System.out.println(mc.mylog("bb"));
		
		Interface1 neway= (str) -> {
		System.out.println("Display from new Lambda Expression "+str);};
		
		neway.method1("str");
	}

}

