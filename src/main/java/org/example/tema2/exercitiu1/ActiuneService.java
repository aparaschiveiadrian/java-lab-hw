package org.example.tema2.exercitiu1;

import org.example.tema2.exercitiu1.markerInterfaces.PoateEdita;
import org.example.tema2.exercitiu1.markerInterfaces.PoateSterge;
import org.example.tema2.exercitiu1.markerInterfaces.PoateVizualiza;

public class ActiuneService {

    private static ActiuneService instance;

    private ActiuneService() {}

    public static ActiuneService getInstance() {
        if (instance == null) {
            instance = new ActiuneService();
        }
        return instance;
    }

    public void afiseazaPermisiuni(Utilizator utilizator) {
        System.out.println("Sunt permise pentru: " + utilizator.getFirstName() + " " + utilizator.getLastName() + " urmatoarele:");

        if (utilizator instanceof PoateVizualiza) {
            System.out.println("Vizualizare.");
        }
        if (utilizator instanceof PoateEdita) {
            System.out.println("Editare.");
        }
        if (utilizator instanceof PoateSterge) {
            System.out.println("Stergere.");
        }
        System.out.println();
    }
}
