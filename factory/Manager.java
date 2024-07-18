package org.patterns.factory;

public class Manager {
	public static void main(String[] args) {
		Employee e = EmployeeFactory.getEmployee("android developer");
		System.out.println(e.salary());
		Employee e1 = EmployeeFactory.getEmployee("web developer");
		System.out.println(e1.salary());
	}
}
