package com.perd.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEmployeeTHEMapPredicates {
	
	 public static Predicate<Map<String,String>> isDepartement(String departement) {
	        return p -> p.get("dep").equalsIgnoreCase(departement)  ;
	    }
	 
	 public static List<Map<String,String>> filterEmployees (List<Map<String,String>> employeeDep, Predicate<Map<String,String>> predicate) {
	        return employeeDep.stream().filter( predicate ).collect(Collectors.<Map<String,String>>toList());
	    }
    public static void main(String[] args){
    	String [][] emplyees={
    			    {"IT","M","Rick","Beethovan"},
    				{"IT","F","Martina","Hengis"},
    				{"IT","M","Ricky","Martin"},
    				{"IT","M","Jon","Lowman"},
    				{"IT","F","Cristine","Maria"},
    				{"CT","M","David","Feezor"},
    				{"CT","F","Melissa","Roy"},
    				{"CT","M","Alex","Gussin"},
    				{"CT","F","Neetu","Singh"},
    				{"CT","M","Naveen","Jain"},

    				 {"IT1","M1","Rick1","Beethovan"},
    				 {"IT1","F1","Martina1","Hengis"},
    				 {"IT1","M1","Ricky1","Martin"},
    				 {"IT1","M1","Jon1","Lowman"},
    				 {"IT1","F1","Cristine1","Maria"},
    				 {"CT1","M1","David1","Feezor"},
    				 {"CT1","F1","Melissa1","Roy"},
    				 {"CT1","M1","Alex1","Gussin"},
    				 {"CT1","F1","Neetu1","Singh"},
    				 {"CT1","M1","Naveen1","Jain"}
    				};
    	
    	List<Map<String,String>> empls= new ArrayList<Map<String,String>>();
    	
    	for(int i=0;i<emplyees.length;i++){
    		Map<String,String> row=new HashMap<String,String>();
    		for(int j=0;j<emplyees[i].length;j++){
    			 switch (j) {
    			 	case 0:  row.put("dep", emplyees[i][j]);
    			 	break;
    			 	
    	            case 1:  row.put("sex", emplyees[i][j]);
    	                     break;
    	            case 2:  row.put("firstname", emplyees[i][j]);
    	                     break;
    	            case 3:  row.put("lastname", emplyees[i][j]);
    	                     break;
    	           
    	            default: 
    	                     break;
    	        }
        		System.out.print(emplyees[i][j]+"  ");
        		
        	}	
    		System.out.println();
    		empls.add(row);
    	}
    	
    	
    	 System.out.println(empls);
       
      //  System.out.println(filterEmployees(allEmpl, isDepartement("IT")));
      //  System.out.println(filterEmployees(allEmpl, isDepartement("CT")));
    	 
    	
    	 System.out.println("\n\n\n");
    	 List<Map<String,String>> emplsIT= new ArrayList<Map<String,String>>();
    	 List<Map<String,String>> emplsIT1= new ArrayList<Map<String,String>>();
    	 List<Map<String,String>> emplsCT= new ArrayList<Map<String,String>>();
    	 List<Map<String,String>> emplsCT1= new ArrayList<Map<String,String>>();
    	 
    	 emplsIT=filterEmployees(empls, isDepartement("IT"));
    	 
    	 emplsIT1=filterEmployees(empls, isDepartement("IT1"));
    	 
    	 emplsCT=filterEmployees(empls, isDepartement("CT"));
    	 
    	 emplsCT1=filterEmployees(empls, isDepartement("CT1"));
    	 
    	 
    	 System.out.println(emplsIT);
    	 System.out.println(emplsIT1);
 
    	 System.out.println(emplsCT);
    	 System.out.println(emplsCT1);
    	 
    	final List<Map<String,String>> emplsIT1f= new ArrayList<Map<String,String>>();
    	emplsIT1f.addAll(emplsIT1);
    	 
    	 
    /*	 Map<Long, Author> totalVisitCounts = Stream.concat(visitCounts1.entrySet().stream(), visitCounts2.entrySet().stream())
    			    .collect(Collectors.toMap(
    			        entry -> entry.getKey(), // The key
    			        entry -> entry.getValue(), // The value
    			        // The "merger"
    			        (visitCounts1, visitCounts2) -> visitCounts1 + visitCounts2
    			    )
    			);*/
    	 
    //	 List<Map<String,String>> filterEmployeesresult=Stream.concat(emplsIT.stream(), emplsIT1.stream())
    	 
    	 Map<String, String> totalVisitCounts = Stream.concat(emplsIT.get(0).entrySet().stream(), emplsIT1.get(0).entrySet().stream())
 			    .collect(Collectors.toMap(
 			        entry -> entry.getKey(), // The key
 			        entry -> entry.getValue(), // The value
 			        // The "merger"
 			        (emplsit, emplsit1) -> emplsit + emplsit1
 			    )
 			   
 			);  
    	 
    	 System.out.println("tttt->"+totalVisitCounts);
    	 
    	/* List<String<Map<String, String>>> totalVisitCounts1 = Stream.concat(emplsIT.stream(), emplsIT1.stream())
  			    .collect(Collectors.toList() (
  			        entry -> entry.  , // The key
  			        entry -> entry.getValue(), // The value
  			        // The "merger"
  			        (emplsit, emplsit1) -> emplsit + emplsit1
  			    )
  			);  */
     	 
    	 
    	/* Map<String, String> totalVisitCounts1 = Stream.concat(emplsIT.get(0).entrySet().stream(), emplsIT1.get(0).entrySet().stream())
  			    .collect(Collectors.toMap(
  			    		 new Function<java.util.Map.Entry<String, String> , java.util.Map.Entry<String, String>>() { 
  		                    public String apply(java.util.Map.Entry e1,java.util.Map.Entry e2) { 
  		                    	
  		                    	
  		                    	String ret=  ("sex".equalsIgnoreCase((String)e1.getKey())? ((String) e2.getValue()):((String) e1.getValue()));
  		                    	return ret;
  		                    }

							@Override
							public Entry<String, String> apply(
									Entry<String, String> t) {
								// TODO Auto-generated method stub
								Entry<String, String> ret=  ("sex".equalsIgnoreCase((String)t.getKey())? t:null);
  		                    	return ret;
							} 
  		                },
  		                Function.<java.util.Map.Entry<String, String> , java.util.Map.Entry<String, String>>identity();
  			);  */
    	 
    	/* Map<String, String> totalVisitCounts1 = Stream.concat(emplsIT.get(0).entrySet().stream(), emplsIT1.get(0).entrySet().stream())
  			    .collect(Collectors.toMap(
  			        entry -> entry.getKey(), // The key
  			        entry -> entry.getValue(), // The value
  			        // The "merger"
  			        (emplsit, emplsit1) -> {
  			        	//String key=getKey();
  			        	return emplsit + emplsit1;},
  			       HashMap::new
  			    )
  			   
  			);  */
    // 	 System.out.println(totalVisitCounts1);
     	 
     	List<Map<String, String>> totalVisitCounts2 = Stream.concat(emplsIT.stream(), emplsIT1.stream()).collect(
     			Collectors.toList()
     			
     			);
     	
     	System.out.println(totalVisitCounts2);
    //List<Map<String, String>> totalVisitCounts3 =
     System.out.println("\n\n\n");	
/*      Stream.of(emplsIT,emplsIT1).forEach(
     			
    		  maaap->maaap.
    		  {
    			maaap->  
    		  }
     			
     			);*/
     	
     	
     	
     	/*Stream.concat(emplsIT.stream(),emplsIT1.stream()).forEach(
     		
      		 System.out::println
       			
       			);
     	*/
     	
//     	emplsIT.stream().forEach(
//map->map.values().stream()
//     			
//     			);
     			
     			
     			
     		
//     	emplsIT.set(index, element)
     	
     	List<Map<String, String>> totalVisitCounts3 = Stream.concat(emplsIT.stream(), emplsIT1.stream()).filter(
     			map->map.entrySet().stream().anyMatch(
     					entry-> entry.getKey().equalsIgnoreCase("firstname") && entry.getValue().contains("i")		
     					)
     			
     			).collect(Collectors.toList());
     	
     	System.out.println("sdfsa  "+totalVisitCounts3);
     	
    }
}

