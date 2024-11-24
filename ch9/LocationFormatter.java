package gr.aueb.cf.ch9;

import java.io.*;

public class LocationFormatter {

    public static void main(String[] args) {
        String inputFile = "src/gr/aueb/cf/ch9/locations.txt";

        String outputFile = "formatted_locations.txt";

        // Έλεγχος ύπαρξης του αρχείου και εμφάνιση της απόλυτης διαδρομής
        File file = new File(inputFile);
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());

        // Αν δεν υπάρχει το αρχείο, σταματάμε την εκτέλεση
        if (!file.exists()) {
            System.out.println("Το αρχείο locations.txt δεν βρέθηκε.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue; // παράβλεψη της πρώτης γραμμής (headers)
                }

                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String location = parts[0].trim();
                    String latitude = parts[1].trim();
                    String longitude = parts[2].trim();

                    String formatted = String.format("{ location: '%s', latitude: %s, longitude: %s },",
                            location, latitude, longitude);
                    bw.write(formatted);
                    bw.newLine();
                }
            }

            System.out.println("Η μετατροπή ολοκληρώθηκε με επιτυχία!");

        } catch (IOException e) {
            System.out.println("Παρουσιάστηκε σφάλμα: " + e.getMessage());
        }
    }
}
