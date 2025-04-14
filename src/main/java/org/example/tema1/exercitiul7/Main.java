package org.example.tema1.exercitiul7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Caine();
        Animal a2 = new Pisica();
        Animal a3 = new Caine();
        Animal a4 = new Caine();
        Animal a5 = new Pisica();
        Animal a6 = new Caine();

        List<Animal> animale = new ArrayList<>(List.of(a1,a2,a3,a4,a5,a6));

        for (Animal a : animale) {
            a.sunet();

            if (a instanceof Caine) {
                Caine caine = (Caine) a;
                caine.latra();
            } else if (a instanceof Pisica) {
                Pisica pisica = (Pisica) a;
                pisica.toarce();
            }
        }
    }
}
