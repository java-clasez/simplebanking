package com.javaclasez.banking.simple;

/**
 * Class to reperesent an 'Account'. Has methods for different operations.
 * @author Ashish
 * @version 0.1
 */
public class Account {

    /**
     * Variable to store the current balance
     */
    private long currentBalance;

    /**
     * Get the current balance for the account.
     * @return current balance
     */
    public long getCurrentBalance() {
        return this.currentBalance;
    }

    /**
     * Make a deposit to the account
     * @param depositedAmount
     */
    public void makeDeposit(long depositedAmount) {
        if (depositedAmount < 0) {
            System.out.println("Please enter a positive amount to be deposited.");
        } else {
            this.currentBalance = this.currentBalance + depositedAmount;
        }
    }

    /**
     * Make a withdrawal from the account
     * @param withdrawalAmount
     */
    public void makeWithdrawal(long withdrawalAmount) {
        if (withdrawalAmount > this.currentBalance) {
            System.out.println("Cannot withdraw this amount (" + withdrawalAmount + ") as it exceeds the current balance (" + this.currentBalance + ")");
        } else {
            this.currentBalance = this.currentBalance - withdrawalAmount;
        }
    }
}
