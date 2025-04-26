package org.example.tema2.exercitiul6;

public class Telefon implements Smart, Conectabil{
    @Override
    public void touchScreen(){
        System.out.println("Telefonul are touchscreen.");
    }

    @Override
    public void conectareInternet(){
        System.out.println("Telefonul s-a conectat la internet.");
    }

    @Override
    public void porneste() {
        System.out.println("Telefonul a pornit.");
    }

    @Override
    public void opreste() {
        System.out.println("Telefonul s-a oprit.");
    }
}
