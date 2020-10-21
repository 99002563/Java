package com.java.comparable;

public class Employee implements Comparable<Employee> {
private Integer empId;
private String name;
private String city;


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(Integer empId, String name, String city) {
	super();
	this.empId = empId;
	this.name = name;
	this.city = city;
}

public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", city=" + city + "]";
}



@Override
public int compareTo(Employee empl) {
	// TODO Auto-generated method stub
	return this.getEmpId().compareTo(empl.getEmpId());
}



}
