package gr.aueb.cf.ch6;

/**
 * To insized init μπορεί να χρησιμοποιηθεί
 * μόνο κατά την στιγμή της δήλωσης ενώ το
 * array initializer είναι πιο ευέλικτο.
 */

public class ArrayInitializerApp {
    public static void main(String[] args) {
        int[] ages;

        //Array initializer
        ages = new int[]{1, 2, 3, 4};

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
    }
}
