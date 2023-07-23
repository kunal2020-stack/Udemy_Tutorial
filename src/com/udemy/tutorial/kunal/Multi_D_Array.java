package com.udemy.tutorial.kunal;

public class Multi_D_Array {

	public static void main(String[] args) {
		int[][] numbDA = { { 1, 2, 3, 4 }, { 5, 3, 9, 29, 129 } };
		System.out.println(numbDA[0][1]);

		System.out.println(numbDA.length);
		System.out.println();

		for (int i = 0; i < numbDA.length; i++)

		{
			for (int j = 0; j < numbDA[i].length; j++) {
				System.out.print(numbDA[i][j] + "\t");
			}
			System.out.println();
		}

		String[][] text = new String[2][3];
		text[0][1] = "Hello world";
		System.out.println(text[0][1]);
		System.out.println(text[0][2]);

		String[][] words = new String[2][];
		words[0] = new String[3];
		words[0][1] = "jai Ho";
		System.out.println(words[0][1]);
		System.out.println(words[0][2]);

	}
}
