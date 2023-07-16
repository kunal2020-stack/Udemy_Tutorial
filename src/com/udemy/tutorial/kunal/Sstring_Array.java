package com.udemy.tutorial.kunal;

public class Sstring_Array {

	public static void main(String[] args) {
		String[] s = new String[3];
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);//-->This will print null as string has null as its default value
		}
		System.out.println("-----------");
		String[] s1 = new String[2];
		
		s1[0] = "Hello";
		s1[1] = "Don";
		for(String ss:s1) {
			System.out.println(ss);
		}

	}

}
