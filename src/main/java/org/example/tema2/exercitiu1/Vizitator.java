package org.example.tema2.exercitiu1;

import org.example.tema2.exercitiu1.markerInterfaces.PoateVizualiza;

public class Vizitator extends Utilizator implements PoateVizualiza {
    public Vizitator(String firstName, String lastName) {
        super(firstName, lastName);
    }
}