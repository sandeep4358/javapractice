package com.sandy.methodReference;

import java.util.List;

import com.sandy.dao.Employee;
import com.sandy.dao.EmployeeDao;

public class MethodRefrenceDemo {
	public static void main(String[] args) {
		EmployeeDao emp = new EmployeeDao();
		List<Employee> list = emp.loadEmployeesFromDB();
			list.forEach(t -> System.out.println(t));
	}
}
