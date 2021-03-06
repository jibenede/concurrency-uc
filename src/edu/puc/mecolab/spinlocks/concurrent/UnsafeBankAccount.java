package edu.puc.mecolab.spinlocks.concurrent;

import edu.puc.mecolab.spinlocks.Account;

/**
 * Non thread-safe implementation of a bank account. Will fail miserably in concurrent scenarios.
 */
public class UnsafeBankAccount extends Account {
    private int mAmount;

    public UnsafeBankAccount(int amount) {
        mAmount = amount;
    }

    public void deposit(int amount) {
        mAmount += amount;
    }

    public void withdraw(int amount) {
        mAmount -= amount;
    }

    public int getAmount() {
        return mAmount;
    }
}
