package gr.aueb.cf.ch4;

/**
 * εκτυπώνει από 1 έως n αστεράκια
 */

import java.util.Scanner;

public class StarsApp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Δώστε τον αριθμό των αστεριών: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }

//        scanner.close();
    }
}
