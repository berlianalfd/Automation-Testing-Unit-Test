package bmt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple calculator
 */
public class MainTest 
{
        
        
    
        @Test
        public void testSubtract() {
            Calculator calculator = new Calculator();
            int result = calculator.subtract(10, 4);
            assertEquals(6, result);
        }
    
        @Test
        public void testMultiply() {
            Calculator calculator = new Calculator();
            int result = calculator.multiply(2, 6);
            assertEquals(12, result);
        }
    
        @Test
        public void testDivide() {
            Calculator calculator = new Calculator();
            int result = calculator.divide(20, 5);
            assertEquals(4, result);
        }
    
        @Test(expected = IllegalArgumentException.class)
        public void testDivideByZero() {
            Calculator calculator = new Calculator();
            calculator.divide(10, 0);
        }
    
    
    
}
