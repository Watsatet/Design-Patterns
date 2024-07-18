package org.patterns.factory;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("getting Web develeoper salary");
		return 40000;
	}

}
