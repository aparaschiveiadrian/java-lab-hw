package org.example.tema1.exercitiul8;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Grup<Student> grup = new Grup<>(5);

        grup.adaugaStudent(new Student("Iani", 20, 9.5));
        grup.adaugaStudent(new Student("Barbu", 21, 8.7));
        grup.adaugaStudent(new Student("Basi", 19, 9.9));

        grup.sorteazaStudenti();

        for (Student s : grup.getStudenti()) {
            System.out.println(s);
        }

        Student cautat = grup.cautaStudentDupaNume("Baassi");
        System.out.println("Cautat: " + cautat);

        Thread t1 = new Thread(() -> {
            long start = System.currentTimeMillis();
            System.out.println("\n[Thread 1 - StringBuffer]");
            System.out.println(grup.genereazaRaportSincronizat());
            long end = System.currentTimeMillis();
            System.out.println( (end - start) + " ms");
        });


        Thread t2 = new Thread(() -> {
            long start = System.currentTimeMillis();
            System.out.println("\n[Thread 2 - StringBuilder]");
            System.out.println(grup.genereazaRaport());
            long end = System.currentTimeMillis();
            System.out.println( (end - start) + " ms");
        });


        t1.start();
        t1.join();

        t2.start();
        t2.join();

        //StringBuffer e thread safe, dar mai incer, ceea ce inseamna ca in aplicatiile single-thread putem folosi StringBuilder in siguranta, iar in cele 2+ threads StringBuffer
        //De asemenea exista si viteza de executie, StringBuilder fiind mai rapid in executie decat SpringBuffer
    }
}
