package com.revature.collection;

public class Person implements Comparable<Person> {
	public int age;

	public Person(int age) {
		super();
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return this.age-o.age;
	}
}
