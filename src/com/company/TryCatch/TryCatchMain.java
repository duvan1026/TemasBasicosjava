package com.company.TryCatch;

public class TryCatchMain {

    public static void main(String[] args){

        try {
            int result = 5 / 5;
        } catch (ArithmeticException e) {// Se ejecuta si falla el try
            e.printStackTrace();// Imprime el reporte del fallo
        } finally{// Se ejecuta independientemente si falla o no
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");


    }
}
