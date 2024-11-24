package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TemperatureConverterApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result;

        result = (num > 0) ? num : -num;

        System.out.println(result);
    }
}
