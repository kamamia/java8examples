package com.test.freq.j8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;


//String [] cities={	"Tirana", "Durrës" ,"Vlorë" ,"Elbasan" ,"Shkodër" ,"Korçë" ,"Fier" ,"Kamëz" ,"Berat" ,"Lushnjë" ,
//		"Sarandë","Paskuqan","Kavajë" ,"Pogradec" ,"Gjirokastër" };




public class TestFreq {
	
	static String [] cities={	"Tirana", "Durrës" ,"Vlorë" ,"Elbasan" ,
		"Shkodër" ,"Korçë" ,"Fier" ,"Kamëz" ,"Berat" ,"Lushnjë" ,
			"Sarandë","Paskuqan","Kavajë" ,"Pogradec" ,"Gjirokastër",
	"Sarandë","Paskuqan","Kavajë" ,"Pogradec" ,"Gjirokastër" };
	
//	static String [] cities={	"Tirana","Tirana","Tirana","Tirana","Tirana","Tirana"};
	public static void main(String [] argv)
	{
		//printMap(createMap(cities));
		
		printMap2(createMap2(cities));
		
	}
	
	public static void printMap(Map<String, Integer> in)
	{
		Set<Entry<String, Integer>> es=in.entrySet();
		for(Entry en:es)
		{
			System.out.println(en.getKey()+"    "+en.getValue());
			
		}
		
		
		
		
	}
	
	public static Map<String, Integer> createMap(String [] cities)
	{
		Map<String, Integer> ret = new HashMap<String, Integer>();
		
		java.util.List<String> lic=  Arrays.asList(cities);
		
		
		Function<Integer,Integer> funcintpp  = intpp ->  new Integer(intpp++);
		
	//	funcintpp.apply(t)
		//lic.forEach((lici) -> System.out.print(lici + "; "));
		
		Function<String ,Map<String, Integer>> func1 = y -> {
			//Map<String, Integer> retin = new HashMap<String, Integer>();
		      for(String ci:lic){
		    	 // System.out.println("   etcc ->"+ci);
		    	 // System.out.println("fdfsdf->"+ci);
		        if(ret.get(ci)==null){
		        	// System.out.println("   etcc ->");
		          ret.put(ci, new Integer(1));
		        }else
		        {
		        	//System.out.println("fdfsdf");
		        	// retin.put(ci, funcintpp.apply(ret.get(ci)));
		        	 ret.put(ci, ret.get(ci).intValue()+1);
		        	
		        }
		      }
			return ret;
		     
		    };
		   
		    func1.apply("go");
		
		return ret;
		
		
	}
	
	
	
	public static Map<String, Integer> createMap2(String [] cities)
	{
		Map<String, Integer> ret = new HashMap<String, Integer>();
		
		java.util.List<String> lic=  Arrays.asList(cities);
		
		
		Function<Integer,Integer> funcintpp  = intpp ->  new Integer(intpp++);
		
	//	funcintpp.apply(t)
		//lic.forEach((lici) -> System.out.print(lici + "; "));
		
		Processor pr = (List <String>list) -> {
			Map<String, Integer> retin = new HashMap<String, Integer>();
		      for(String ci:list){
		    	 // System.out.println("   etcc ->"+ci);
		    	 // System.out.println("fdfsdf->"+ci);
		        if(retin.get(ci)==null){
		        	// System.out.println("   etcc ->");
		        	retin.put(ci, new Integer(1));
		        }else
		        {
		        	//System.out.println("fdfsdf");
		        	// retin.put(ci, funcintpp.apply(ret.get(ci)));
		        	retin.put(ci, retin.get(ci).intValue()+1);
		        	
		        }
		      }
			return retin;
		     
		    };
		   
		  // func1.apply("go");
		    ret= pr.getMap(lic);
		return ret;
		
		
	}
	
	public static void printMap2(Map<String, Integer> in)
	{
		Printer prt=(Map<String,Integer> map)->{
			
			Set<Entry<String, Integer>> es=map.entrySet();
			for(Entry en:es)
			{
				System.out.println(en.getKey()+"    "+en.getValue());
				
			}
			
		};
		
		prt.printMap(in);
		
		
		
		
	}

}


@FunctionalInterface
interface Processor {
	Map<String, Integer> getMap(List <String>list);
}

@FunctionalInterface
interface Printer {
	void printMap(Map <String,Integer>map);
}
