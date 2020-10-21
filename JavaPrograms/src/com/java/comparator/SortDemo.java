package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.java.comparable.Employee;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 emp1 = new Employee1("Nithin", "Hyderabad", 10);
		Employee1 emp2 = new Employee1("Ashwin", "Chennai", 5);
		Employee1 emp3 = new Employee1("Tiwari", "Jharkand", 9);
		Employee1 emp4 = new Employee1("Origi", "Amsterdam", 18);
		Employee1 emp5 = new Employee1("Kane", "London", 2);
		Employee1 emp6 = new Employee1("Mane", "Senegal", 8);
		ArrayList<Employee1> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(new Employee1("Suarez", "Barcelona", 7));

		for (Employee1 em : list) {
			System.out.println(em);
		}
		Collections.sort(list, new NameSort());
		System.out.println("Sorted by name...");
		for (Employee1 em : list) {
			System.out.println(em);
		}

		Collections.sort(list, new Comparator<Employee1>() {

			@Override
			public int compare(Employee1 e1, Employee1 e2) {
				// TODO Auto-generated method stub

				return e1.getCity().compareTo(e2.getCity());
			}

		});
		System.out.println("Sorted by city...");
		for (Employee1 em : list) {
			System.out.println(em);
		}

		Collections.sort(list, (empl1, empl2) -> {
			return empl1.getEmpId().compareTo(empl2.getEmpId());
		});
		System.out.println("Sorted by Id...");
		for (Employee1 em : list) {
			System.out.println(em);
		}
	}
}
