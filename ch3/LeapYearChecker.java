package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Χρήση του while για συνεχή εκτέλεση του προγράμματος
        while (true) {
            System.out.println("Παρακαλώ εισάγετε ένα έτος για να ελέγξετε αν είναι δίσεκτο (ή -1 για έξοδο): ");
            int year = scanner.nextInt();

            // Έξοδος αν ο χρήστης εισάγει -1
            if (year == -1) {
                break;
            }

            // Έλεγχος αν το έτος είναι δίσεκτο
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Το έτος " + year + " είναι δίσεκτο.");
            } else {
                System.out.println("Το έτος " + year + " ΔΕΝ είναι δίσεκτο.");
            }
        }

        scanner.close();
        System.out.println("Ευχαριστούμε για τη χρήση του προγράμματος!");
    }
}
