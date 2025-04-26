package org.example.tema2.exercitiu3;

import org.example.tema2.exercitiu3.exceptions.DateInvalideException;
import org.example.tema2.exercitiu3.exceptions.LocIndisponibilException;
import org.example.tema2.exercitiu3.exceptions.RezervareException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Serviciu serviciu = Serviciu.getInstance();

        try {
            LocalDate dataActuala = LocalDate.now();
            serviciu.rezervaLoc(dataActuala, 1);
            serviciu.rezervaLoc(dataActuala, 1);//LocIndiusponibil ex
            serviciu.rezervaLoc(LocalDate.of(2023, 5, 10), 2);//DateInvalide ex
        }
        catch (LocIndisponibilException e) {
            System.out.println(e.getMessage());
        }
        catch (DateInvalideException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("O eroare necunoscuta a aparut.");
        }
        finally {
            System.out.println("Procesul de rezervare s-a incheiat.");
        }
    }
}