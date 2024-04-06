package bmt;

import java.util.Scanner;

/**
 *  Author : Berliana, Cintia, Yane
 *  Date   : 4 April 2024
 */

public class Validation {
    public int validationNumberInput(Scanner scanner, String message){
        while (true){
            System.out.print(message);
            String input = scanner.nextLine();
            try{
                int number = Integer.parseInt(input);
                if (number < -32768 || number >32767){
                    System.out.println("Error : Angka diluar range -32,768 hingga 32,767.");
                    continue;
                }
                return number;
            }catch (NumberFormatException e){
                System.out.println("Error: Masukkan harus berupa angka.");
            }

        }
    }

    public String validateOperator(Scanner scanner){
        while (true){
            System.out.print("Pilih operasi (+, -, *, /): ");
            String operator = scanner.nextLine();
            if(operator.matches("[+\\-*\\/]")) {
                // if (operator.equals("/")){
                //     System.out.print("Masukkan angka kedua: ");
                //     int angkaKeDua = Integer.parseInt(scanner.nextLine());
                //     if (angkaKeDua == 0){
                //         System.out.println("Error: Tidak dapat dibagi dengan 0.");
                //         continue;
                //     }
                // }
                return operator;
            }else{
                System.out.println("Error: Operasi tidak valid.");
            }
        }
    }
}
