package org.example.tema2.exercitiu1;

import org.example.tema2.exercitiu1.markerInterfaces.PoateEdita;
import org.example.tema2.exercitiu1.markerInterfaces.PoateVizualiza;

public class Editor extends Utilizator implements PoateVizualiza, PoateEdita {
    public Editor(String firstName, String lastName) {
        super(firstName, lastName);
    }
}