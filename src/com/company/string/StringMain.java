package com.company.string;

public class StringMain {

    public static void main(String[]  args){

        // la clase string

        String mensaje = " Hola mundo ";

        System.out.println(mensaje.length()); // devuelve el tamaño del string

        String mensajeMAY = mensaje.toUpperCase();// Convierte el string en mayusculas
        System.out.println(mensajeMAY);

        System.out.println(mensajeMAY.trim());// trim() elimina los espacios que tiene en la parte inicial y final
        mensajeMAY = mensajeMAY.trim();

        String otro = "HOLA MUNDO";

        if(mensajeMAY.equals(otro)){// equals() comprueba si el texto igual a otro, teniendo encuenta si tienen las mismas monusculas o mayusculas
            System.out.println("verdadero!!");
        }

        if(mensajeMAY.equalsIgnoreCase(otro)){// equals() comprueba si el texto igual a otro sin importar si es mayuscula o miniscula
            System.out.println("verdadero");
        }
    }
}
