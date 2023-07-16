package com.udemy.tutorial.kunal;

import java.util.Scanner;

public class Array_java {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		int[] a= new int [3];
		
		a[0]=100;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("Length: "+a.length);
		
		sc.close();

	}
}
