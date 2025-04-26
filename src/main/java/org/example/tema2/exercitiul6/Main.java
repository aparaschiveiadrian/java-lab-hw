package org.example.tema2.exercitiul6;

public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        Smartwatch smartwatch = new Smartwatch();
        Televizor televizor = new Televizor();

        Dispozitiv.descriereGenerala();

        //metode dispozitiv
        telefon.porneste();
        smartwatch.porneste();
        televizor.porneste();

        telefon.opreste();
        smartwatch.opreste();
        televizor.opreste();

        telefon.touchScreen();
        telefon.conectareInternet();

        smartwatch.touchScreen();

        televizor.conectareInternet();

        telefon.status();
        smartwatch.status();
        televizor.status();
    }
}
