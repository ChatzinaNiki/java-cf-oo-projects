package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Δώστε το κείμενο προς κρυπτογράφηση: ");
        String input = scanner.nextLine();

        String encryptedText = encrypt(input);

        System.out.println("Κρυπτογραφημένο κείμενο: " + encryptedText);

        scanner.close();
    }

    // Μέθοδος κρυπτογράφησης
    public static String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Αντικατάσταση του χαρακτήρα με τον επόμενο στην ASCII
            encrypted.append((char) (ch + 1));
        }

        return encrypted.toString();
    }
}

