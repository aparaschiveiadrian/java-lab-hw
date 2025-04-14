package org.example.tema1.exercitiu1;

public class Main {
    public static void main(String[] args) {
        int errorCode = 0;

        if (args.length != 3) {
            errorCode = 1;
        } else {
            try {
                Integer.parseInt(args[0]);
                Integer.parseInt(args[1]);
                Double.parseDouble(args[2]);
            } catch (NumberFormatException e) {
                if (!isInteger(args[0])) {
                    errorCode = 2;
                } else if (!isInteger(args[1])) {
                    errorCode = 3;
                } else if (!isDouble(args[2])) {
                    errorCode = 4;
                }
            }
        }
        switch (errorCode) {
            case 1:
                System.out.println("3 argumente (int, int, double).");
                return;
            case 2:
                System.out.println("primul numar trebuie sa fie intreg");
                return;
            case 3:
                System.out.println("al doilea numar trebuie sa fie intreg");
                return;
            case 4:
                System.out.println("al treilea numar trebuie sa fie real");
                return;
        }

        // Autoboxing
        Integer nrIntW1 = Integer.valueOf(args[0]);
        Integer nrIntW2 = Integer.valueOf(args[1]);
        Double nrRealW = Double.valueOf(args[2]);

        // Unboxing
        int nrInt1 = nrIntW1;
        int nrInt2 = nrIntW2;
        double nrReal = nrRealW;

        double suma = nrInt1 + nrInt2 + nrReal;
        double produs = nrInt1 * nrInt2 * nrReal;
        double media = suma / 3;

        System.out.printf("Suma: %.2f, Media: %.2f, Produsul: %.2f%n", suma, media, produs);
    }

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
