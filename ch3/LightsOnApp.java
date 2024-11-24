package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι,
 * είτε τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει
 * τα τρία παραπάνω στοιχεία και το πρόγραμμα
 * εκτυπώνει αν τα φώτα ανάβουν ή όχι.
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean arelightsOn = false;

        System.out.println("Please insert if is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        speed = in.nextInt();

        isRunning = speed >= MAX_SPEED;
        arelightsOn = isRaining && (isRunning || isDark);

        System.out.println("Are lights On : " + arelightsOn);
    }
}
