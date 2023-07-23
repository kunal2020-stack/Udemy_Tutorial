package com.udemy.tutorial.kunal;

class Person {
	String name;
	int age;

	void Speaks() {
		System.out.println("Hi there!");
		System.out.println("My name is: " + name + " and my age is: " + age);
	}

}

public class Classes_Objects {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Kunal";
		person1.age = 21;

		Person person2 = new Person();
		person2.name = "Kunal1";
		person2.age = 22;

		System.out.println("Person1");
		System.out.println("Name: " + person1.name + "\n" + "Age: " + person1.age);
		person1.Speaks();

		System.out.println();

		System.out.println("Person2");
		System.out.println("Name: " + person2.name + "\n" + "Age: " + person2.age);
		person2.Speaks();
	}

}
