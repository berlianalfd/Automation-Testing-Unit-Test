package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for operations calculator
 */

public class CalculatorOperationsTest 
{
   // Test untuk penjumlahan
    @Test
    public void testAddition() {
        assertEquals(8, CalculatorOperations.calculator(5, 3, '+'));
    }  
    
    // Test untuk pengurangan
    @Test
    public void testSubtract() {
        assertEquals(6, CalculatorOperations.calculator(10, 4, '-'));
    }
    
    // Test untuk perkalian
    @Test
    public void testMultiply() {
        assertEquals(12, CalculatorOperations.calculator(2, 6, '*'));
    }
   
    // Test untuk pembagian
    @Test
    public void testDivide() {
        assertEquals(4, CalculatorOperations.calculator(20, 5, '/'));
    }
}
