package com.examples;

public class MathsExample {

	public static void main(String[] args) throws Exception {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		addition(a, b);
		subtraction(a, b);
		multiplication(a, b);
		division(a, b);

	}

	public static void addition(int a, int b) {
		int total = a + b;
		System.out.println(" Addition of two numbers : " + total);

	}

	public static void subtraction(int a, int b) {
		int total = a - b;
		System.out.println(" Subtraction of two numbers : " + total);

	}

	public static void multiplication(int a, int b) {
		int total = a * b;
		System.out.println(" Multiplication of two numbers : " + total);

	}

	public static void division(int a, int b) {
		double total = (double) a / (double) b;
		System.out.println(" Division of two numbers : " + total);

	}
}
