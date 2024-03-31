package com.aathi;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmaticTest {
    @Test
    public void testAdd() {
        ArithmaticCal calculator = new ArithmaticCal();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        ArithmaticCal calculator = new ArithmaticCal();
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testFactorial() {
        ArithmaticCal calculator = new ArithmaticCal();
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
        assertEquals(2, calculator.factorial(2));
        assertEquals(6, calculator.factorial(3));
        assertEquals(24, calculator.factorial(4));
        // Add more factorial test cases as needed
    }

    @Test
    public void testFib() {
        ArithmaticCal calculator = new ArithmaticCal();
        assertEquals(0, calculator.fib(0));
        assertEquals(1, calculator.fib(1));
        assertEquals(1, calculator.fib(2));
        assertEquals(2, calculator.fib(3));
        assertEquals(3, calculator.fib(4));
        // Add more Fibonacci test cases as needed
    }

}
