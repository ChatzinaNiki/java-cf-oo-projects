package gr.aueb.cf.ch1;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        // Δημιουργία ενός αντικειμένου Scanner για την ανάγνωση εισόδου από το χρήστη
        Scanner scanner = new Scanner(System.in);

        // Εκτύπωση του μενού
        System.out.println("Μενού:");
        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");

        // Εκτύπωση μηνύματος για εισαγωγή επιλογής από το χρήστη
        System.out.print("Δώστε αριθμό επιλογής: ");

        // Διάβασμα της επιλογής από το χρήστη
        int choice = scanner.nextInt();

        // Εκτύπωση της επιλογής του χρήστη
        System.out.println("Επιλογή: " + choice);

        // Κλείσιμο του Scanner
        scanner.close();
    }
}
