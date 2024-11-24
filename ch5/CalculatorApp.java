package gr.aueb.cf.ch5;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorApp {

    static Scanner in = new Scanner(System.in);
    static boolean isError = false;

    public static void main(String[] args) throws IOException {
        char choice = ' ';
        int result = 0;

        while (true) {
            printMenu();
            choice = getChoice();
            if (choice == 'q' || choice == 'Q') break;
            result = getResultFromChoiceOrError(choice);
            if (!isError)
                System.out.println("Result: " + result);
            isError = false;
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση ");
        System.out.println("3. Πολλαπλασιασμός ");
        System.out.println("4. Διαίρεση ");
        System.out.println("5. Υπόλοιπο ");
        System.out.println("Q/q. Έξοδος");
    }

    private static char getChoice() throws IOException {
        return (char) System.in.read();
    }

    public static int getResultFromChoiceOrError(char choice) {
        int result = 0;
        int num1, num2;
        switch (choice) {
            case '1':
                num1 = in.nextInt();
                num2 = in.nextInt();
                result = num1 + num2;
                break;
            case '2':
                num1 = in.nextInt();
                num2 = in.nextInt();
                result = num1 - num2;
                break;
            case '3':
                num1 = in.nextInt();
                num2 = in.nextInt();
                result = num1 * num2;
                break;
            case '4':
                num1 = in.nextInt();
                num2 = in.nextInt();
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    isError = true;
                } else {
                    result = num1 / num2;
                }
                break;
            case '5':
                num1 = in.nextInt();
                num2 = in.nextInt();
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    isError = true;
                } else {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Error: Invalid choice!");
                isError = true;
        }
        return result;
    }
}
