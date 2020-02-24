package com.qa.Fib;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
	@Test
	public void recurssionTest() {
			Fib run= new Fib();
			
			assertEquals(102334155,Fib.fib(40));
//	}
//	@Test
//	public void iterationTest() {
//		Fib run= new Fib();
//		assertEquals(run)
//	}

}
}
