package com.pyramid_academy;

import java.util.Scanner;

public class GuessTheNumber {
    private static String name = "";
    private static int number = 0;

    public static void guessNums() {
        Scanner input = new Scanner(System.in);

        System.out.println("GUESS THE NUMBER");

        System.out.println("Hello! What is your name?");
        name = input.next();

        System.out.println("Well, " + name + ", I'm thinking of a number between 1 and 20.");
        guess(input);

        String play = "";
        do {
            System.out.println("Would you like to play again?(y or n)");
            play = input.next();
            if(play == "y")
                guess(input);
        } while(play == "y");
    }

    private static void guess(Scanner input) {
        int count = 0;
        int guess = (int) (Math.random() * 20);

        do {
            System.out.println("Take a guess.");
            number = input.nextInt();
            ++count;

            if(number<guess)
                System.out.println("Your guess is too low");
            else if(number>guess)
                System.out.println("Your guess is too high");
            else {
                System.out.println("Good job, " + name + "! You guessed my number in " + count + " guesses!");
            }
        } while (number != guess);
    }
}
