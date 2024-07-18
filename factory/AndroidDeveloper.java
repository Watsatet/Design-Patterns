package org.patterns.factory;

public class AndroidDeveloper implements Employee{
	@Override
	public int salary() {
		System.out.println("getting Android develeoper salary");
		return 50000;
	}
}
