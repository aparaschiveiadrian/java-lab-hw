package org.example.tema2.exercitiul7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Adăugați produse într-un HashSet<Produs> și demonstrați că duplicatele nu se adaugă.
        Set<Produs> produse = new HashSet<>();
        Produs p1 = new Produs(1, "Rosii", 22.00);

        Produs p2 = new Produs(2, "Branza", 12.00);

        Produs p3 = new Produs(1, "Banane", 5.00); //are acelasi cod, dar date diferite, nu ar trebuie sa fie adaugat

        produse.add(p1);
        produse.add(p2);
        produse.add(p3);

        System.out.println(produse); //[Produs{cod='1', nume='Rosii', pret=22.0}, Produs{cod='2', nume='Branza', pret=12.0}]

        //Creați un HashMap<Produs, Integer> care mapează un produs la stocul disponibil.
        Map<Produs, Integer> mapProduse = new HashMap<>();
        mapProduse.put(p1, 10);
        mapProduse.put(p2, 20);
        mapProduse.put(p3, 30);

        System.out.println(mapProduse); //{Produs{cod='1', nume='Rosii', pret=22.0}=30, Produs{cod='2', nume='Branza', pret=12.0}=20}

        for(Map.Entry<Produs, Integer> entry : mapProduse.entrySet()){
            System.out.println(entry.getKey() + " -> Stoc: " + entry.getValue());
        }
        System.out.println("-----------------");
        mapProduse.entrySet().forEach(entry -> System.out.println(entry.getKey() + "cu stocul: " + entry.getValue()));
    }
}
