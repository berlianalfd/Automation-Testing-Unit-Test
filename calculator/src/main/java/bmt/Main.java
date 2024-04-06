package bmt;

import java.util.Scanner;

/**
 * Author : Berliana, Cintia, Yane
 * Date : 4 April 2024
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {
            System.out.println("Masukkan angka pertama:");
            int angkaKeSatu = Integer.parseInt(scanner.nextLine());
    
            System.out.println("Masukkan operator (+, -, *, /):");
            char operator = scanner.nextLine().charAt(0); // Menggunakan nextLine() untuk membaca operator
    
            System.out.println("Masukkan angka kedua:");
            int angkaKeDua = Integer.parseInt(scanner.nextLine());
    
            Validation validator = new Validation();
            validator.Validasi(angkaKeSatu, angkaKeDua, operator);
    
            int result = CalculatorOperations.calculator(angkaKeSatu, angkaKeDua, operator);
            System.out.println("Hasil: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Nilai yang dihitung harus angka, tidak boleh karakter");
            // Program berhenti setelah menangkap pengecualian
            System.exit(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            // Program berhenti setelah menangkap pengecualian
            System.exit(0);
        }
    
        scanner.close();
    }
    

}    