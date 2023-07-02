package com.udemy.tutorial.kunal;

import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int value=0;
		do {
			System.out.println("Enter the value: ");
			value = sc.nextInt();
			
		}while(value!=5);
		System.out.println("We got 5");
		sc.close();
	}
}
