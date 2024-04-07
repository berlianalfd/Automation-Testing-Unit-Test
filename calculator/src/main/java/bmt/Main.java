package bmt;

import java.util.Scanner;

/**
 * Author : Berliana, Cintia, Yane
 * Date : 4 April 2024
 */

public class Main {
    public static void main(String[] args) {
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

            System.out.println("Masukkan angka kedua:");
            int angkaKeDua = Integer.parseInt(scanner.nextLine());
    
            // Validasi angka kedua
            validator.Validasi(angkaKeSatu, operator, angkaKeDua);
    
            int result = CalculatorOperations.calculator(angkaKeSatu, angkaKeDua, operator);
            System.out.println("Hasil: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Nilai tidak boleh karakter atau huruf");
            System.exit(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            // System.exit(0);
        }
    
        scanner.close();
    }
}
