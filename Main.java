// Author: Nicholas Bleeker
// Created: July 16, 2025
// Description: Magic 8 Ball Main Program

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        user user = new user();
        magic8Ball magic8Ball = new magic8Ball(user);

        int option = 0;
        while (option != 3) {
            System.out.println("\n===== Magic 8 Ball =====");
            System.out.println("1. " + (user.isNameSet() ? "Change Name" : "Set Name"));
            System.out.println("2. Ask a Question");
            System.out.println("3. Exit Program");
            System.out.println((user.isNameSet() ? "Choose an option (1-3)" : "Set Name Before Asking a Question."));

            try {
                option = Integer.parseInt(kb.nextLine());   // Takes a String and converts it to an int

                switch (option) {
                    case 1:
                        System.out.print("Enter your name: ");
                        String name = kb.nextLine().trim();
                        user.setName(name);
                        System.out.print("Name set to: " + user.getName() + "\n");
                        break;
                    case 2:
                        if (! user.isNameSet()) {
                            System.out.print("Error! Please set your name before asking a question.");
                        } else {
                            magic8Ball.askQuestion();
                        }
                        break;
                    case 3:
                        System.out.println("Exiting Magic 8 Ball...");
                        break;
                    default:
                        System.out.println("Error! Please enter a valid option (1-3).");
                }
            } catch (NumberFormatException e) { // Thrown when the user enters a non-numeric string (ex. abc)
                System.out.println("Error! Please enter a valid option (1-3).");
            }
        }
    }
}
