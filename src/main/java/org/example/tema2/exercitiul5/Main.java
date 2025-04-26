package org.example.tema2.exercitiul5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<OrganismViu> organisme = new ArrayList<>();

        Urs u = new Urs();
        Delfin d = new Delfin();

        organisme.add(u);
        organisme.add(d);

        for (OrganismViu organism : organisme) {
            organism.respira();
            organism.seHraneste();

            if (organism instanceof Mamifer mamifer) {
                mamifer.arePar();
            }
        }
    }
}
