package org.example.tema1.exercitiul6;

import java.util.Arrays;

public class Curs {
    //Agregare: Studentii pot exista independent de curs
    //CompozitieL Daca obiectul Curs dispare, nu mai e relevant
    private Profesor profesor;
    private String[] studenti;

    public Curs(Profesor profesor, String[] studenti) {
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String[] getStudenti() {
        return studenti;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "profesor=" + profesor +
                ", studenti=" + Arrays.toString(studenti) +
                '}';
    }
}
