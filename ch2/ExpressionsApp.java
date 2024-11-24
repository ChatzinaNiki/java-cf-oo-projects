package gr.aueb.cf.ch2;

/**
 * Επιδεικνυει την χρηση αριθμητικων τελεστων
 * σε αριθμητικες παραστασεις (expressions).
 */

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 20;
        int num3 = 12;
        int num4 = 17;

        int sum = 0;
        int sub = 0;
        int nul = 0;
        int div = 0;
        int mod = 0;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        sum = num1 + num2; // = 121
        sub = num1 - num2;
        nul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = (num1 + num2) * (num1 - num2) / (num1 * 7);
        result2 = sum++; // result2 = 121, sum = 122
        result3 = ++sum; //result3 = 122

        result3--; //121
        --result2; //120


        /**
         * και οι 3 μορφες που ακολουθουν ειναι ισοδυναμες!
         */
        result1 = result1 + 1; //verbose form (φλύαρη μορφή)
        result1++;
        result1 += 1;

        System.out.printf("sum = %d, sub = %d, nul = %d, div = %d\n", sum, sub, nul, div);
        System.out.printf("result1 = %d, result2 = %d, result3 = %d\n", result1, result2, result3);

    }
}
