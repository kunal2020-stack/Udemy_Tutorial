package com.udemy.tutorial.kunal;

 class Frog {
	 String name;
	 int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getname(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

public class Getter_Setter {

	public static void main(String[] args) {
		Frog f1 = new Frog();
		f1.setName("Kunal");
		f1.setAge(23);
		System.out.println(f1.getname());
		System.out.println(f1.getAge());

	}

}
