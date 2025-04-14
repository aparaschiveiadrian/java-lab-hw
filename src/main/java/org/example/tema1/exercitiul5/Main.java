package org.example.tema1.exercitiul5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Carte original = new Carte("Amintiri din Copilarie", "Ion Creanga", 1923);

        original.afiseazaDetalii();
        original.afiseazaDetalii(false);

        System.out.println("Original: " + original);

        // Shallow copy
        Carte copieShallow = (Carte) original.clone();
        copieShallow.setTitlu("Java Coursebook");

        // Deep copy
        Carte copieDeep = original.deepCopy();
        copieDeep.setTitlu("CARTEAAA SCHIMBATA");

        System.out.println("\nDupa modificari ");
        System.out.println("Original:       " + original);
        System.out.println("Shallow Copy:   " + copieShallow);
        System.out.println("Original dupa shallow copy:   " + copieShallow);
        System.out.println("Deep Copy:      " + copieDeep);
    }
}
