package gr.aueb.cf.ch6;

/**
 * Αρχικοποιεί έναν πίνακα ακραίων
 * με unsized initialization.
 */

public class ArrayPopulateUnsized {
    public static void main(String[] args) {
        //Initialize - Populate the array ("γέμισμα" του πίνακα με τιμές)
        int[] ages = {19, 20, 23, 22, 30};

        //Print the array elements
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i] + " ");
        }
    }
}
