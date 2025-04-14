package org.example.tema1.exercitiul4;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.logInfo("This is an info message.");
        logger1.logWarning("This is a warning message.");
        logger2.logError("This is an error message.");

        System.out.println("same refference? " + (logger1 == logger2));
    }
}
