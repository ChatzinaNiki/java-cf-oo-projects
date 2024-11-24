package gr.aueb.cf.ch13.bankapp;

import gr.aueb.cf.ch13.bankapp.model.OverdraftAccount;
import gr.aueb.cf.ch13.bankapp.model.JointAccount;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία ενός OverdraftAccount με όριο υπερανάληψης 500
        OverdraftAccount overdraftAccount = new OverdraftAccount(1000, 500);
        overdraftAccount.deposit(200);
        System.out.println("Balance after deposit: " + overdraftAccount.getBalance());

        // Ανάληψη ποσού 1200, που ξεπερνά το υπόλοιπο αλλά είναι εντός του ορίου υπερανάληψης
        if (overdraftAccount.withdraw(1200)) {
            System.out.println("Withdrawal successful! New balance: " + overdraftAccount.getBalance());
        } else {
            System.out.println("Withdrawal failed!");
        }

        // Δημιουργία ενός JointAccount με δύο κατόχους
        JointAccount jointAccount = new JointAccount("Niki", "Anna", 1500);
        jointAccount.deposit(500);
        System.out.println("Balance after deposit: " + jointAccount.getBalance());
        System.out.println(jointAccount.getOwners());
    }
}
