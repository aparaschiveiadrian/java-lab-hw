package org.example.tema1.exercitiu3;

class Motocicleta extends Vehicul {
    private String clasaPutere;

    public Motocicleta(String marca, String model, int anFabricatie, String clasaPutere) {
        super(marca, model, anFabricatie);
        this.clasaPutere = clasaPutere;
    }

    @Override
    public String descriere() {
        return "Motocicleta: " + marca + " " + model + ", An fabricatie: " + anFabricatie + ", Clasa putere: " + clasaPutere;
    }
}
