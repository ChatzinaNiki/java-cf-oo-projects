package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;


        System.out.println("Please insert if tank1 is LT quarter");
        isLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank2 is LT quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isRed = isLTQuarterTank1 && isLTQuarterTank2;
        isOrange = (isLTQuarterTank1 || isLTQuarterTank2) && !isRed;

        System.out.println("Orange" + isOrange);
        System.out.println("Orange" + isRed);

    }
}
