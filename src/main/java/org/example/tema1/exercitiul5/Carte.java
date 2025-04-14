package org.example.tema1.exercitiul5;

public class Carte implements Cloneable {
    private String titlu;
    private String autor;
    private Integer anApartitie;

    public Carte(String titlu, String autor, Integer anApartitie) {
        this.titlu = titlu;
        this.autor = autor;
        this.anApartitie = anApartitie;
    }

    public Carte(Carte other) {
        this.titlu = new String(other.titlu);
        this.autor = new String(other.autor);
        this.anApartitie = other.anApartitie;
    }

    void afiseazaDetalii() {
        System.out.println("Cartea cu titlul: " + this.titlu + " are ca autor " + this.autor + " si a aparut in " + this.anApartitie);
    }

    void afiseazaDetalii(boolean faraAn) {
        System.out.println("Cartea cu titlul: " + this.titlu + " are ca autor " + this.autor);
    }

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                ", anApartitie=" + anApartitie +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //la deepCopy, referintele nu sunt copiate, adica Stringurile, se creeaza noi instante pentru campurile obiectelor referinta
    public Carte deepCopy() {
        return new Carte(this);
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitlu() {
        return titlu;
    }
}
