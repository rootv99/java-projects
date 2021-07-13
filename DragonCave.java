package com.pyramid_academy;

import java.util.Scanner;

public class DragonCave {
    public static void chooseTheCave() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n" +"DRAGON CAVE");
        System.out.println("You are in a land full of dragons." + "\n" +
                "In front of you, you see two caves." + "\n" +
                "In one cave, the dragon is friendly and will share his treasure with you." + "\n" +
                "The other dragon is greedy and hungry and will eat you on sight.");

        System.out.println("Which cave will you go into? (1 or 2)");
        int cave = input.nextInt();

        if(cave == 1) {
            System.out.println("You approach the cave..." + "\n" +
                    "It is dark and spooky..." + "\n" +
                    "A large dragon jumps out in front of you! He opens his jaws and..." + "\n" +
                    "Gobbles you down in one bite!" + "\n");
        }
        else
            System.out.println("Thank god! You are safe!" + "\n");
    }
}
