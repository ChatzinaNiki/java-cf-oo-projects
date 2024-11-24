package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * χρησιμοποιει την κλαση BigInteger ωστε να μην εχουμε
 * υπερχειλιση (overflow).
 */

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger myBigNum1 = new BigInteger("123456783213277713219");
        BigInteger myBigNum2 = new BigInteger("123456789");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is: " + result);
        System.out.printf("The result is: %,d", result);
    }
}
