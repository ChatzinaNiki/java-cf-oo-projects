package gr.aueb.cf.ch2;

import java.util.Locale;

public class OutputApp {
    public static void main(String[] args) {
        int num = 1;
        long num2 = 20;

//        System.out.println("Hello");
//        System.out.print("Hello 2");
//        System.out.println();
//        System.out.printf("Hello");
//
//        System.out.println("Num is: " + num);
//        System.out.printf("Num is %d", num);
        System.out.printf(Locale.forLanguageTag("el"), "Num is: %04d, \nNum2 is: %,4d", num, num2);

    }
}
