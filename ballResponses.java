// Author: Nicholas Bleeker
// Created: July 16, 2025
// Description: Magic 8 Ball Response List

import java.util.Random;
public class ballResponses {
    private String[] responses = {  // [0 - 9]: Yes    [10 - 14]: Mid   [15 - 19]: No
            "It is certain.", "It is decidedly so.", "Without a doubt.", "Yes - definitely.", "You may rely on it.",
            "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "Ask again later.",
            "Cannot predict now.", "Concentrate and ask again.", "Better not tell you now.", "Reply hazy, try again.",
            "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."
    };

    private Random random = new Random();

    public String getRandomRespponse() {
        int index = random.nextInt(responses.length);
        return responses[index];
    }
}