package org.example.tema2.exercitiu2;

public class PlataService {

    private static PlataService instance;

    private PlataService() {}

    public static PlataService getInstance() {
        if (instance == null) {
            instance = new PlataService();
        }
        return instance;
    }

    public void proceseazaPlata(MetodaPlata metodaPlata) {
        if (metodaPlata instanceof Card card) {
            card.plata();
        } else if (metodaPlata instanceof Cash cash) {
            cash.plata();
        } else if (metodaPlata instanceof TransferBancar transfer) {
            transfer.plata();
        } else {
            System.out.println("Nu e recunoscuta metoda.");
        }
    }
}