package gr.aueb.cf.ch4;

/**
 * κάθετα αστεράκια
 */

import java.util.Scanner;

public class StarsNvertApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Δώστε τον αριθμό των αστεριών: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("*");
        }

//            scanner.close();
    }
}
