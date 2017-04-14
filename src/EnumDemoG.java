public class EnumDemoG {
  //This will retrieve line separator dependent on OS.
   static String newLine = System.getProperty("line.separator");
  
  //Declaring enums. enums extends java.lang.Enum
  //This example initializes enum using a costructor & getDirection() 
  //method & display values of enums.
  public enum DIRECTION
  {
    //You can initialize enums using enumname(value)
    WEST,
    NORTH,
    EAST,
    SOUTH;
    
   
  }
  
  public static void main(String[] args) {
    
    System.out.println(newLine + "Declaring and Using Enums in Java000" + newLine);
    System.out.println("---------------------------------" + newLine);
    System.out.println(newLine + "Looping through Enums in Java" + newLine);
    //Loop and access enums
    //enum.values() will iterate through the enum values, 
    //here direction values like north, south... 
    for(DIRECTION currentDirection : DIRECTION.values())
    {
      //get the direction while looping, using currentDirection will print the enum
      //here it will print NORTH, SOUTH etc.. 
      //so it will call the constructor and initialize the value also
      System.out.println(currentDirection + " value is : " + currentDirection.ordinal()
      + newLine);
    }
  }
}
