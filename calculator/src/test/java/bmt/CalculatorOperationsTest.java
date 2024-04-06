package bmt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple calculator
 */
public class CalculatorOperationsTest 
{
    
    @Test
    public void testAddition() {
        int result = CalculatorOperations.calculator(5, 3, '+');
        assertEquals(8, result);
    }  
    
    @Test
    public void testSubtract() {
        int result = CalculatorOperations.calculator(10, 4, '-');
        assertEquals(6, result);
    }
    
    @Test
    public void testMultiply() {
        int result = CalculatorOperations.calculator(2, 6, '*');
        assertEquals(12, result);
    }
    
    @Test
    public void testDivide() {
        int result = CalculatorOperations.calculator(20, 5, '/');
        assertEquals(4, result);
    }
}
