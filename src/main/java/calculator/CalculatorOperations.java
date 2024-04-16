package calculator;

/**
 *  Author : Berliana, Cintia, Yane
 *  Date   : 4 April 2024
 */

public class CalculatorOperations {
    public static int calculator(int angkaKeSatu, int angkaKeDua, char operator) {
        int result = 0;
        switch (operator) {
            case '+': 
                // Operasi untuk penjumlahan
                result = angkaKeSatu + angkaKeDua;
                break;
            case '-': 
                // Operasi untuk pengurangan
                result = angkaKeSatu - angkaKeDua;
                break;
            case '*': 
                // Operasi untuk perkalian
                result = angkaKeSatu * angkaKeDua;
                break;
            case '/': 
                // Operasi untuk pembagian
                result = angkaKeSatu / angkaKeDua;
                break;
        }
        return result;
    }
}