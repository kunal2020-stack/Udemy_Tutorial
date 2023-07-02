package com.udemy.tutorial.kunal;

import java.util.Scanner;

public class Switch_keyword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the status");
		String s = sc.nextLine();
		switch (s) {
		case "start":
			System.out.println("Program started");
			break;

		case "end":
			System.out.println("Program ended");
			break;

		default:
			System.out.println("program runing");
		}
		sc.close();
	}
}
