package com.company.Interfaces;

import com.company.Clases.Coche;
import com.company.Clases.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCcohe(Coche coche) {

    }

}
