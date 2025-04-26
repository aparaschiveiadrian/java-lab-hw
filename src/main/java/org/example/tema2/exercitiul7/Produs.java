package org.example.tema2.exercitiul7;

import java.util.Objects;

public class Produs {
    private int cod;
    private String nume;
    private double pret;

    public Produs(int cod, String nume, double pret){
        this.cod = cod;
        this.nume = nume;
        this.pret = pret;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o){
        if(o == null)
            return false;
        if(o == this)
            return true;
        if(!(o instanceof Produs))
            return false;
        Produs other = (Produs) o;
        if(other.cod ==this.cod)
            return true;
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(cod);
    }

    @Override
    public String toString() {
        return "Produs{" +
                "cod='" + cod + '\'' +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}
