package com.examples;

public class MathsExample {

	public static void main(String[] args) throws Exception {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int c = addition(a, b);
		System.out.println(" Addition of two numbers : " + c);

		int d = subtraction(a, b);
		System.out.println(" Subtraction of two numbers : " + d);

		int e = multiplication(a, b);
		System.out.println(" Multiplication of two numbers : " + e);

		double f = division(a, b);
		System.out.println(" Division of two numbers : " + f);

	}

	public static int addition(int a, int b) {
		return a + b;

	}

	public static int subtraction(int a, int b) {
		return a - b;

	}

	public static int multiplication(int a, int b) {
		return a * b;

	}

	public static double division(int a, int b) {
		return (double) a / (double) b;

	}
}
