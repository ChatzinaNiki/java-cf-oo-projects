package gr.aueb.cf.ch4;

/**
 * Eκτυπωνει 10γραμμες με
 * 10 αστερακια η καθε γραμμη
 */

public class StarsHV10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

