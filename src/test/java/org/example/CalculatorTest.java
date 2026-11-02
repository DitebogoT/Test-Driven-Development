package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd()
    {
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    public void testMultiplicataion()
    {
        Calculator calculator = new Calculator();
        assertEquals(24,calculator.multiply(3,8));
    }

    @Test
    public void testDivision()
    {
        Calculator calculator = new Calculator();
        assertEquals(6.0,calculator.divide(36,6));
    }

}