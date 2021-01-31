package com.javaclasez.banking.simple.main;

import com.javaclasez.banking.simple.accounts.Account;
import com.javaclasez.banking.simple.accounts.Account3Percent;
import com.javaclasez.banking.simple.accounts.Account5Percent;

import java.util.Scanner;

public class SimpleBankingApp {
    // static Account account = new Account(100, 3);
    static Account account = new Account5Percent();

    public static void main(String[] args) {
        // account.setCurrentBalance(100);
        char choice = '\0';
        int selectedChoice = -1;
        SimpleBankingApp app = new SimpleBankingApp();

        // Start a loop and accept inputs from the user
        while(selectedChoice != 'x') {
            // Display the menu
            app.displayMenu();

            // Accept a choice from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\nPlease select an option: ");
            selectedChoice = scanner.next().charAt(0);


            if(selectedChoice == 'a') {
                long depositAmount = app.getUserInputAmount("Please enter the amount to deposit: ", scanner);
                account.makeDeposit(depositAmount);
                System.out.println("You deposited " + depositAmount);
            } else if (selectedChoice == 'b') {
                long withdrawAmount = app.getUserInputAmount("Please enter the amount to withdraw: ", scanner);
                account.makeWithdrawal(withdrawAmount);
                System.out.println("You withdrew " + withdrawAmount + " your balance now is " + account.getCurrentBalance());
            } else if (selectedChoice == 'c') {
                System.out.println("Your balance is " + account.getCurrentBalance());
            } else if (selectedChoice == 'd') {
                System.out.println("Your rate of interest is " + account.getRateOfInterest());
            } else if (selectedChoice == 'e') {
                long years = app.getUserInputAmount("How many years do you want to calculate the interest for?", scanner);
                System.out.println("You will have " + account.getInterest(years));
            } else if (selectedChoice == 'x') {
                System.out.println("Bye!");
            } else {
                System.err.println("Invalid choice entered. Please try again.");
            }

            System.out.println("==================================");
        }

    }

    /**
     * Method to get input from user
     * @param prompt
     * @param scanner
     * @return
     */
    private long getUserInputAmount(String prompt, Scanner scanner) {
        System.out.println(prompt);
//        long amount = scanner.nextLong();
//        return amount;
        return scanner.nextLong();
    }

    /**
     * Method to display a menu to the user
     */
    public void displayMenu() {
        System.out.println("a. Make a Deposit");
        System.out.println("b. Make a Withdrawal");
        System.out.println("c. Check balance");
        System.out.println("d. Check the interest rate");
        System.out.println("e. Calculate interest for your balance");
        System.out.println("x. Exit");
    }
}
