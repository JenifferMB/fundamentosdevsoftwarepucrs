package com.exercicio02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
/**
 * Unit test for simple App.
 */
public class CalculatorTest {
    /**
     * Rigorous Test :-)
     */
    
    private Calculator calc;

    @BeforeEach
    public void initialize(){
        this.calc = new Calculator();
    }


    @Test
    public void sumWithSameNumbers()
    {
        String test = "1+1+1+1";
        int expression = calc.evaluate(test);
        Assertions.assertEquals(4, expression);
    }

    @Test
    public void sumWithAscendingOrder()
    {
        String test = "1+2+3+4";
        int expression = calc.evaluate(test);
        Assertions.assertEquals(10, expression);
    }

    @Test
    public void sumWithDescendingOrder()
    {
        String test = "4+3+2+1";
        int expression = calc.evaluate(test);
        Assertions.assertEquals(10, expression);
    }

    @Test
    public void sumOneNumber()
    {
        String test = "41";
        int expression = calc.evaluate(test);
        Assertions.assertEquals(41, expression);
    }

}
