package org.example.tema1.exercitiu3;

class Masina extends Vehicul {
    private String tipTransmisie;

    public Masina(String marca, String model, int anFabricatie, String tipTransmisie) {
        super(marca, model, anFabricatie);
        this.tipTransmisie = tipTransmisie;
    }

    @Override
    public String descriere() {
        return "Masina: " + marca + " " + model + ", An fabricatie: " + anFabricatie + ", Tip transmisie: " + tipTransmisie;
    }
}