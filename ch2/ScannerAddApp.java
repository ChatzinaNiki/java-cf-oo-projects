package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάσει δύο ακεραίους από τον stdin, τους
 * προσθέτει και εκτυπώνει το αποτέλεσμα.
 */

public class ScannerAddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Δήλωση και αρχικοποιηση μεταβλητων
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Εντολες
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτυπωση αποτελεσματων
        System.out.printf("%d + %d = %d", num1, num2, sum);

    }
}
