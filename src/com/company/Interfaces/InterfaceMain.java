package com.company.Interfaces;

import com.company.Clases.Coche;

public class InterfaceMain {

    public static void main(String[] args){


        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        Coche coche1 = service1.crearCocheDemo();

        Coche coche2 = service2.crearCocheDemo();

    }
}
