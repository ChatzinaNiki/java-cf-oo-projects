package gr.aueb.cf.ch10.Project4;

import java.util.Scanner;

public class TicTacToe {
    // Δημιουργία πίνακα 3x3
    private static final char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    // Τρέχων παίκτης
    private static char currentPlayer = 'X';

    // Μέθοδος για εκτύπωση του πίνακα
    public static void printBoard() {
        System.out.println("  0   1   2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println(" ---+---+---");
        }
    }

    // Μέθοδος για εναλλαγή παικτών
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Έλεγχος αν υπάρχει νικητής
    public static boolean checkWinner() {
        // Έλεγχος γραμμών
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Έλεγχος στηλών
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Έλεγχος διαγωνίων
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
    }

    // Έλεγχος για ισοπαλία
    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Μέθοδος για να παίξει ο παίκτης
    public static void play(int row, int col) {
        board[row][col] = currentPlayer;
    }

    // Έλεγχος αν η κίνηση είναι έγκυρη
    public static boolean isValidMove(int row, int col) {
        return row >= 0 && row <= 2 && col >= 0 && col <= 2 && board[row][col] == ' ';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        boolean gameDraw = false;

        System.out.println("Καλώς ήρθατε στο παιχνίδι Τρίλιζα!");
        printBoard();

        // Εναλλαγή παικτών και ελέγχος για νίκη ή ισοπαλία
        while (!gameWon && !gameDraw) {
            System.out.println("Παίκτης " + currentPlayer + ", κάνε την κίνησή σου (γραμμή και στήλη): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Έλεγχος αν η κίνηση είναι έγκυρη
            while (!isValidMove(row, col)) {
                System.out.println("Λανθασμένη κίνηση, δοκιμάστε ξανά (γραμμή και στήλη): ");
                row = scanner.nextInt();
                col = scanner.nextInt();
            }

            // Πραγματοποίηση κίνησης
            play(row, col);
            printBoard();

            // Έλεγχος για νίκη
            gameWon = checkWinner();
            if (gameWon) {
                System.out.println("Ο παίκτης " + currentPlayer + " είναι ο νικητής!");
                break;
            }

            // Έλεγχος για ισοπαλία
            gameDraw = checkDraw();
            if (gameDraw) {
                System.out.println("Ισοπαλία! Το παιχνίδι τελείωσε χωρίς νικητή.");
                break;
            }

            // Εναλλαγή παίκτη
            switchPlayer();
        }

        scanner.close();
    }
}


/**
 * Περιγραφή Λειτουργίας:
 * Πίνακας: Ο πίνακας board είναι δυσδιάστατος και αρχικοποιείται με κενές τιμές (' ').
 * Εκτύπωση Πίνακα: Η μέθοδος printBoard() εμφανίζει τον πίνακα στην κονσόλα.
 * Εναλλαγή Παικτών: Η μέθοδος switchPlayer() αλλάζει τον ενεργό παίκτη μεταξύ 'X' και 'O'.
 * Έλεγχος Νίκης: Η μέθοδος checkWinner() ελέγχει αν υπάρχει νικητής κοιτώντας τις γραμμές, τις στήλες και τις διαγώνιες.
 * Έλεγχος Ισοπαλίας: Η μέθοδος checkDraw() ελέγχει αν υπάρχει ισοπαλία, δηλαδή αν ο πίνακας είναι γεμάτος χωρίς νικητή.
 * Παιχνίδι: Η play() τοποθετεί το σύμβολο του παίκτη στην επιλεγμένη θέση, αν είναι έγκυρη.
 * Κύρια Μέθοδος: Στη μέθοδο main(), εναλλάσσονται οι παίκτες, γίνονται οι κινήσεις τους και ελέγχεται αν κάποιος παίκτης νίκησε
 * ή αν το παιχνίδι κατέληξε σε ισοπαλία.
 * Χαρακτηριστικά:
 * Δεν επιτρέπει να τοποθετηθεί σύμβολο σε ήδη κατειλημμένη θέση.
 * Ελέγχει για νίκη μετά από κάθε κίνηση.
 * Ελέγχει για ισοπαλία αν ο πίνακας γεμίσει χωρίς νικητή.
 * Μετά από κάθε κίνηση, ο πίνακας επανεκτυπώνεται και το παιχνίδι συνεχίζεται μέχρι να υπάρξει νικητής ή ισοπαλία.
 */