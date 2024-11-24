package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) { // Loop μέχρι ο χρήστης να επιλέξει Exit (5)
            try {
                displayMenu(); // Εμφάνιση μενού
                choice = getChoice(scanner); // Ανάγνωση επιλογής χρήστη
                printChoice(choice); // Εκτύπωση επιλογής
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό.");
                scanner.next(); // Καθαρισμός του λανθασμένου input
            }
        }

        System.out.println("Έξοδος από το πρόγραμμα.");
        scanner.close();
    }

    // Μέθοδος εμφάνισης του μενού
    public static void displayMenu() {
        System.out.println("Μενού επιλογών:");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Exit");
        System.out.print("Δώσε επιλογή: ");
    }

    // Μέθοδος για την ανάγνωση της επιλογής του χρήστη
    public static int getChoice(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            throw new InputMismatchException(); // Ρίχνει εξαίρεση αν το input δεν είναι ακέραιος
        }
    }

    // Μέθοδος για την εκτύπωση της επιλογής του χρήστη
    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Μη έγκυρη επιλογή. Επιλέξτε έναν αριθμό μεταξύ 1 και 5.");
        }

        if (choice == 5) {
            System.out.println("Επιλέξατε Exit.");
        } else {
            System.out.println("Επιλέξατε την επιλογή " + choice);
        }
    }
}
