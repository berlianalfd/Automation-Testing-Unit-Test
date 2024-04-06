package bmt;


/**
 *  Author : Berliana, Cintia, Yane
 *  Date   : 4 April 2024
 */

 public class Calculator {
    private final CalculatorOperations operations;
 
    public Calculator() {
        this.operations = new CalculatorOperations();
    }

    public int addition(int angkaKeSatu, int angkaKeDua){
        return operations.addition(angkaKeSatu, angkaKeDua);
    }
 
    public int subtract(int angkaKeSatu, int angkaKeDua) {
        return operations.subtract(angkaKeSatu, angkaKeDua);
    }
 
    public int multiply(int angkaKeSatu, int angkaKeDua) {
        return operations.multiply(angkaKeSatu, angkaKeDua);
    }
 
    public int divide(int pembilang, int penyebut) {
        return operations.divide(pembilang, penyebut);
    }
 }
 
