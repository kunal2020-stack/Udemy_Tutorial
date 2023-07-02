package com.udemy.tutorial.kunal;

import java.util.Scanner;

public class User_input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number that you want to display. ");
		int a = sc.nextInt();
		System.out.println("Number entered by you is: " + a);
		sc.close();

	}
}
