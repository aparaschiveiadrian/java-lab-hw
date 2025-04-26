package org.example.tema2.exercitiul6;

public class Smartwatch implements Smart{
    @Override
    public void touchScreen(){
        System.out.println("Smartwatchul are touchscreen.");
    }

    @Override
    public void porneste() {
        System.out.println("Smartwatchul a pornit.");
    }

    @Override
    public void opreste() {
        System.out.println("Smartwatchul s-a oprit.");
    }
}
