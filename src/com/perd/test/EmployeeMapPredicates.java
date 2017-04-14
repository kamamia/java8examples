package com.perd.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class EmployeeMapPredicates
{
    public static Predicate<EmployeeDep> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }
     
    public static Predicate<EmployeeDep> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }
     
    public static Predicate<EmployeeDep> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }
    
    public static Predicate<EmployeeDep> isDepartement(String departement) {
        return p -> p.getDepartement().equalsIgnoreCase(departement);
    }
     
    public static List<EmployeeDep> filterEmployeesdep (List<EmployeeDep> employeeDep1,List<EmployeeDep> employeeDep2, Predicate<EmployeeDep> predicate) {
        return Stream.concat(employeeDep1.stream(), employeeDep2.stream()).filter( predicate ).collect(Collectors.<EmployeeDep>toList());
    }
    
    public static Predicate<EmployeeDep> isDepartementC(String departement) {
        return p -> p.getDepartement().equalsIgnoreCase(departement);
    }
    public static List<EmployeeDep> filterEmployees (List<EmployeeDep> employeeDep, Predicate<EmployeeDep> predicate) {
        return employeeDep.stream().filter( predicate ).collect(Collectors.<EmployeeDep>toList());
    }
} 

