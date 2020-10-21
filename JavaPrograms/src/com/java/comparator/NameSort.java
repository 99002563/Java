package com.java.comparator;

import java.util.Comparator;

public class NameSort implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 emp1, Employee1 emp2) {
		// TODO Auto-generated method stub
		return emp1.getName().compareTo(emp2.getName());
	}

}
