package bmt;

/**
 * Author : Berliana, Cintia, Yane
 * Date   : 4 April 2024
 */

  public class Validation {
     private boolean isValidOperator = false;

     public void Validasi(int angkaKeSatu, char operator, int angkaKeDua) {
         // Jika operator sudah divalidasi
         if (isValidOperator) {
             // Validasi apakah kedua operan adalah angka
             if (!Character.isDigit(String.valueOf(angkaKeSatu).charAt(0)) || !Character.isDigit(String.valueOf(angkaKeDua).charAt(0))) {
                 throw new IllegalArgumentException("Nilai yang dihitung harus angka, tidak boleh karakter atau huruf");
             }
             // Validasi nilai angkaKeSatu
             else if (angkaKeSatu < -32768 || angkaKeSatu > 32767) {
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
         } else {
             // Validasi operator
             if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                 throw new IllegalArgumentException("Error: Operator yang diperbolehkan adalah +, -, *, dan /.");
             }
             isValidOperator = true; // Setel status validasi operator menjadi true setelah berhasil
         }
     }
 }

