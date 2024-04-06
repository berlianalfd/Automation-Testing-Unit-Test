package bmt;


/**
 *  Author : Berliana, Cintia, Yane
 *  Date   : 4 April 2024
 */

public class CalculatorOperations {
    // operasi penjumlahan
    public int addition(int angkaKeSatu, int angkaKeDua){
        return angkaKeSatu + angkaKeDua;
    }
    
    // operasi pengurangan
    public int subtract(int angkaKeSatu, int angkaKeDua) {
        return angkaKeSatu - angkaKeDua;
    }

    // operasi perkalian
    public int multiply(int angkaKeSatu, int angkaKeDua) {
        return angkaKeSatu * angkaKeDua;
    }

    // operasi pembagian
    public int divide(int pembilang, int penyebut) {
        if (penyebut == 0) {
            throw new IllegalArgumentException("Error: Penyebut tidak boleh nol");
        }
        return pembilang / penyebut;
    }
}

