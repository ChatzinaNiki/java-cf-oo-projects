package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών με while και if.
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;  // Αρχικοποίηση της επιλογής

        while (choice != 5) {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές :");
            System.out.println("1. Εισαγωγή (insert) προϊόντος");
            System.out.println("2. Ενημέρωση (update) προϊόντος");
            System.out.println("3. Διαγραφή (delete) προϊόντος");
            System.out.println("4. Αναζήτηση (select) προϊόντος");
            System.out.println("5. Έξοδος");
            System.out.print("Επιλογή: ");
            choice = in.nextInt();

            // Έλεγχος της επιλογής και εμφάνιση feedback
            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή (insert) προϊόντος.");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Ενημέρωση (update) προϊόντος.");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Διαγραφή (delete) προϊόντος.");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση (select) προϊόντος.");
            } else if (choice == 5) {
                System.out.println("Έξοδος από το πρόγραμμα.");
            } else {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ επιλέξτε έναν αριθμό από 1 έως 5.");
            }

            System.out.println(); // Κενή γραμμή για καλύτερη αναγνωσιμότητα
        }

        System.out.println("Ευχαριστούμε!");
        in.close();
    }
}
