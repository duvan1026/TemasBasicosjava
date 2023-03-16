package com.company.List;

import com.company.Clases.Coche;
import com.company.Clases.CocheElectrico;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args){

        List<String> nombres = new ArrayList<>();// creamos una lista dinamica de elementos


        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");


        System.out.println(nombres);

        for( String item: nombres){
            System.out.println(item);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add( new CocheElectrico("civic") );
        coches.add( new CocheElectrico("romeo") );
        coches.add( new CocheElectrico("ford") );

        System.out.println(coches);




    }

}
