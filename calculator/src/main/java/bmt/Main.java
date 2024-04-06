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
    int operand1;
    while (true){
        System.out.print("Masukkan angka pertama: ");
        try {
            operand1 = Integer.parseInt(scanner.nextLine());
            break;
        } catch (NumberFormatException e){
            System.out.println("Masukkan harus berupa angka.");
        }
    }
    //Memvalidasi angka kedua
    int operand2;
    while (true){
        System.out.print("Masukkan angka kedua: ");
        try {
            operand2 = Integer.parseInt(scanner.nextLine());
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
                result = calculator.addition(operand1, operand2);
                break;
            case "-":
                result = calculator.subtract(operand1, operand2);
                break;
            case "*":
                result = calculator.multiply(operand1, operand2);
                break;
            case "/":
                if (operand2==0){
                    System.out.println("Error: Tidak dapat dibagi dengan 0.");
                    return;
                }
                result = calculator.divide(operand1, operand2);
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.println("Hasil: " + result);
    }
}
