package gr.aueb.cf.ch2;

/**
 * Math.Random 0.0 - 0.999 [0,1)
 */

public class DiceApp {
    public static void main(String[] args) {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("(%d, %d)", die1, die2);

    }
}
