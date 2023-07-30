package com.udemy.tutorial.kunal;

class Machine {
	public Machine() {

		this("test");//this will call the constructor which take string as the parameter
		System.out.println("Inside the default constructor");
	}
	public Machine(String text) {
		System.out.println("Calling parameteraise constructor "+text);
	}
	public Machine (String text,int num) {
		System.out.println("Calling doubly parameterized constructor "+text+num);
	}
}

public class Constructors_this {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("parameterise1");
		Machine machine3 = new Machine("parameterise",3);

	}

}
