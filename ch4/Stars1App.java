package gr.aueb.cf.ch4;

/**
 * εκτυπώνει από n έως 1 αστεράκια
 */

import java.util.Scanner;

public class Stars1App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Δώστε τον αριθμό των αστεριών: ");
        int n = scanner.nextInt();

        for (int i = n; i <= 1; i++) {
            System.out.print("*");
        }

//        scanner.close();
    }
}
