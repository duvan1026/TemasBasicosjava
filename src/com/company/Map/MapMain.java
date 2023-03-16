package com.company.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args){

        Map<String, String> personas = new HashMap<>();

        /***********--Clave----, ---Nombre-------**+*/
        personas.put("1234322H", "Nompre Apellido 1");
        personas.put("1234322L", "Nompre Apellido 2");
        personas.put("1234322P", "Nompre Apellido 3");

        System.out.println(personas);

        for(String key : personas.keySet()){ // Nos permite iterar sobre las claves
            System.out.println(key);
        }

        for(String value : personas.values()){ // Nos permite iterar sobre los nombres
            System.out.println(value);
        }

        /**
         * recorre el map y obtiene los valores de la key y el value
         */
        for(Map.Entry<String, String> pair: personas.entrySet()){
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }


    }
}
