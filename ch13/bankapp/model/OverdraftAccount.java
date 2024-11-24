package gr.aueb.cf.ch13.bankapp.model;

/**
 * Η κλάση OverdraftAccount επιτρέπει την ανάληψη ποσών μεγαλύτερων από το υπόλοιπο του λογαριασμού,
 * χρησιμοποιώντας το όριο υπερανάληψης.
 */
public class OverdraftAccount {
    private double balance;
    private double overdraftLimit;

    /**
     * Δημιουργεί έναν νέο λογαριασμό με συγκεκριμένο υπόλοιπο και όριο υπερανάληψης.
     *
     * @param balance το αρχικό υπόλοιπο του λογαριασμού
     * @param overdraftLimit το όριο υπερανάληψης του λογαριασμού
     */
    public OverdraftAccount(double balance, double overdraftLimit) {
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Κατάθεση χρημάτων στον λογαριασμό.
     *
     * @param amount το ποσό κατάθεσης
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Ανάληψη χρημάτων από τον λογαριασμό. Εάν το ποσό υπερβαίνει το υπόλοιπο και το όριο υπερανάληψης,
     * επιτρέπεται η ανάληψη.
     *
     * @param amount το ποσό ανάληψης
     * @return true αν η ανάληψη πραγματοποιήθηκε, αλλιώς false
     */
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Επιστρέφει το υπόλοιπο του λογαριασμού.
     *
     * @return το υπόλοιπο του λογαριασμού
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Επιστρέφει το όριο υπερανάληψης του λογαριασμού.
     *
     * @return το όριο υπερανάληψης
     */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}
