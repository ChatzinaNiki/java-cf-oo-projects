package gr.aueb.cf.ch10.Project1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LottoFilter {

    public static void main(String[] args) {
        try {
            // Βήμα 1: Ανάγνωση των αριθμών από το αρχείο
            int[] numbers = readNumbersFromFile("src/gr/aueb/cf/ch9/inputfile.txt");
            Arrays.sort(numbers);

            // Βήμα 2: Δημιουργία συνδυασμών εξάδας
            List<int[]> combinations = generateCombinations(numbers, 6);

            // Βήμα 3: Φιλτράρισμα των εξάδων
            List<int[]> filteredCombinations = combinations.stream()
                    .filter(LottoFilter::isValidCombination)
                    .collect(Collectors.toList());

            // Βήμα 4: Αποθήκευση των τελικών εξάδων σε αρχείο
            writeCombinationsToFile(filteredCombinations, "src/gr/aueb/cf/ch9/outputfile.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Διαβάζει τους αριθμούς από ένα αρχείο
    public static int[] readNumbersFromFile(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return br.lines()
                    .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

    // Δημιουργεί όλους τους συνδυασμούς k αριθμών από έναν πίνακα
    public static List<int[]> generateCombinations(int[] numbers, int k) {
        List<int[]> combinations = new ArrayList<>();
        generateCombinations(numbers, k, 0, new int[k], 0, combinations);
        return combinations;
    }

    private static void generateCombinations(int[] numbers, int k, int start, int[] combination, int index, List<int[]> combinations) {
        if (index == k) {
            combinations.add(combination.clone());
            return;
        }
        for (int i = start; i <= numbers.length - (k - index); i++) {
            combination[index] = numbers[i];
            generateCombinations(numbers, k, i + 1, combination, index + 1, combinations);
        }
    }

    // Ελέγχει αν μια εξάδα πληροί τα κριτήρια
    public static boolean isValidCombination(int[] combination) {
        return !isTooManyEven(combination) &&
                !isTooManyOdd(combination) &&
                !isTooManyContiguous(combination) &&
                !isTooManySameEnding(combination) &&
                !isTooManySameTen(combination);
    }

    // Ελέγχει αν η εξάδα έχει περισσότερους από 4 άρτιους αριθμούς
    private static boolean isTooManyEven(int[] combination) {
        long evenCount = Arrays.stream(combination).filter(n -> n % 2 == 0).count();
        return evenCount > 4;
    }

    // Ελέγχει αν η εξάδα έχει περισσότερους από 4 περιττούς αριθμούς
    private static boolean isTooManyOdd(int[] combination) {
        long oddCount = Arrays.stream(combination).filter(n -> n % 2 != 0).count();
        return oddCount > 4;
    }

    // Ελέγχει αν η εξάδα έχει περισσότερους από 2 συνεχόμενους αριθμούς
    private static boolean isTooManyContiguous(int[] combination) {
        for (int i = 1; i < combination.length; i++) {
            if (combination[i] - combination[i - 1] == 1) {
                return true;
            }
        }
        return false;
    }

    // Ελέγχει αν η εξάδα έχει περισσότερους από 3 αριθμούς με την ίδια τελευταία ψηφία
    private static boolean isTooManySameEnding(int[] combination) {
        Map<Integer, Long> endingCount = Arrays.stream(combination)
                .map(n -> n % 10)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return endingCount.values().stream().anyMatch(count -> count > 3);
    }

    // Ελέγχει αν η εξάδα έχει περισσότερους από 3 αριθμούς στην ίδια δεκάδα
    private static boolean isTooManySameTen(int[] combination) {
        Map<Integer, Long> tenCount = Arrays.stream(combination)
                .map(n -> n / 10)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        return tenCount.values().stream().anyMatch(count -> count > 3);
    }

    // Αποθηκεύει τις έγκυρες εξάδες σε αρχείο
    public static void writeCombinationsToFile(List<int[]> combinations, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int[] combination : combinations) {
                String line = Arrays.stream(combination)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(" "));
                bw.write(line + System.lineSeparator());
            }
        }
    }
}
