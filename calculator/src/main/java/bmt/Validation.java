package bmt;

/**
 * Author : Berliana, Cintia, Yane
 * Date   : 4 April 2024
 */

 public class Validation {
    public void Validasi(int angkaKeSatu, char operator, int angkaKeDua) {
        // Validasi nilai angkaKeSatu
        if (angkaKeSatu < -32768 || angkaKeSatu > 32767) {
            throw new IllegalArgumentException("Error: Angka harus berada dalam range -32,768 hingga 32,767.");
        }
        // Validasi nilai angkaKeDua
        else if (angkaKeDua < -32768 || angkaKeDua > 32767) {
            throw new IllegalArgumentException("Error: Angka harus berada dalam range -32,768 hingga 32,767.");
        }
        // Validasi pembagian dengan pembagi tidak boleh nol
        else if (operator == '/' && angkaKeDua == 0) {
            throw new IllegalArgumentException("Error: Tidak dapat dibagi dengan 0.");
        } 
        // Validasi operator
        else if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new IllegalArgumentException("Error: Operator yang diperbolehkan adalah +, -, *, dan /.");
        }
    }    
}
