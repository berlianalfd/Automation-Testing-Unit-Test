package bmt;

import java.util.Scanner;

/**
 * Author: Berliana, Cintia, Yane
 * Date: 4 April 2024
 * Description: Program untuk melakukan operasi aritmatika sederhana.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Input angka pertama
            System.out.print("Masukkan angka pertama: ");
            int firstNumber = Integer.parseInt(scanner.nextLine());
            
            // Input operator
            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0); 

            Validation validator = new Validation();
            validator.Validasi(firstNumber, operator, 0);

            // Input angka kedua
            System.out.print("Masukkan angka kedua: ");
            int secondNumber = Integer.parseInt(scanner.nextLine());
    
            validator.Validasi(firstNumber, operator, secondNumber);
    
            // Hitung dan tampilkan hasil
            int result = CalculatorOperations.calculator(firstNumber, secondNumber, operator);
            System.out.println("HASIL: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Nilai yang dihitung harus angka, tidak boleh karakter atau huruf");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
