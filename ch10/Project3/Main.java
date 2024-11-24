package gr.aueb.cf.ch10.Project3;

import java.util.Arrays;

public class Main {

    // Shallow Copy: Αντιγράφει μόνο τις αναφορές των υποπινάκων
    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // Deep Copy: Δημιουργεί πλήρη αντίγραφα κάθε υποπίνακα
    public static int[][] deepCopy(int[][] arr) {
        int[][] copy = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return copy;
    }

    public static void main(String[] args) {
        // Αρχικός πίνακας
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Shallow Copy
        int[][] shallow = shallowCopy(original);

        // Deep Copy
        int[][] deep = deepCopy(original);

        // Αλλαγή τιμής στον αρχικό πίνακα
        original[0][0] = 100;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Αρχικός Πίνακας: ");
        printMatrix(original);

        System.out.println("Shallow Copy: ");
        printMatrix(shallow);

        System.out.println("Deep Copy: ");
        printMatrix(deep);
    }

    // Μέθοδος εκτύπωσης πίνακα
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}


/**
 * Επεξήγηση:
 * Shallow Copy: Χρησιμοποιούμε την Arrays.copyOf() για να αντιγράψουμε τον πίνακα, αλλά αυτό αντιγράφει μόνο τις αναφορές
 * στους υποπίνακες, όχι τα ίδια τα στοιχεία τους. Επομένως, όταν αλλάζουμε ένα στοιχείο στον αρχικό πίνακα, το αντίστοιχο
 * στοιχείο αλλάζει και στον πίνακα που έγινε shallow copy.
 * <p>
 * Deep Copy: Δημιουργούμε έναν νέο πίνακα και για κάθε υποπίνακα του αρχικού πίνακα, χρησιμοποιούμε την Arrays.copyOf() για
 * να αντιγράψουμε τα στοιχεία του υποπίνακα, δημιουργώντας έτσι έναν ανεξάρτητο πίνακα.
 * <p>
 * Εκτέλεση:
 * Μετά την αλλαγή της τιμής original[0][0] σε 100, θα δείτε ότι αυτή η αλλαγή αντικατοπτρίζεται και στον πίνακα shallow,
 * αλλά όχι στον πίνακα deep, που είναι ανεξάρτητο αντίγραφο.
 */