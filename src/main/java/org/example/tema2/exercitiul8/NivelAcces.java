package org.example.tema2.exercitiul8;

public enum NivelAcces {
    ADMIN(1, "Acces complet"),
    EDITOR(2, "Acces la editare"),
    USER(3, "Acces la vizualizare si interactionare"),
    GUEST(4, "Acces la vizualizare");

    private final int cod;
    private final String descriere;

    NivelAcces(int cod, String descriere) {
        this.cod = cod;
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
    }

    public int getCod() {
        return cod;
    }

    public static NivelAcces dinCod(int cod){
        for (NivelAcces nivel : NivelAcces.values()) {
            if (nivel.getCod() == cod) {
                return nivel;
            }
        }
        //nu corespund eniciun cod
        throw new IllegalArgumentException("Codul introdus este invalid");
    }

}
