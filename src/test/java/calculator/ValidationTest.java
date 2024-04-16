package calculator;

import org.junit.Test;

/**
 * Unit test for Validation
 */

public class ValidationTest {

    // Test validasi untuk inputan nilai bukan merupakan numerik
    @Test(expected = NumberFormatException.class)
        public void testValidasiInputNonNumerik() {
            Validation validation = new Validation();

            // Input nilai bukan merupakan numerik
            validation.ValidasiInput("k"); 
        }
    
    // Test validasi untuk inputan nilai melebihi range
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiInputOverOfRange() {
        Validation validation = new Validation();

        // Input nilai melebihi range
        validation.Validasi(40000, '+', 1000); 
    }

    // Test validasi untuk inputan nilai kurang dari range
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiInputLessOfRange() {
        Validation validation = new Validation();
       
        // Input nilai kurang dari range
        validation.Validasi(-40000, '-', 1000); 
    }
    
    // Test validasi untuk pembagian dengan nol
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiDivisionByZero(){
        Validation validation = new Validation();

        // Input pembagian dengan nol
        validation.Validasi(10, '/', 0); 
    }
    
    // Test validasi untuk inputan operator yang tidak valid
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiOperatorTidakValid() {
        Validation validation = new Validation();

        // Input operator yang tidak valid
        validation.Validasi(5, '&', 3); 
    }
}