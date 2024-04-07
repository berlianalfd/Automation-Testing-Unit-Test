package bmt;

import org.junit.Test;

/**
 * Unit test for Validation
 */
public class ValidationTest {
    
    @Test(expected = NumberFormatException.class)
    public void testValidasiInputNonNumerik(){
        Validation validation = new Validation();
        validation.Validasi(10, '+', 'a'); // Input tidak numerik
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiInputOutOfRange() {
        Validation validation = new Validation();
        validation.Validasi(40000, '-', 1000); // Input melebihi range
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiDivisionByZero(){
        Validation validation = new Validation();
        validation.Validasi(10, '/', 0); // Pembagian dengan nol
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiOperatorTidakValid() {
        Validation validation = new Validation();
        validation.Validasi(5, '&', 3); // Operator tidak valid
    }
}
