package com.company.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// leemos de la terminal
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine(); // Lee string
        int numero = scanner.nextInt();// Lee numeros

        System.out.println("El numero introducido es " + numero);
        System.out.println("El nombre introduccido es " + nombre);

        System.out.println("Hola mundo");

    }
}
