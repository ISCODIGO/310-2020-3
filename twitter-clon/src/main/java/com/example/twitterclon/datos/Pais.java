package com.example.twitterclon.datos;

import java.util.ArrayList;

public class Pais {
    private String codigo;  // alpha 2. Ej: HN - Honduras
    private String nombre;

    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public ArrayList<Pais> getListaPaises() {
        ArrayList<Pais> paises = new ArrayList<>();
        paises.add(
                new Pais("HN", "Honduras")
        );
        return paises;
    }
}
