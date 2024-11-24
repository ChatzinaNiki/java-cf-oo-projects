package gr.aueb.cf.ch2;

/**
 * ελεγχει την υπερχειλιση σε περιπτωση που συμβει
 */

public class OverflowApp {
    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        //εντολες
        result = num1 + num2;

        //εκτυπωση αποτελεσματος -- δινει αποτελεσμα, αλλα ειναι λαθος!
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
