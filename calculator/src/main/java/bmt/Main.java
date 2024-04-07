package bmt;

import java.util.Scanner;

/**
 * Author: Berliana, Cintia, Yane
 * Date: 4 April 2024
 * Description: Program untuk melakukan operasi aritmatika sederhana.
 */

//  public class Main {
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner scanner = new Scanner(System.in);
//         Validation validator = new Validation();
    
//         try {
//             System.out.println("Masukkan angka pertama:");
//             int angkaKeSatu = Integer.parseInt(scanner.nextLine());

//             // Validasi angka pertama
//             validator.Validasi(angkaKeSatu, '+', 0);
    
//             System.out.println("Masukkan operator (+, -, *, /):");
//             char operator = scanner.nextLine().charAt(0); 

//             // Validasi operator
//             validator.Validasi(angkaKeSatu, operator, 1);

//             // Input angka kedua
//             System.out.println("Masukkan angka kedua: ");
//             int angkaKeDua = Integer.parseInt(scanner.nextLine());
    
//             // Validasi angka kedua
//             validator.Validasi(angkaKeSatu, operator, angkaKeDua);
    
//             // Hitung dan tampilkan hasil
//             int result = CalculatorOperations.calculator(angkaKeSatu, angkaKeDua, operator);
//             System.out.println("HASIL: " + result);
//         } catch (NumberFormatException e) {
//             System.out.println("Nilai tidak boleh karakter atau huruf");
//             System.exit(0);
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//             // System.exit(0);
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Validation validator = new Validation();
    
        try {
            System.out.println("Masukkan angka pertama:");
            int angkaKeSatu = Integer.parseInt(scanner.nextLine());

            // Validasi angka pertama
            validator.Validasi(angkaKeSatu, '+', 0);
    
            System.out.println("Masukkan operator (+, -, *, /):");
            char operator = scanner.nextLine().charAt(0); 

            // Validasi operator
            validator.Validasi(angkaKeSatu, operator, 1);

            // Input angka kedua
            System.out.println("Masukkan angka kedua: ");
            int angkaKeDua = Integer.parseInt(scanner.nextLine());
    
            // Validasi angka kedua
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
    
            // Hitung dan tampilkan hasil
            int result = CalculatorOperations.calculator(angkaKeSatu, angkaKeDua, operator);
            System.out.println("HASIL: " + result);
        } catch (NumberFormatException e) {
            // Panggil ValidasiInput untuk menampilkan pesan kesalahan
            try {
                validator.ValidasiInput(e.getMessage());
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        System.exit(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            // System.exit(0);
        }
    }
    
}