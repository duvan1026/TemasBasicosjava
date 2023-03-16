package com.company.Interfaces;

import com.company.Clases.Coche;

/**
 * Es un mecanismo de abstracción que nos permite desacoplar el codigo.
 * Haciendo el codigo mas flexible
 */
public interface CocheService {

    public Coche crearCocheDemo(); // se asigna o declara el metodo

    public void destruirCcohe(Coche coche);

}
