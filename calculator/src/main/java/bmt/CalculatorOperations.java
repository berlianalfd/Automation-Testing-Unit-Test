package bmt;


/**
 *  Author : Berliana, Cintia, Yane
 *  Date   : 4 April 2024
 */

public class CalculatorOperations {
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error: Pembagi tidak boleh nol");
        }
        return a / b;
    }
}

