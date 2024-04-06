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

<<<<<<< HEAD
        //Memvaldasi angka pertama
        int angkaKeSatu = validation.validationNumberInput(scanner, "Masukkan angka pertama: ");
        //Memvaldasi angka pertama
        int angkaKeDua = validation.validationNumberInput(scanner, "Masukkan angka kedua: ");
        //Memvalidasi operator
        String operator = validation.validateOperator(scanner);
=======
    //Memvalidasi angka pertama
    int angkaKeSatu;
    while (true){
        System.out.print("Masukkan angka pertama: ");
        try {
            angkaKeSatu = Integer.parseInt(scanner.nextLine());
            break;
        } catch (NumberFormatException e){
            System.out.println("Masukkan harus berupa angka.");
        }
    }
    //Memvalidasi angka kedua
    int angkaKeDua;
    while (true){
        System.out.print("Masukkan angka kedua: ");
        try {
            angkaKeDua = Integer.parseInt(scanner.nextLine());
            break;
        } catch (NumberFormatException e){
            System.out.println("Masukkan harus berupa angka.");
        }
    }
>>>>>>> db945626197bd47a9bb08f3f79072c6865771d68

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
