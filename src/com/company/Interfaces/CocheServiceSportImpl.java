package com.company.Interfaces;

import com.company.Clases.Coche;
import com.company.Clases.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void destruirCcohe(Coche coche) {
        System.out.println("destruyendo coche de carreras");

    }
}
