package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβαζει απο το standard in εναν ακεραιο
 * που συμβολιζει μια θερμοκρασια και ελεγχει
 * αν η θερμοκρασια ειναι μικροτερη απο 0.
 * Εκτυπωνει το αποτέλεσμα.
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isTempBelowZero = (temp < 0);

        System.out.println("Temperature is below zero: " + isTempBelowZero);
    }
}
