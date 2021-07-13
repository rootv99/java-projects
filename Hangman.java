package com.pyramid_academy;

import java.util.Scanner;

public class Hangman {
    private static String[] words = {"java", "html", "css", "csharp", "javascript", "android", "windows", "linux"};
    private static String word = words[(int) (Math.random() * words.length)];
    private static String blanks = new String(new char[word.length()]).replace("\0", "_");
    private static String letters = "";
    private static int count = 0;

    public static void game() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n" + "HANGMAN");
        while (count < 7 && blanks.contains("_")) {
            if (count == 0) {
                System.out.println("    +---+");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("=====");
            }
            System.out.println("Missed letters: " + letters);
            System.out.println(blanks);
            System.out.println("Guess a letter:");
            String guess = input.next();
            hang(guess);
        }
    }

    public static void hang(String guess) {
        String newblank = "";

        if (!blanks.contains(guess) && !letters.contains(guess)) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newblank += guess.charAt(0);
                } else if (blanks.charAt(i) != '_') {
                    newblank += word.charAt(i);
                } else {
                    newblank += "_";
                }
            }

            if (blanks.equals(newblank)) {
                letters += guess.charAt(0);
                count++;
                hangmanImage();
            } else {
                blanks = newblank;
                hangmanImage();
            }
            if (blanks.equals(word)) {
                System.out.println("You have won! The secret word is \"" + word + "\"! ");
            }
        } else {
            System.out.println("You have already guessed that letter. Choose again.");
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("    +---+");
            System.out.println("    |   O");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("=====");
        }
        if (count == 2) {
            System.out.println("    +---+");
            System.out.println("    |   O");
            System.out.println("    |   |");
            System.out.println("    |");
            System.out.println("=====");
        }
        if (count == 3) {
            System.out.println("    +---+");
            System.out.println("    |   O");
            System.out.println("    |   |");
            System.out.println("    |   |");
            System.out.println("=====");
        }
        if (count == 4) {
            System.out.println("    +---+");
            System.out.println("    |   O");
            System.out.println("    |   |");
            System.out.println("    |   |");
            System.out.println("=====  / ");
        }
        if (count == 5) {
            System.out.println("    +---+");
            System.out.println("    |   O");
            System.out.println("    |   |");
            System.out.println("    |   |");
            System.out.println("=====  / \\");
        }
        if (count == 6) {
            System.out.println("    +---+");
            System.out.println("    |   O");
            System.out.println("    |  /|");
            System.out.println("    |   |");
            System.out.println("=====  / \\");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("    +---+");
            System.out.println("    |   O");
            System.out.println("    |  /|\\");
            System.out.println("    |   |");
            System.out.println("=====  / \\");
            System.out.println("Game Over! The word was \"" + word + "\"");
        }
    }
}
