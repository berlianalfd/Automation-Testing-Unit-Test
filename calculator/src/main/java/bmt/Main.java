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

    String operator;
    while (true){
        System.out.print("Pilih operasi ( +, -, *, /): ");
        operator = scanner.nextLine();
        if (operator.matches("[+\\-*\\/]")){
            break;
        } else{
            System.out.println("Operasi tidak valid.");
        }

    }
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
