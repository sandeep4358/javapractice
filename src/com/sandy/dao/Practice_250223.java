package com.sandy.dao;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Practice_250223 {
	public static void main(String[] args) {
		prac1(EmployeeDao.loadEmployeesFromDB());
		
		
	}

	/**
	 * print all the employee with salary greater then 15lak and print there name
	 */
	public static void prac1(List<Employee> empList) {

		/*
		 * Annonymous
		 * List<Employee> employeeList = empList.stream().filter(new Predicate<Employee>() {

			@Override
			public boolean test(Employee t) {
				return t.getEmpName().startsWith("S");
			}
		}).collect(Collectors.toList());
		
		*/
		// below is the way of the Method references.
		List<Employee> employeeList = empList.stream().filter(e->e.getEmpName().startsWith("B")).filter(e->e.getSalary()>1000000).collect(Collectors.toList());

		Practice_250223 p = new Practice_250223();
		employeeList.forEach(System.out::println);

	}
	
}
