package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AsterakiaMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            displayMenu();
            System.out.print("Δώσε επιλογή: ");
            choice = scanner.nextInt();

            if (choice != 6) {
                System.out.print("Δώστε αριθμό για αστεράκια: ");
                int n = scanner.nextInt();

                switch (choice) {
                    case 1:
                        printHorizontalStars(n);
                        break;
                    case 2:
                        printVerticalStars(n);
                        break;
                    case 3:
                        printSquareOfStars(n);
                        break;
                    case 4:
                        printAscendingTriangleStars(n);
                        break;
                    case 5:
                        printDescendingTriangleStars(n);
                        break;
                    default:
                        System.out.println("Μη έγκυρη επιλογή.");
                }
            }
        }
        System.out.println("Έξοδος από το πρόγραμμα.");
        scanner.close();
    }

    // Μέθοδος για εμφάνιση του μενού
    public static void displayMenu() {
        System.out.println("Μενού επιλογών:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    // Μέθοδος για εμφάνιση n αστεριών οριζόντια
    public static void printHorizontalStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // Μέθοδος για εμφάνιση n αστεριών κάθετα
    public static void printVerticalStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    // Μέθοδος για εμφάνιση n γραμμών με n αστεράκια
    public static void printSquareOfStars(int n) {
        for (int i = 0; i < n; i++) {
            printHorizontalStars(n);
        }
    }

    // Μέθοδος για εμφάνιση n γραμμών με αστεράκια 1 – n
    public static void printAscendingTriangleStars(int n) {
        for (int i = 1; i <= n; i++) {
            printHorizontalStars(i);
        }
    }

    // Μέθοδος για εμφάνιση n γραμμών με αστεράκια n – 1
    public static void printDescendingTriangleStars(int n) {
        for (int i = n; i > 0; i--) {
            printHorizontalStars(i);
        }
    }
}
