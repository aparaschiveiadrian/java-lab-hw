package org.example.tema1.exercitiul8;

import java.util.Arrays;

public class Grup<T extends Student> {

    private final T[] studenti;
    private int size;
    private final int capacitate;

    public Grup(int capacitate) {
        studenti = (T[]) new Student[capacitate];
        size = 0;
        this.capacitate = capacitate;
    }

    public void adaugaStudent(T student) {
        if (size < studenti.length) {
            studenti[size++] = student;
        } else {
            System.out.println("Grupul este plin!");
        }
    }

    public T cautaStudentDupaNume(String nume) {
        for (int i = 0; i < size; i++) {
            if (studenti[i].getNume().equalsIgnoreCase(nume)) {
                return studenti[i];
            }
        }
        return null;
    }

    public void sorteazaStudenti() {
        Arrays.sort(studenti, 0, size);
    }

    public T[] getStudenti() {
        return Arrays.copyOf(studenti, size);
    }

    public String genereazaRaport() {
        StringBuilder raport = new StringBuilder();
        raport.append("Raport \n");
        for (int i = 0; i < size; i++) {
            raport.append("Nume: ").append(studenti[i].getNume())
                    .append(", Varsta: ").append(studenti[i].getVarsta())
                    .append(", Medie: ").append(studenti[i].getMedie())
                    .append("\n");
        }
        return raport.toString();
    }

    public String genereazaRaportSincronizat() {
        StringBuffer raport = new StringBuffer();
        raport.append("Raport Sincronizat\n");
        for (int i = 0; i < size; i++) {
            raport.append("Nume: ").append(studenti[i].getNume())
                    .append(", Varsta: ").append(studenti[i].getVarsta())
                    .append(", Medie: ").append(studenti[i].getMedie())
                    .append("\n");
        }
        return raport.toString();
    }
}
