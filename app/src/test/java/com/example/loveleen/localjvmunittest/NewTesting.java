package com.example.loveleen.localjvmunittest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewTesting {

    @Test
    public void addition() throws Exception
    {
        assertEquals(4,MyCalculatorModel.add(2,2));
    }

    @Test
    public void subtraction() throws Exception
    {
        assertEquals(4,MyCalculatorModel.subtract(8,4));
    }
}
