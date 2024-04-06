package bmt;

import java.util.Scanner;

/**
 * Author : Berliana, Cintia, Yane
 * Date : 4 April 2024
 */

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Validation validation = new Validation();

        //Memvaldasi angka pertama
        int angkaKeSatu = validation.validationNumberInput(scanner, "Masukkan angka pertama: ");
        //Memvaldasi angka pertama
        int angkaKeDua = validation.validationNumberInput(scanner, "Masukkan angka kedua: ");
        //Memvalidasi operator
        String operator = validation.validateOperator(scanner);

        int result;
        switch (operator) {
            case "+":
                result = calculator.addition(angkaKeSatu, angkaKeDua);
                break;
            case "-":
                result = calculator.subtract(angkaKeSatu, angkaKeDua);
                break;
            case "*":
                result = calculator.multiply(angkaKeSatu, angkaKeDua);
                break;
            case "/":
                if (angkaKeDua==0){
                    System.out.println("Error: Tidak dapat dibagi dengan 0.");
                    return;
                }
                result = calculator.divide(angkaKeSatu, angkaKeDua);
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.println("Hasil: " + result);
    }

}
