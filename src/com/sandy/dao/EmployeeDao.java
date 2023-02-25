package com.sandy.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author Sandeep
 *
 */

public class EmployeeDao {

	/**
	 * 
	 * @return random list of employees
	 */
	public List<Employee> loadEmployeesFromDBRangeWise() {
		return IntStream.rangeClosed(1, 10).mapToObj(i -> new Employee(i, "employee" + i, new Random().nextInt(5000)))
				.collect(Collectors.toList());
	}
	
	/**
	 * 
	 * @return  retrun employee list
	 */

	public List<Employee> loadEmployeesFromDB() {

		List<Employee> emplist = new ArrayList<Employee>();

		Employee emp = new Employee(12, "Sandeep", 2800000);
		Employee emp1 = new Employee(11, "Acalan", 1500000);
		Employee emp2 = new Employee(13, "Bartel", 1330000);
		Employee emp3 = new Employee(14, "Benjiman", 2100000);
		Employee emp4 = new Employee(15, "Elvis", 1300000);
		Employee emp5 = new Employee(16, "Evans", 1400000);
		Employee emp6 = new Employee(17, "Julieann", 2800000);
		Employee emp7 = new Employee(18, "Kamora", 2100000);
		Employee emp8 = new Employee(19, "Lagina", 1800000);

		emplist.add(emp);
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);
		emplist.add(emp5);
		emplist.add(emp6);
		emplist.add(emp7);
		emplist.add(emp8);

		return emplist;
	}
}
