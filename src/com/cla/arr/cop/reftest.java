package com.cla.arr.cop;

public class reftest{
    public static void main(String[] args){
         Foo f = new Foo("f");
         System.out.println(f.getAttribute());
         changeReference(f); // It won't change the reference!
         System.out.println(f.getAttribute());
         modifyReference(f); // It will modify the object that the reference variable "f" refers to!
         System.out.println(f.getAttribute());
    }
    public static void changeReference(Foo a){
         Foo b = new Foo("b");
         a = b;
    }
    public static void modifyReference(Foo c){
         c.setAttribute("c");
    }
}