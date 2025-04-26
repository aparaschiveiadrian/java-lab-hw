package org.example.tema2.exercitiu2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PlataService plataService = PlataService.getInstance();

        LocalDate data = LocalDate.parse("2025-09-09");

        MetodaPlata card = new Card("123", data);
        MetodaPlata cash = new Cash();
        MetodaPlata transfer = new TransferBancar("RO0000");

        plataService.proceseazaPlata(card);
        plataService.proceseazaPlata(cash);
        plataService.proceseazaPlata(transfer);
    }
}
