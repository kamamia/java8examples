package com.perd.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.perd.test.EmployeeMapPredicates.*;

public class TestEmployeeMapPredicates {
    public static void main(String[] args){
    	EmployeeDep e1  = new EmployeeDep("IT",1,23,"M","Rick","Beethovan");
    	EmployeeDep e2  = new EmployeeDep("IT",2,13,"F","Martina","Hengis");
    	EmployeeDep e3  = new EmployeeDep("IT",3,43,"M","Ricky","Martin");
    	EmployeeDep e4  = new EmployeeDep("IT",4,26,"M","Jon","Lowman");
    	EmployeeDep e5  = new EmployeeDep("IT",5,19,"F","Cristine","Maria");
    	EmployeeDep e6  = new EmployeeDep("CT",6,15,"M","David","Feezor");
    	EmployeeDep e7  = new EmployeeDep("CT",7,68,"F","Melissa","Roy");
    	EmployeeDep e8  = new EmployeeDep("CT",8,79,"M","Alex","Gussin");
    	EmployeeDep e9  = new EmployeeDep("CT",9,15,"F","Neetu","Singh");
    	EmployeeDep e10 = new EmployeeDep("CT",10,45,"M","Naveen","Jain");
         
        List<EmployeeDep> itdepartement = new ArrayList<EmployeeDep>();
        itdepartement.addAll(Arrays.asList(new EmployeeDep[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
                
        System.out.println(filterEmployees(itdepartement, isAdultMale()));
         
        System.out.println(filterEmployees(itdepartement, isAdultFemale()));
         
        System.out.println(filterEmployees(itdepartement, isAgeMoreThan(35)));
         
        //Employees other than above collection of "isAgeMoreThan(35)" can be get using negate()
        System.out.println(filterEmployees(itdepartement, isAgeMoreThan(35).negate()));
        
        System.out.println(filterEmployees(itdepartement, isDepartement("IT")));
        System.out.println(filterEmployees(itdepartement, isDepartement("CT")));
        
        List<EmployeeDep> itd=filterEmployees(itdepartement, isDepartement("IT"));
        
        List<EmployeeDep> ctd=filterEmployees(itdepartement, isDepartement("CT"));
        
        System.out.println("\n\n\n");
        
        System.out.println(itd);
        System.out.println("\n\n\n");
        System.out.println(ctd);
        
        
    }
}

