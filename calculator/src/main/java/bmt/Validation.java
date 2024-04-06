package bmt;

/**
 * Author : Berliana, Cintia, Yane
 * Date   : 4 April 2024
 */

public class Validation {
    public void Validasi(int angkaKeSatu, int angkaKeDua, char operator) {
        // Validasi apakah kedua operan adalah angka
        if (!Character.isDigit(String.valueOf(angkaKeSatu).charAt(0)) || !Character.isDigit(String.valueOf(angkaKeDua).charAt(0))) {
            throw new IllegalArgumentException("Nilai yang dihitung harus angka, tidak boleh karakter");
        }
        // Validasi nilai angkaKeSatu
        else if (angkaKeSatu < -32768 || angkaKeSatu > 32767) {
            throw new IllegalArgumentException("Error: Angka pertama harus berada dalam range -32,768 hingga 32,767.");
        }
        // Validasi nilai angkaKeDua
        else if (angkaKeDua < -32768 || angkaKeDua > 32767) {
            throw new IllegalArgumentException("Error: Angka kedua harus berada dalam range -32,768 hingga 32,767.");
        }
        // Validasi operator
        else if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            throw new IllegalArgumentException("Error: Operator yang diperbolehkan adalah +, -, *, dan /.");
        }
        // Validasi pembagian dengan pembagi tidak boleh nol
        else if (operator == '/' && angkaKeDua == 0) {
            throw new IllegalArgumentException("Error: Tidak dapat melakukan pembagian dengan pembagi nol.");
        }
    }
}
