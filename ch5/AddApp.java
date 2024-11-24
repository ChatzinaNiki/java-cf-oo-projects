package gr.aueb.cf.ch5;

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a, b);

        System.out.printf("%d + %d = %d", a, b, result);
        // εκτυπώνει 10 + 20 = 30

        System.out.println("Result: " + result);
        // εκτυπώνει Result: 30
    }

    /**
     * Adds 2 integers
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */

    public static int add(int a, int b) {

//        int result = 0;
//        result = a + b;
//        return result;

        return a + b;
    }
}
