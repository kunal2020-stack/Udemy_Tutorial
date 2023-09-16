package com.udemy.tutorial.kunal;

public class SringBuilderStringFormat {
	public static void main(String[] args) {

		String info = "";
		info += "Hello";
		info += " World!";
		System.out.println(info);
		// in the above code every time a new string is created due to which when we use
		// this in program then it will slow down the program

//		to over come the above issue we can use string builder in which every time by appending the value we are actually modifying the existing builder

		StringBuilder s =  new StringBuilder();
		s.append("Hello world");
		s.append(" ");
		s.append("Ready to code in Java. ");
		System.out.println(s.toString());
		
		//----
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello world").append(" ").append("Ready to code in any language. ");
//		The above is called chaining as sb is reference of class string builder which return the reference
		
		System.out.println(sb.toString());
		
		
//		//--formatting
		System.out.println("Here is the text.\tHere is the tab.\nHere is the new line");
		System.out.printf("Total quantity:%02d, Total Cost:%02d\n",5,50);
		
		System.out.printf("This is a floating point example %-7.2f",834.7398);
	}

}
