package bmt;

/**
 *  Author : Berliana, Cintia, Yane
 *  Date   : 4 April 2024
 */

public class CalculatorOperations {
    public static int calculator(int angkaKeSatu, int angkaKeDua, char operator) {
        int result = 0;
        switch (operator) {
            case '+' :
                result = angkaKeSatu + angkaKeDua;
                break;
            case '-':
                result = angkaKeSatu - angkaKeDua;
                break;
            case '*':
                result = angkaKeSatu * angkaKeDua;
                break;
            case '/':
                result = angkaKeSatu / angkaKeDua;
                break;
            default:
                throw new IllegalArgumentException("Error: Operator tidak valid.");
        }
        return result;
    }
}

