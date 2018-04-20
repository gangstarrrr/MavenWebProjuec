package kr.co.gdu;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	int a=2;
	int b=6;
	Calculator cal;
	
	@Before
	public void before() {
		System.out.println("before()");
		cal=new Calculator();
	}
	@Test
	public void test() {

		System.out.println("test()");
		int add=cal.add(a, b);
		int substract=cal.subtaract(add,b);
		int multiply=cal.multiply(substract, a);
		int divide=cal.divide(multiply, a);
		assertEquals(2, divide);
//		System.out.println(cal.add(a, b));
//		System.out.println(cal.subtaract(a, b));
//		System.out.println(cal.multiply(a, b));
//		System.out.println(cal.divide(a, b));
	}
	@After
	public void after() {
		System.out.println("after()");
	}
	
}
