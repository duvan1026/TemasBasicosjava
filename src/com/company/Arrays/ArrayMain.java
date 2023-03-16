package com.company.Arrays;

public class ArrayMain {

    public static void main(String[] args){

        //int[] notas = new int[10]; // indicamos que creamos un array que contiene 10 posiciones
        int[] notas = {8,10,5,9,8,7,5,6}; // asigamos los valores para crearlos

        //notas[0] = 8;
        //notas[1] = 9;

        //System.out.println(notas[0]);// 8

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }

        for( int item: notas ){
            System.out.println(item);
        }

       //notas.binarySearch(notas,9); // devuelve la posicion en la cual se encuentra ese elemento "9"
        //notas.sort(notas); //ordena el contenido del array

        //equals(array1,array2); // compara los dos arrays si son iguales, retornando true o false

    }
}
