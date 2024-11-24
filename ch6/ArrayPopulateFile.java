package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Αρχικοποιεί τον πίνακα διαβάζοντας από ένα αρχείο.
 */

public class ArrayPopulateFile {
    public static void main(String[] args) throws FileNotFoundException {
        int[] ages = new int[5];
        File intFile = new File("C:\\Users\\chatz\\IdeaProjects\\CodingFactory6\\src\\gr\\aueb\\cf\\ch6\\myIntFile.txt");
        // Σχετική διαδρομή αρχείου, πάω στον φάκελο και κάνω copy/paste το path
        //Βασική προϋπόθεση να είναι το αρχείο .txt στον ίδιο φάκελο με το αρχείο .java !!!!

        Scanner sc = new Scanner(intFile);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        for (int age : ages) {
            System.out.print(age + " ");
        }

        sc.close();
    }
}
