package bmt;

/**
 *  Author : Berliana, Cintia, Yane
 *  Date   : 4 April 2024
 */

 public class CalculatorOperations {
    public static int calculator(int angkaKeSatu, int angkaKeDua, char operator) {
        int result = 0;
        switch (operator) {
            case '+': // Penjumlahan
                result = angkaKeSatu + angkaKeDua;
                break;
            case '-': // Pengurangan
                result = angkaKeSatu - angkaKeDua;
                break;
            case '*': // Perkalian
                result = angkaKeSatu * angkaKeDua;
                break;
            case '/': // Pembagian
                result = angkaKeSatu / angkaKeDua;
                break;
            default: // Operator tidak valid
                throw new IllegalArgumentException("Error: Operator tidak valid.");
        }
        return result;
    }
}