package bmt;

import java.util.Scanner;

/**
 * Author : Berliana, Cintia, Yane
 * Date : 4 April 2024
 */

// public class Main {
// public static void main(String[] args) {
// @SuppressWarnings("resource")
// Scanner scanner = new Scanner(System.in);
// System.out.print("Masuukan kalimat = ");
// String kalimat = scanner.nextLine();
// System.out.println(kalimat);
// }
// }

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Masukkan angka pertama: ");
        int operand1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int operand2 = scanner.nextInt();

        System.out.print("Pilih operasi ( -, *, /): ");
        String operator = scanner.next();

        int result;
        switch (operator) {
            case "-":
                result = calculator.subtract(operand1, operand2);
                break;
            case "*":
                result = calculator.multiply(operand1, operand2);
                break;
            case "/":
                result = calculator.divide(operand1, operand2);
                break;
            default:
                System.out.println("Operasi tidak valid");
                return;
        }

        System.out.println("Hasil: " + result);
    }
}
