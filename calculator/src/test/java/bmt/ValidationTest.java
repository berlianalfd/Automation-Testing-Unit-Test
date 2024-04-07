package bmt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for validation
 */
public class ValidationTest {
    
    @Test
    public void testValidasiAddition() {
        Validation validation = new Validation();
        try {
            validation.Validasi(5, '+', 3);
        } catch (IllegalArgumentException e) {
            fail("Validasi addition gagal: " + e.getMessage());
        }
    }  
    
    @Test
    public void testValidasiSubtract() {
        Validation validation = new Validation();
        try {
            validation.Validasi(10, '-', 4);
        } catch (IllegalArgumentException e) {
            fail("Validasi subtract gagal: " + e.getMessage());
        }
    }
    
    @Test
    public void testValidasiMultiply() {
        Validation validation = new Validation();
        try {
            validation.Validasi(2, '*', 6);
        } catch (IllegalArgumentException e) {
            fail("Validasi multiply gagal: " + e.getMessage());
        }
    }
    
    @Test
    public void testValidasiDivide() {
        Validation validation = new Validation();
        try {
            validation.Validasi(20, '/', 5);
        } catch (IllegalArgumentException e) {
            fail("Validasi divide gagal: " + e.getMessage());
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiNonNumericInput(){
        Validation validation = new Validation();
        validation.Validasi(10, '+', 'a'); // Input tidak numerik
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiOutOfRange() {
        Validation validation = new Validation();
        validation.Validasi(40000, '-', 1000); // Input melebihi range
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiDivisionByZero(){

        Validation validation = new Validation();
        validation.Validasi(10, '/', 0); // Pembagian dengan nol
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiInvalidOperator() {
        Validation validation = new Validation();
        validation.Validasi(5, '&', 3); // Operator tidak valid
    }
}
