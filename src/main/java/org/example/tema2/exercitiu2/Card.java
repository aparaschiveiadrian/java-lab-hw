package org.example.tema2.exercitiu2;

import java.time.LocalDate;

public final class Card extends MetodaPlata {
    private final String cvv;
    private final LocalDate expirare;

    public Card(String cvv, LocalDate expirare) {
        this.cvv = cvv;
        this.expirare = expirare;
    }

    @Override
    public void plata() {
        try{
            if (cvv.length() == 3 && (Integer.parseInt(cvv) > 100 && Integer.parseInt(cvv) <999) && expirare.isAfter(LocalDate.now())){
                System.out.println("Tranzactie reusita cu cardul.");
            } else {
                System.out.println("Tranzactie esuata cu cardul.");
            }
        } catch(Exception e){
            System.out.println("Continut invalid al cardului.");
        }
    }

}