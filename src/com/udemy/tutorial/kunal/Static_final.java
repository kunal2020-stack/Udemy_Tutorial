package com.udemy.tutorial.kunal;

public class Static_final {
    // Static variable
    static int count = 0;

    // Final variable
    final double PI = 3.14159;

    // Static method
    static void incrementCount() {
        count++;
    }

    // Final method
    final void printPI() {
        System.out.println("The value of PI is " + PI);
    }

    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Count before increment: " + count);
        incrementCount();
        System.out.println("Count after increment: " + count);

        // Accessing final variable
        Static_final ex = new Static_final();
        System.out.println("The value of PI is " + ex.PI);

        // Calling final method
        ex.printPI();
    }
}