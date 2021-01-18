package com.javaclasez.banking.simple;

import java.util.Scanner;

public class SimpleBankingApp {
    Account account = new Account();

    public static void main(String[] args) {
        char choice = '\0';
        SimpleBankingApp app = new SimpleBankingApp();

        // Start a loop and accept inputs from the user
        while(choice != 'x') {
            // Display the menu
            app.displayMenu();

            // Accept a choice from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n\nPlease select an option: ");
            int selectedChoice = scanner.next().charAt(0);

            if(selectedChoice == 'a') {
                System.out.println("Lets write the code for 'Deposit' here");
            } else if (selectedChoice == 'b') {
                System.out.println("Lets write the code for 'Withdrawal' here");
            } else if (selectedChoice == 'c') {
                System.out.println("Lets write the code for 'Check Balance' here");
            } else if (selectedChoice == 'x') {
                System.out.println("Lets write the code for 'Exit (end loop)' here??");
            } else {
                System.err.println("Invalid choice entered. Please try again.");
            }

            System.out.println("==================================");
        }

    }

    /**
     * Method to display a menu to the user
     */
    public void displayMenu() {
        System.out.println("a. Make a Deposit");
        System.out.println("b. Make a Withdrawal");
        System.out.println("c. Check balance");
        System.out.println("x. Exit");
    }
}
