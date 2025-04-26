package org.example.tema2.exercitiul8;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        List<ContUtilizator> conturi = new ArrayList<>();

        conturi.add(new ContUtilizator("Admin", NivelAcces.ADMIN));
        conturi.add(new ContUtilizator("Editor", NivelAcces.EDITOR));
        conturi.add(new ContUtilizator("User", NivelAcces.USER));
        conturi.add(new ContUtilizator("Guest", NivelAcces.GUEST));

        System.out.println(conturi);//[ContUtilizator{nume='Admin', nivelAcces=ADMIN}, ContUtilizator{nume='Editor', nivelAcces=EDITOR}, ContUtilizator{nume='User', nivelAcces=USER}, ContUtilizator{nume='Guest', nivelAcces=GUEST}]

        NivelAcces comparat = conturi.get(2).getNivelAcces();

        List<ContUtilizator> conturiPesteUser = conturi
                .stream()
                .filter(cont -> cont.getNivelAcces().ordinal() < comparat.ordinal())
                .toList();

        System.out.println(conturiPesteUser); //[ContUtilizator{nume='Admin', nivelAcces=ADMIN}, ContUtilizator{nume='Editor', nivelAcces=EDITOR}]
    }
}
