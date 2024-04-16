package calculator;

import java.util.Scanner;

/**
 * Author: Berliana, Cintia, Yane
 * Date: 4 April 2024
 * Description: Program untuk melakukan operasi aritmatika sederhana.
 */

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Validation validator = new Validation();
    
        try {
            // Input angka pertama
            System.out.print("Masukkan angka pertama:  ");
            int angkaKeSatu = Integer.parseInt(scanner.nextLine());

            // Validasi angka pertama
            validator.Validasi(angkaKeSatu, '+', 0);
    
            // Input operator
            System.out.print("Masukkan operator (+, -, *, /):  ");
            char operator = scanner.nextLine().charAt(0); 

            // Validasi operator
            validator.Validasi(angkaKeSatu, operator, 1);

            // Input angka kedua
            System.out.print("Masukkan angka kedua:  ");
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
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
}