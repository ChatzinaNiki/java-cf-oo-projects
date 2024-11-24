package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Decryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Δώστε το κείμενο προς αποκρυπτογράφηση: ");
        String input = scanner.nextLine();

        String decryptedText = decrypt(input);

        System.out.println("Αποκρυπτογραφημένο κείμενο: " + decryptedText);

        scanner.close();
    }

    // Μέθοδος αποκρυπτογράφησης
    public static String decrypt(String text) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Αντικατάσταση του χαρακτήρα με τον προηγούμενο στην ASCII
            decrypted.append((char) (ch - 1));
        }

        return decrypted.toString();
    }
}


