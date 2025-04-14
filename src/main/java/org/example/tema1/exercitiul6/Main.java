package org.example.tema1.exercitiul6;

public class Main {
    public static void main(String[] args) {
        String[] studenti = {"Iani Meghea", "Barbuy Matei", "George Mihai"};
        Profesor prof = new Profesor("Onisor", "Matematica", "1111");

        Curs curs = new Curs(prof, studenti);

        System.out.println("Curs initial:");
        System.out.println(curs);


        //getteri setteri pentru encapsulare
        prof.setNume("Michael Math");
        prof.setSpecializare("Info");
        //agregare
        studenti[1] = "Anghel Matei";

        System.out.println("\nContinut modificat:");
        System.out.println(curs);

        System.out.println("\nAccess:");
        System.out.println("Profesor: " + curs.getProfesor());
        System.out.print("Studenti: ");
        for (String student : curs.getStudenti()) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
