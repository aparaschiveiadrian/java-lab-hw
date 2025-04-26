package org.example.tema2.exercitiul6;

public interface Dispozitiv {
    void porneste();
    void opreste();
    default void status(){
        System.out.printf("Se verifica statusul....");
        verificareInterna();
    }
    static void descriereGenerala(){
        System.out.println("Acest dispozitiv poate fi aprins, oprit, restartat.");
    }
    private void verificareInterna(){
        System.out.println("Functioneaza!");
    }
}
