package gr.aueb.cf.ch6;

/**
 * Διασχίζει και εκτυπώνει τα στοιχεία ενός
 * πίνακα με for-each.
 */

public class ArrayForeachApp {
    public static void main(String[] args) {
        int[] ages = {19, 29, 22, 40};

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
