package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Εκτύπωση του μενού
            System.out.println("Επιλέξτε μία επιλογή:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            // Διάβασμα επιλογής από τον χρήστη
            System.out.print("Εισάγετε την επιλογή σας: ");
            choice = scanner.nextInt();

            // Έλεγχος της επιλογής
            if (choice < 1 || choice > 5) {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ εισάγετε έναν αριθμό από 1 έως 5.");
            } else if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή.");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή.");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση.");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση.");
            }
        } while (choice != 5);

        System.out.println("Τέλος προγράμματος.");

        scanner.close();
    }
}
