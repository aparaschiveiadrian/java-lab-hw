package org.example.tema2.exercitiu2;

public sealed abstract class MetodaPlata
        permits Card, Cash, TransferBancar {

    public abstract void plata();
}