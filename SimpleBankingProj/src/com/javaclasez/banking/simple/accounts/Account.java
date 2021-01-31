package com.javaclasez.banking.simple.accounts;

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

    private long rateOfInterest = 2;

    public Account(long initialAmount) {
        this.currentBalance = initialAmount;
    }

    public Account() {

    }

    public Account(long intitalAmount, long rateOfInterest) {
        this.currentBalance = intitalAmount;
        this.rateOfInterest = rateOfInterest;
    }

    public long getRateOfInterest() {
        return this.rateOfInterest;
    }

    /**
     * Get the current balance for the account.
     * @return current balance
     */
    public long getCurrentBalance() {
        return this.currentBalance;
    }

    /**
     * Set the balance
     * @param amount
     */
    public void setCurrentBalance(long amount) {
        this.currentBalance = amount;
    }

    public void setRateOfInterest(long rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    /**
     * Make a deposit to the account
     * @param depositedAmount
     */
    public void makeDeposit(long depositedAmount) {
        if (depositedAmount < 0) {
            System.err.println("Please enter a positive amount to be deposited.");
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
            System.err.println("Cannot withdraw this amount (" + withdrawalAmount + ") as it exceeds the current balance (" + this.currentBalance + ")");
        } else {
            this.currentBalance = this.currentBalance - withdrawalAmount;
        }
    }

    public long getInterest(long numberOfYears) {
        long interest = rateOfInterest * numberOfYears;
        return interest;
    }
}
