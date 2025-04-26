package org.example.tema2.exercitiu2;

public final class TransferBancar extends MetodaPlata {
    private final String iban;

    public TransferBancar(String iban) {
        this.iban = iban;
    }

    @Override
    public void plata() {
        if (iban.startsWith("RO")) {
            System.out.println("Transfer bancar validat cu succes.");
        } else {
            System.out.println("IBAN invalid pentru transfer bancar.");
        }
    }
}