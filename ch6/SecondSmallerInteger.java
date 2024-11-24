package gr.aueb.cf.ch6;

import java.util.Scanner;

public class SecondSmallerInteger {

    public static int plithos_arithmwn;
    public static int[] left, right, merged, list_numbers;

    public static void main(String[] args) {
        Scanner questionuser = new Scanner(System.in);

        list_numbers = addingnumbersandcreatinglist();
        left_array(list_numbers);
        right_array(list_numbers);
        list_together();
        swapping_and_find_2_smallest_numbers_of_the_array();
    }

    public static int[] addingnumbersandcreatinglist() {
        Scanner questionuser = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int plithos_arithmwn = questionuser.nextInt();
        int[] list_numbers = new int[plithos_arithmwn];

        for (int i = 0; i < plithos_arithmwn; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            list_numbers[i] = questionuser.nextInt();
        }
        return list_numbers;
    }

    public static int[] right_array(int[] array) {
        int xwrismos_stin_mesi = array.length / 2;
        right = new int[array.length - xwrismos_stin_mesi];

        if (array.length - xwrismos_stin_mesi >= 0)
            System.arraycopy(array, xwrismos_stin_mesi, right, xwrismos_stin_mesi - xwrismos_stin_mesi, array.length - xwrismos_stin_mesi);

        return right;
    }

    public static int[] left_array(int[] array) {
        int xwrismos_stin_mesi = array.length / 2;
        left = new int[xwrismos_stin_mesi];

        System.arraycopy(array, 0, left, 0, xwrismos_stin_mesi);

        return left;
    }

    public static int[] list_together() {
        //Αρχικοποιηση
        int[] right_array = right_array(list_numbers);
        int[] left_array = left_array(list_numbers);
        merged = new int[right_array.length + left_array.length];

        //Εντολες

        System.arraycopy(left_array, 0, merged, 0, left_array.length);

        System.arraycopy(right_array, 0, merged, left.length + 0, right_array.length);
        return merged;
    }


    public static void swapping_and_find_2_smallest_numbers_of_the_array() {
        // Αρχικοποίηση
        int[] array_without_sorting = list_together();
        for (int i = array_without_sorting.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array_without_sorting[j] < array_without_sorting[j + 1]) {
                    int temp = array_without_sorting[j];
                    array_without_sorting[j] = array_without_sorting[j + 1];
                    array_without_sorting[j + 1] = temp;
                }
            }
        }
        for (int item : array_without_sorting) {
            System.out.println(item);
        }
        System.out.printf("Ο 2 μικρότερος αριθμος που επιλέξατε είναι ο [%d]", array_without_sorting[array_without_sorting.length - 2]);
    }
}






