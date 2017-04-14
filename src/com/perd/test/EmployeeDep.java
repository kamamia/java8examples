package com.perd.test;


public class EmployeeDep {
   
  private String departement;

public EmployeeDep(String departement,Integer id, Integer age, String gender, String fName, String lName){
      this.setDepartement(departement);
	  this.id = id;
      this.age = age;
      this.gender = gender;
      this.firstName = fName;
      this.lastName = lName;
  }
    
  public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

private Integer id;
  private Integer age;
  private String gender;
  private String firstName;
  private String lastName;

  //Please generate Getter and Setters

   @Override
   public String toString() {
       return this.id.toString()+" - "+this.age.toString()+" - "+this.departement.toString(); //To change body of generated methods, choose Tools | Templates.
   }

public String getDepartement() {
	return departement;
}

public void setDepartement(String departement) {
	this.departement = departement;
}
}
