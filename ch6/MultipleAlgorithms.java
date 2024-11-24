package gr.aueb.cf.ch6;

import java.util.Scanner;

public class MultipleAlgorithms {


    public static void main(String[] args) {
        //Αρχικοποίηση
        Scanner question_user = new Scanner(System.in);
        boolean position = true; //Μεταβλητής για την 2η μέθοδο για να
        // οριστικοποιήσει την θέση και να παρει την μεθοδο binarySearch
        // για να μας επιστρέψει σε ποιο position είναι το value search(αυτό τον αριθμό που
        // θα δώσει ο χρήστης και βρισκεται σαν παράμετρος μέσα στην μέθοδο binarySearch)

        //Εντολές
        System.out.print("Πληκτρολογήστε πόσα νούμερα θέλετε: ");

        int[] array_integers = new int[question_user.nextInt()];

        for (int running = 0; running < array_integers.length; running++) {
            System.out.printf("Πατήστε τον %d αριθμό: ", running + 1);
            array_integers[running] = question_user.nextInt();
        }

        //1η ΜΕΘΟΔΟΣ ------------------------------------------------------
        search_position_of_value(array_integers);

        System.out.println("Ο ΠΙΝΑΚΑΣ ΠΟΥ ΕΧΕΤΕ ΕΙΝΑΙ: ");
        System.out.println();
        for (int i = 0; i < array_integers.length; i++) {
            System.out.print(array_integers[i] + ",");
            System.out.print("");
        }
        System.out.println();

        /*//2η MEΘΟΔΟΣ -------------------------------------------------
        System.out.print("Πληκτρολογήστε τον αριθμό που θέλετε , μέσω μεθόδου BinarySearch: ");
        int answer_user_value_for_binary_search = question_user.nextInt();

        System.out.print("Πληκτρολογήστε τον αριθμό που θέλετε για να οριστεί Low , μέσω μεθόδου BinarySearch: ");
        int answer_user_low_for_binary_search = question_user.nextInt();

        System.out.print("Πληκτρολογήστε τον αριθμό που θέλετε για να οριστεί High , μέσω μεθόδου BinarySearch: ");
        int answer_user_high_for_binary_search = question_user.nextInt();

        search_position_of_value_with_binary_search(array_integers,answer_user_value_for_binary_search,answer_user_low_for_binary_search,answer_user_high_for_binary_search);*/

        //3η ΜΕΘΟΔΟ
        printing_of_even_number(array_integers);
        //4η ΜΕΘΟΔΟ
        mapping_numbers_of_an_array(array_integers);
        //5η ΜΕΘΟΔΟ
        search_positive_numbers(array_integers);
        //6η ΜΕΘΟΔΟ
        all_numbers_are_positives(array_integers);

        question_user.close();

    }

    public static void search_position_of_value(int[] arr) {
        //Αρχικοποίηση
        boolean foundnumber = false;
        int position = 0;
        int question_user_for_value;
        Scanner question_user = new Scanner(System.in);

        //Εντολες

        System.out.print("Πληκτρολογήστε , εάν ο αριθμός βρίσκεται μέσα στις επιλογές σας: ");
        question_user_for_value = question_user.nextInt();

        for (int search = 0; search < arr.length; search++) {
            if (question_user_for_value == arr[search]) {
                position = search;
                System.out.println();
                System.out.printf("Ο αριθμός που επιλέξατε βρίσκεται στην θέση %d", position + 1);
                System.out.println();
                foundnumber = true;
                break;
            }
        }
        if (!foundnumber) {
            System.out.println();
            System.out.println("Δεν βρέθηκε κάτι.");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Ολοκληρώθηκε η εύρεση αριθμού σε συγκεκριμένη θέση.");
        System.out.println();
        System.out.println("Περνάμε στον επόμενο αλγόριθμο.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }

    /*public static int search_position_of_value_with_binary_search(int[] arr, int value_search, int low, int high) {
        //Αρχικοποίηση δεικτών
        low = 0;
        high = arr.length - 1;

        //Ελέγχος της εγκυρότητας των δεικτών
        if (low > high) {
            System.out.println("ΣΦΑΛΜΑ: Τα όρια των δεικτών δεν είναι έγκυρα.");
            return -1; // Επιστρέφει ένα αρνητικό αποτέλεσμα για να υποδείξει το σφάλμα
        }

        int mid = (low + high) / 2;

        if (value_search == arr[mid]) {
            System.out.println("Συγχαρητήρια. Βρήκατε τον σωστό αριθμό!!!!!");
            return arr[mid];
        }

        if (value_search > arr[mid]) {
            return search_position_of_value_with_binary_search(arr, value_search, mid + 1, high);
        } else {
            return search_position_of_value_with_binary_search(arr, value_search, low, mid - 1);
        }
    }*/

    public static void printing_of_even_number(int[] arr) {
        //Αρχικοποιηση
        int count_even = 0;
        boolean even_is_found = false;
        //Εντολες

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count_even++;
                System.out.println();
                System.out.printf("ΖΥΓΟΣ ΑΡΙΘΜΟΣ: [%d]", arr[i]);
                System.out.println();
                even_is_found = true;
            }
        }

        if (!even_is_found) {
            System.out.println();
            System.out.println("Δεν βρέθηκε κάποιος ζυγός αριθμός.");
        }
        if (count_even > 1) {
            System.out.println();
            System.out.printf("Βρήκαμε %d ζυγούς αριθμούς.", count_even);
        } else {
            System.out.println();
            System.out.printf("Βρήκαμε %d ζυγό αριθμό.", count_even);
            System.out.println();
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Ολοκληρώθηκε η εύρεση ζυγού αριθμού .");
        System.out.println();
        System.out.println("Περνάμε στον επόμενο αλγόριθμο.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }

    public static void mapping_numbers_of_an_array(int[] arr) {
        //Αρχικοποίηση
        int i;
        //Εντολές
        System.out.println("Ο καινούργιος πίνακας με τα διπλάσια νούμερα είναι: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Ολοκληρώθηκε o διπλασιος αριθμών.");
        System.out.println();
        System.out.println("Περνάμε στον επόμενο αλγόριθμο.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }

    public static int[] search_positive_numbers(int[] arr) {
        // Αρχικοποίηση
        int count_positive = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count_positive++;
                System.out.printf("ΘΕΤΙΚΟΣ ΑΡΙΘΜΟΣ: [%d]%n", arr[i]);
            }
        }


        int[] positive_array = new int[count_positive];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positive_array[index] = arr[i];
                index++;
            }
        }


        if (count_positive > 0) {
            System.out.println("Οι θετικοί αριθμοί που βρέθηκαν είναι:");
            for (int item : positive_array) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.out.println("Δεν βρέθηκε θετικός αριθμός.");
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Ολοκληρώθηκε η εύρεση θετικών αριθμών.");
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Περνάμε στον επόμενο αλγόριθμο.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();

        return positive_array;
    }

    public static void all_numbers_are_positives(int[] arr) {
        //Αρχικοποίηση
        int count_positives = 0;
        boolean is_positive = false;
        //Εντολές

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count_positives++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                is_positive = false;
                break;
            } else {
                is_positive = true;
            }
        }

        if (!is_positive) {
            System.out.println("Βρέθηκε τουλάχιστον ένας αρνητικός αριθμός. Δεν περνάει το τεστ θετικού προσήμου.");
        } else {
            if (count_positives == 1) {
                System.out.println();
                System.out.printf("Βρέθηκε στο σύνολο %d αριθμός.", count_positives);
                System.out.println();
            } else if (count_positives > 1) {
                System.out.println();
                System.out.printf("Βρέθηκαν στο σύνολο %d αριθμοί.", count_positives);
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Ολοκληρώθηκε η εύρεση θετικών αριθμών στο σύνολο του πίνακα.");
        System.out.println("-------------------------------------");
        System.out.println();
        System.out.println("Περνάμε στον επόμενο αλγόριθμο.");
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println();
    }
}


