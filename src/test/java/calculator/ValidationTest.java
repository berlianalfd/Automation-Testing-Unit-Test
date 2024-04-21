package calculator;
import static org.junit.Assert.fail;
import org.junit.Test;

public class ValidationTest {

    //VALIDASI

    //(TC-3-1)-Memeriksa masukkan Operand pertama diluar range -32768 hingga 32767 (nilai masukkan kurang dari -32768)
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiOperand1LessOfRange() {
        Validation validation = new Validation();
       
        // Input nilai kurang dari range
        validation.Validasi(-40000, '-', 1000); 
    }
    
    //(TC-3-2)-Memeriksa masukkan Operand pertama diluar range -32768 hingga 32767 (nilai masukkan lebih dari 32768)
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiOperand1OverOfRange() {
        Validation validation = new Validation();

        // Input nilai melebihi range
        validation.Validasi(40000, '+', 1000); 
    }
    
    //(TC-3-3)-Memeriksa masukkan Operand kedua diluar range -32768 hingga 32767 (nilai masukkan kurang dari -32768)
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiOperand2LessOfRange() {
        Validation validation = new Validation();
       
        // Input nilai kurang dari range
        validation.Validasi(-40000, '-', 1000); 
    }
    
    //(TC-3-4)-Memeriksa masukkan Operand kedua diluar range -32768 hingga 32767 (nilai masukkan lebih dari 32768)
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiOperand2OverOfRange() {
        Validation validation = new Validation();

        // Input nilai melebihi range
        validation.Validasi(40000, '+', 1000); 
    }

    //(TC-3-5)-Memeriksa nilai penyebut/ operand kedua pada operasi pembagian, jika bernilai 0
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiDivisionByZero(){
        Validation validation = new Validation();

        // Input pembagian dengan nol
        validation.Validasi(10, '/', 0); 
    }

    //(TC-3-6)-Memeriksa operator jika yang diinputkan selain yang diperbolehkan, yaitu berupa angka 1
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiInputOperatorAngka() {
        Validation validation = new Validation();

        // Input operator yang tidak valid
        validation.Validasi(5, '1', 3); 
    }

    //(TC-3-7)-Memeriksa operator jika yang diinputkan selain yang diperbolehkan, yaitu berupa karakter #
    @Test(expected = IllegalArgumentException.class)
    public void testValidasiInputOperatorKarakterTidakValid() {
        Validation validation = new Validation();

        // Input operator yang tidak valid
        validation.Validasi(5, '#', 3); 
    }

    //VALIDASIINPUT

    //(TC-4-1)-Mengkonversi nilai inputan string menjadi integer supaya input numerik valid 
    //untuk inputan bernilai bilangan bulat negatif (inputan angka pertama )
    @Test
    public void testConvertNegativeIntegerInput1() {
        Validation validation = new Validation();

        // Input string representing a negative integer
        String input = "-4";
        
        // Expect no exception thrown, as the input is valid
        try {
            validation.ValidasiInput(input);
        } catch (NumberFormatException e) {
            // If an exception is thrown, fail the test
            fail("Exception thrown: " + e.getMessage());
        }
    }

    //(TC-4-1)-Mengkonversi nilai inputan string menjadi integer supaya input numerik valid 
    //untuk inputan bernilai bilangan bulat negatif (inputan angka kedua )
    @Test
    public void testConvertNegativeIntegerInput2() {
        Validation validation = new Validation();

        // Input string representing a negative integer
        String input = "-9";
        
        // Expect no exception thrown, as the input is valid
        try {
            validation.ValidasiInput(input);
        } catch (NumberFormatException e) {
            // If an exception is thrown, fail the test
            fail("Exception thrown: " + e.getMessage());
        }
    }


    //(TC-4-3)-Memeriksa masukkan operand jika yang dimasukkan berupa non-numerik, yaitu berupa karakter ($)
    @Test(expected = NumberFormatException.class)
        public void testValidasiInputNonNumerik1() {
            Validation validation = new Validation();

            // Input nilai bukan merupakan numerik
            validation.ValidasiInput("$"); 
        }
    
    //(TC-4-4)-Memeriksa masukkan operand jika yang dimasukkan berupa non-numerik, yaitu berupa karakter (A)
    @Test(expected = NumberFormatException.class)
        public void testValidasiInputNonNumerik2() {
            Validation validation = new Validation();

            // Input nilai bukan merupakan numerik
            validation.ValidasiInput("A"); 
        }

    //(TC-4-5)-Memeriksa masukkan operand jika yang dimasukkan berupa non-numerik, yaitu berupa karakter (a)
    @Test(expected = NumberFormatException.class)
        public void testValidasiInputNonNumerik3() {
            Validation validation = new Validation();

            // Input nilai bukan merupakan numerik
            validation.ValidasiInput("a"); 
        }

    //(TC-4-6)-Memeriksa masukkan operand jika yang dimasukkan berupa non-numerik, yaitu berupa karakter (9!)
    @Test(expected = NumberFormatException.class)
        public void testValidasiInputNonNumerik4() {
            Validation validation = new Validation();

            // Input nilai bukan merupakan numerik
            validation.ValidasiInput("9!"); 
        }

    //(TC-4-7)-Memeriksa masukkan operand jika yang dimasukkan berupa non-numerik, yaitu berupa karakter (9B)
    @Test(expected = NumberFormatException.class)
        public void testValidasiInputNonNumerik5() {
            Validation validation = new Validation();

            // Input nilai bukan merupakan numerik
            validation.ValidasiInput("9B"); 
        }

    //(TC-4-8)-Memeriksa masukkan operand jika yang dimasukkan berupa non-numerik, yaitu berupa karakter (9b)
    @Test(expected = NumberFormatException.class)
        public void testValidasiInputNonNumerik6() {
            Validation validation = new Validation();

            // Input nilai bukan merupakan numerik
            validation.ValidasiInput("9b"); 
        }
}