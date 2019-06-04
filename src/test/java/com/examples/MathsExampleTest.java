package com.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.examples.MathsExample.addition;
import static com.examples.MathsExample.subtraction;
import static com.examples.MathsExample.multiplication;
import static com.examples.MathsExample.division;

public class MathsExampleTest {

	@Test
	public void testaddition() {
		int a = 1;
		int b = 20;

		int c = addition(a, b);
		assertEquals(21, c);

	}

	@Test
	public void testsubtraction() {
		int a = 1;
		int b = 20;

		int c = subtraction(a, b);
		assertEquals(-19, c);

	}

	@Test
	public void testmultiplication() {
		int a = 1;
		int b = 20;

		int c = multiplication(a, b);
		assertEquals(20, c);

	}

	@Test
	public void testdivision() {
		int a = 6;
		int b = 7;

		 double c = division(a, b);
		assertEquals((double) 0.8571428571428571, c,0.0);

	}

}
