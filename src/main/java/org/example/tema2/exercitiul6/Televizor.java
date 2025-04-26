package org.example.tema2.exercitiul6;

public class Televizor implements Conectabil{
    @Override
    public void conectareInternet(){
        System.out.println("Televizorul s-a conectat la internet.");
    }

    @Override
    public void porneste() {
        System.out.println("Televizorul a pornit.");
    }

    @Override
    public void opreste() {
        System.out.println("Televizorul s-a oprit.");
    }
}
