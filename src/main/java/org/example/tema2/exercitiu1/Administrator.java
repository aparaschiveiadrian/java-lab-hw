package org.example.tema2.exercitiu1;

import org.example.tema2.exercitiu1.markerInterfaces.PoateEdita;
import org.example.tema2.exercitiu1.markerInterfaces.PoateSterge;
import org.example.tema2.exercitiu1.markerInterfaces.PoateVizualiza;

public class Administrator extends Utilizator implements PoateVizualiza, PoateEdita, PoateSterge {
    public Administrator(String firstName, String lastName){
        super(firstName, lastName);
    }
}
