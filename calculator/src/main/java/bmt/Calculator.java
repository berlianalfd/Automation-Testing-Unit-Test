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
 
     public int subtract(int a, int b) {
         return operations.subtract(a, b);
     }
 
     public int multiply(int a, int b) {
         return operations.multiply(a, b);
     }
 
     public int divide(int a, int b) {
         return operations.divide(a, b);
     }
 }
 
