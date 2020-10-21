package com.java.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	/*	
		Employee emp1 =new Employee(10,"Nithin","Hyderabad");
		Employee emp2 =new Employee(5,"Ashwin","Chennai");
		Employee emp3 =new Employee(9,"Tiwari","Jharkand");
		Employee emp4 =new Employee(18,"Origi","Amsterdam");
		Employee emp5 =new Employee(2,"Kane","London");
		Employee emp6 =new Employee(8,"Mane","Senegal");
	ArrayList<Employee> list =new ArrayList<>();
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	list.add(emp5);
	list.add(emp6);
	*/
	
	List<Employee> list = Arrays.asList(
			new Employee(10,"Nithin","Hyderabad"),
			new Employee(5,"Ashwin","Chennai"),
			new Employee(9,"Tiwari","Jharkand"),
			new Employee(18,"Origi","Amsterdam"),
			new Employee(2,"Kane","London"),
			new Employee(8,"Mane","Senegal"));
			
	
	
	for(Employee empl : list) {
		System.out.println(empl);
	}
	Collections.sort(list);
	System.out.println();
	System.out.println("After Sorting");
	System.out.println(); 
	for(Employee empl : list) {
		System.out.println(empl);
	}
	System.out.println();
	System.out.println("Using Iterator");
	System.out.println();
	Iterator<Employee> it = list.iterator();
	while(it.hasNext()) {
		Employee emp = it.next();
		System.out.println(emp);
	}
	System.out.println();
	System.out.println("Using List Iterator(Reverse)");
	System.out.println();
	ListIterator<Employee> lit = list.listIterator(list.size());
	while(lit.hasPrevious()) {
		Employee e=lit.previous();
		System.out.println(e);
	}
	}

}
