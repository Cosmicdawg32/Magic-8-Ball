// Author: Nicholas Bleeker
// Created: July 16, 2025
// Description: Magic 8 Ball Methods

import java.util.Scanner;
public class magic8Ball {
    private ballResponses ballResponses;
    private user user;
    private Scanner kb;

    public magic8Ball(user user) {
        this.user = user;
        ballResponses = new ballResponses();
        kb = new Scanner(System.in);
    }

    public void askQuestion() {
        System.out.print("Ask the Magic 8 Ball a \"Yes\" or \"No\" question: ");
        String question = kb.nextLine();
        String response = ballResponses.getRandomRespponse();
        System.out.println(user.getName() + " asks: " + question);
        System.out.println("Magic 8 Ball says: " + response);
        System.out.println("Press \"Enter\" key to continue: ");
        String tmp = kb.nextLine();
    }
}