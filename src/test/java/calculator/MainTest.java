package calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class MainTest {
    
    // test untuk angka pertama, operator dan angka kedua yang valid
    @Test
    public void testNilaiDanOperatorValid() {
        int angkaKeSatu = 5;
        char operator = '+';
        int angkaKeDua = 3;
        int expected = 8;
        int actual = CalculatorOperations.calculator(angkaKeSatu, angkaKeDua, operator);

        String expectedResult = String.format("Masukkan angka pertama: %d\n" +
                                      "Masukkan operator (+, -, *, /): %c\n" +
                                      "Masukkan angka kedua: %d\n" +
                                      "HASIL = %d", angkaKeSatu, operator, angkaKeDua, expected);
        String actualResult = String.format("Masukkan angka pertama: %d\n" +
                                      "Masukkan operator (+, -, *, /): %c\n" +
                                      "Masukkan angka kedua: %d\n" +
                                      "HASIL = %d", angkaKeSatu, operator, angkaKeDua, actual);
        assertEquals(expectedResult, actualResult);
    }

    // test untuk angka pertama bukan merupakan nilai numerik
    @Test
    public void testAngkaPertamaBukanNilaiNumerik() {
        Validation validator = new Validation();
        String angkaKeSatu = "abc";
        
        try {
            validator.ValidasiInput(angkaKeSatu);
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
            assertEquals("Error: Nilai tidak boleh karakter atau huruf", e.getMessage());
        }
    }

    
    // test untuk angka yang diinptkan merupakan nilai desimal(float)
    @Test
    public void testAngkaBerupaNilaiDesimal() {
        Validation validator = new Validation();
        String angkaKeSatu = "9.9";
        
        try {
            validator.ValidasiInput(angkaKeSatu);
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
            assertEquals("Error: Tidak dapat menerima inputan berupa angka desimal (float).", e.getMessage());
        }
    }

    // test untuk angka pertama yang nilainya lebih dari range
    @Test
    public void testAngkaPertamaLebihDariRange() {
        Validation validator = new Validation();
        int angkaKeSatu = 48976;
        char operator = '+';
        int angkaKeDua = 3;
        
        try {
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Error: Angka harus berada dalam range -32768 hingga 32767.", e.getMessage());
        }
    }

    // test untuk angka pertama yang nilainya kurang dari range
    @Test
    public void testAngkaPertamaKurangDariRange() {
        Validation validator = new Validation();
        int angkaKeSatu = -48976;
        char operator = '+';
        int angkaKeDua = 3;
        
        try {
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Error: Angka harus berada dalam range -32768 hingga 32767.", e.getMessage());
        }
    }

    // test untuk operator selain operator +, -, *, atau / (tidak valid)
    @Test
    public void testOperatorInvalid() {
        Validation validator = new Validation();
        int angkaKeSatu = 5;
        char operator = 'x'; 
        int angkaKeDua = 3;
        try {
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Error: Operator yang diperbolehkan adalah +, -, *, dan /.", e.getMessage());
        }
    }

    // test untuk angka kedua bukan merupakan nilai numerik
    @Test
    public void testAngkaKeduaBukanNilaiNumerik() {
        Validation validator = new Validation();
        String angkaKeDua = "xyz";
         
        try {
            validator.ValidasiInput(angkaKeDua);
            fail("Expected NumberFormatException to be thrown");
        } catch (NumberFormatException e) {
            assertEquals("Error: Nilai tidak boleh karakter atau huruf", e.getMessage());
        }
    }

    // test untuk angka kedua yang nilainya lebih dari range
    @Test
    public void testAngkaKeduaLebihDariRange() {
        Validation validator = new Validation();
        int angkaKeSatu = 5;
        char operator = '+';
        int angkaKeDua = 39876;
         
        try {
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Error: Angka harus berada dalam range -32768 hingga 32767.", e.getMessage());
        }
    }
 
    // test untuk angka kedua yang nilainya kurang dari range
    @Test
    public void testAngkaKeduaKurangDariRange() {
        Validation validator = new Validation();
        int angkaKeSatu = 5;
        char operator = '+';
        int angkaKeDua = -39876;
         
        try {
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Error: Angka harus berada dalam range -32768 hingga 32767.", e.getMessage());
        }
    }

    // test untuk pembagian dengan NOL
    @Test
    public void testPembagianNol() {
        Validation validator = new Validation();
        int angkaKeSatu = 5;
        char operator = '/';
        int angkaKeDua = 0;
        try {
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Error: Tidak dapat dibagi dengan 0.", e.getMessage());
        }
    }
}
