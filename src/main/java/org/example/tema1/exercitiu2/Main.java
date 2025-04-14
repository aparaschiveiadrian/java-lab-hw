package org.example.tema1.exercitiu2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] splitInput = input.trim().split(" ");
        int len = splitInput.length;

        if (len < 5) {
            System.out.println("Minim 5 numere");
            return;
        }

        int[] arr = new int[len];


        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(splitInput[i]);
        }
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);

        int index = Arrays.binarySearch(arr, arr[0]);
        System.out.println("Index al primului numar in array-ul sortat: " + index);

        System.out.println("Array-ul sortat: " + Arrays.toString(arr));
        System.out.println("Array-ul copiat (inainte de sortare): " + Arrays.toString(arrCopy));


        System.out.println("Daca verificam egalitatea referintelor: " + (arr == arrCopy));
    }
}
