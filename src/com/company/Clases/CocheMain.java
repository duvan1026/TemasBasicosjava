package com.company.Clases;

import com.company.Clases.Coche;
import com.company.Clases.CocheElectrico;
import com.company.Clases.CocheHibrido;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo";
        Coche cocheObj = new CocheHibrido();

        Coche cocheObj2 = new CocheElectrico("rojo", "Honda", "civic", 1430.45, 5.4, "motor"); // instancia d euna clase o crea un nuevo objeto.

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);


        CocheElectrico cocheElectrico = new CocheElectrico();


        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul","alfa","romeo",1500d,4.99,"TXZ");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

    }
}




