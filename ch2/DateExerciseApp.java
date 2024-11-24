package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateExerciseApp {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        //Εντολές
        //System.out.println("Εισάγετε ημερομηνία: ΗΗ/ΜΜ/ΕΕEE\n");
        System.out.print("Δώσε ημέρα: ");
        day = in.nextInt();
        System.out.print("Δώσε μήνα: ");
        month = in.nextInt();
        System.out.print("Δώσε έτος: ");
        year = in.nextInt();


        //Εμφάνιση μεταβλητών
        System.out.println(day + " / " + month + " / " + year);
        System.out.printf("Σήμερα η ημερομηνία είναι: %02d/%02d/%04d\n", day, month, year);
    }
}
