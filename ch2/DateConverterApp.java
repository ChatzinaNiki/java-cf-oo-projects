package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateConverterApp {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;

        //Εντολές
        System.out.println("Εισάγετε ημερομηνία: ΗΗ/ΜΜ/ΕΕ");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();


        //Εμφάνιση μεταβλητών
        System.out.println(day + " / " + month + " / " + year);
        System.out.printf("%02d/%02d/%02d\n", day, month, year % 100);
    }
}
