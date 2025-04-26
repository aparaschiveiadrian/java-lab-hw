package org.example.tema2.exercitiul8;

public class ContUtilizator {
    private String nume;
    private NivelAcces nivelAcces;

    public ContUtilizator(String nume, NivelAcces nivelAcces) {
        this.nume = nume;
        this.nivelAcces = nivelAcces;
    }

    public String getNume() {
        return nume;
    }

    public NivelAcces getNivelAcces() {
        return nivelAcces;
    }

    @Override
    public String toString() {
        return "ContUtilizator{" +
                "nume='" + nume + '\'' +
                ", nivelAcces=" + nivelAcces +
                '}';
    }
}
