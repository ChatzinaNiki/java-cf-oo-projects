package gr.aueb.cf.ch13.bankapp.model;

/**
 * Η κλάση JointAccount αναπαριστά έναν λογαριασμό με δύο κατόχους.
 */
public class JointAccount {
    private String owner1;
    private String owner2;
    private double balance;

    /**
     * Δημιουργεί έναν κοινό λογαριασμό με δύο κατόχους και αρχικό υπόλοιπο.
     *
     * @param owner1 το όνομα του πρώτου κατόχου
     * @param owner2 το όνομα του δεύτερου κατόχου
     * @param balance το αρχικό υπόλοιπο του λογαριασμού
     */
    public JointAccount(String owner1, String owner2, double balance) {
        this.owner1 = owner1;
        this.owner2 = owner2;
        this.balance = balance;
    }

    /**
     * Κατάθεση χρημάτων στον κοινό λογαριασμό.
     *
     * @param amount το ποσό κατάθεσης
     */
    public void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Ανάληψη χρημάτων από τον κοινό λογαριασμό.
     *
     * @param amount το ποσό ανάληψης
     * @return true αν η ανάληψη πραγματοποιήθηκε, αλλιώς false
     */
    public boolean withdraw(double amount) {
        if (amount <= balance) {
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
     * Επιστρέφει τα ονόματα των δύο κατόχων του λογαριασμού.
     *
     * @return τα ονόματα των κατόχων
     */
    public String getOwners() {
        return "Owner 1: " + owner1 + ", Owner 2: " + owner2;
    }
}
