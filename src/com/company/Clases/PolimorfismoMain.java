package com.company.Clases;

import com.company.Clases.Coche;
import com.company.Clases.CocheElectrico;
import com.company.Clases.CocheHibrido;

public class PolimorfismoMain{

    public static void main(String[] args){

        //Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        // polimorfismo

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        if(coche4 instanceof Coche){// Comprobamos si ese objeto es igual al objeto cocheelectrico
            System.out.println("Coche");
        }

        if(coche4 instanceof CocheElectrico){// Comprobamos si ese objeto es igual al objeto cocheelectrico
            System.out.println("Coche electrico");
        }

        if(coche4 instanceof CocheHibrido){
            System.out.println("Coche Hibrido");
        }

    }
}
