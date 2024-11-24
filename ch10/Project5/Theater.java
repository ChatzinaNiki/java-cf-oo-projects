package gr.aueb.cf.ch10.Project5;

import java.util.Scanner;

public class Theater {
    // Δυσδιάστατος πίνακας που αναπαριστά το θέατρο
    private static final boolean[][] seats = new boolean[30][12];

    // Μέθοδος για κράτηση θέσης
    public static void book(char column, int row) {
        int colIndex = column - 'A'; // Μετατροπή της στήλης σε δείκτη πίνακα
        int rowIndex = row - 1;      // Οι σειρές ξεκινούν από το 0

        // Έλεγχος αν η θέση είναι εντός ορίων
        if (colIndex < 0 || colIndex >= 12 || rowIndex < 0 || rowIndex >= 30) {
            System.out.println("Λάθος στήλη ή σειρά. Προσπαθήστε ξανά.");
            return;
        }

        // Έλεγχος αν η θέση είναι ήδη κρατημένη
        if (seats[rowIndex][colIndex]) {
            System.out.println("Η θέση " + column + row + " είναι ήδη κρατημένη.");
        } else {
            seats[rowIndex][colIndex] = true;
            System.out.println("Η θέση " + column + row + " κρατήθηκε επιτυχώς.");
        }
    }

    // Μέθοδος για ακύρωση κράτησης
    public static void cancel(char column, int row) {
        int colIndex = column - 'A'; // Μετατροπή της στήλης σε δείκτη πίνακα
        int rowIndex = row - 1;      // Οι σειρές ξεκινούν από το 0

        // Έλεγχος αν η θέση είναι εντός ορίων
        if (colIndex < 0 || colIndex >= 12 || rowIndex < 0 || rowIndex >= 30) {
            System.out.println("Λάθος στήλη ή σειρά. Προσπαθήστε ξανά.");
            return;
        }

        // Έλεγχος αν η θέση είναι ήδη διαθέσιμη
        if (!seats[rowIndex][colIndex]) {
            System.out.println("Η θέση " + column + row + " δεν είναι κρατημένη.");
        } else {
            seats[rowIndex][colIndex] = false;
            System.out.println("Η κράτηση για τη θέση " + column + row + " ακυρώθηκε επιτυχώς.");
        }
    }

    // Μέθοδος για εκτύπωση των θέσεων του θεάτρου
    public static void printSeats() {
        System.out.print("  ");
        for (char c = 'A'; c <= 'L'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int row = 0; row < 30; row++) {
            System.out.printf("%2d ", row + 1);
            for (int col = 0; col < 12; col++) {
                System.out.print((seats[row][col] ? "X" : "O") + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Αρχικό μενού για τον χρήστη
        while (running) {
            System.out.println("\n1. Κράτηση θέσης");
            System.out.println("2. Ακύρωση κράτησης");
            System.out.println("3. Προβολή θέσεων");
            System.out.println("4. Έξοδος");
            System.out.print("Επιλέξτε ενέργεια: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Δώστε στήλη (A-L): ");
                    char column = scanner.next().charAt(0);
                    System.out.print("Δώστε σειρά (1-30): ");
                    int row = scanner.nextInt();
                    book(column, row);
                    break;
                case 2:
                    System.out.print("Δώστε στήλη (A-L): ");
                    column = scanner.next().charAt(0);
                    System.out.print("Δώστε σειρά (1-30): ");
                    row = scanner.nextInt();
                    cancel(column, row);
                    break;
                case 3:
                    printSeats();
                    break;
                case 4:
                    running = false;
                    System.out.println("Έξοδος από το πρόγραμμα.");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
            }
        }

        scanner.close();
    }
}


/**
 * Περιγραφή Λειτουργίας:
 * Πίνακας θέσεων: Ο πίνακας seats είναι ένας δυσδιάστατος πίνακας boolean[30][12], όπου οι σειρές είναι οι αριθμοί
 * 1 έως 30 και οι στήλες είναι οι χαρακτήρες 'A' έως 'L'.
 * Κράτηση θέσης (book): Η μέθοδος αυτή ελέγχει αν η θέση είναι διαθέσιμη και, αν είναι, την κρατά.
 * Ακύρωση κράτησης (cancel): Η μέθοδος αυτή ακυρώνει την κράτηση αν η θέση είναι ήδη κρατημένη.
 * Εκτύπωση θέσεων (printSeats): Εμφανίζει όλες τις θέσεις του θεάτρου. Οι κρατημένες θέσεις σημειώνονται με X και οι
 * διαθέσιμες με O.
 * Μενού Χρήστη: Ο χρήστης μπορεί να επιλέξει αν θέλει να κάνει κράτηση, ακύρωση κράτησης, να δει τις θέσεις ή να
 * κλείσει το πρόγραμμα.
 */