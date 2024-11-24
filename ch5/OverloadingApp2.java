package gr.aueb.cf.ch5;

public class OverloadingApp2 {
    public static void main(String[] args) {
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        sum2 = add(1, 2);
        sum3 = add(1, 2, 3);
        sum4 = add(1, 2, 3, 4);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;

        /**
         * @param a first int
         * @param b second int
         * @param c third int
         * @return the sum of 3 integers
         */

    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
        /**
         * @param a first int
         * @param b second int
         * @param c third int
         * @param d forth int
         * @return the sum of 4 integers
         */
    }
}