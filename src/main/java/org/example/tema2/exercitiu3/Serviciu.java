package org.example.tema2.exercitiu3;

import org.example.tema2.exercitiu3.exceptions.DateInvalideException;
import org.example.tema2.exercitiu3.exceptions.LocIndisponibilException;
import org.example.tema2.exercitiu3.exceptions.RezervareException;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Serviciu {

    private static Serviciu instance;

    private Serviciu() {}

    public static Serviciu getInstance() {
        if (instance == null) {
            instance = new Serviciu();
        }
        return instance;
    }

    private Set<Integer> locuriRezervate = new HashSet<>();

    public void rezervaLoc(LocalDate data, int loc) throws RezervareException {
        if (data == null || data.isBefore(LocalDate.now())) {
            throw new DateInvalideException("Data este invalida.");
        }

        if (locuriRezervate.contains(loc)) {
            throw new LocIndisponibilException("Locul " + loc + " este deja printre rezervari, va rog sa alegeti alt loc.");
        }

        locuriRezervate.add(loc);
        System.out.println("Rezervare efectuata pentru data: " + data + " si locul: " + loc + ".");
    }
}
