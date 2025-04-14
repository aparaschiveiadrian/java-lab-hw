package org.example.tema1.exercitiu3;

public abstract class Vehicul {
    String marca;
    String model;
    Integer anFabricatie;

    public Vehicul(String marca, String model, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public abstract String descriere();
}
