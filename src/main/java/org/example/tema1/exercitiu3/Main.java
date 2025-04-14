package org.example.tema1.exercitiu3;

public class Main {
    public static void main(String[] args) {
        Vehicul masina = new Masina("Merceds", "AClass", 2020, "Manual");
        Vehicul motocicleta = new Motocicleta("Yamato", "ModelA", 2022, "300HP");

        Vehicul[] vehicule = {masina, motocicleta};

        for (Vehicul v : vehicule) {
            System.out.println(v.descriere());
        }
    }
}
