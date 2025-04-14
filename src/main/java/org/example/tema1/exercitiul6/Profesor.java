package org.example.tema1.exercitiul6;

public class Profesor {
    private String nume;
    private String specializare;
    private final String codIdentificare;

    public Profesor(String nume, String specializare, String codIdentificare) {
        this.nume = nume;
        this.specializare = specializare;
        this.codIdentificare = codIdentificare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Profesor{nume='" + nume + "', specializare='" + specializare + "', codIdentificare=" + codIdentificare + "}";
    }
}
