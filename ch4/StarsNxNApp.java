package gr.aueb.cf.ch4;

/**
 * N x N αστεράκια
 */

import java.util.Scanner;

public class StarsNxNApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Δώστε τον αριθμό των αστεριών: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
