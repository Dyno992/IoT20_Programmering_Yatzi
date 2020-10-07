package com.company;


import java.util.Scanner;

import static com.company.Die.die;

public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */
    private static int turn = 0;


    public static boolean GameOn() {
        System.out.println("Welcome to Yatzi!");
        return true;
    }

    public static int StartGame() {

        while (turn < 3) {
            System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
            for (int i = 0; i < die.length; i++) {
                die[i].DieRoll();
                //ds[i].value = 5; //Test if yatzi work
                System.out.println(i + ": " + die[i].getString());
            }
            CheckIfYatzi();
        }
        return turn;
    }

    public static void CheckIfYatzi() {

        boolean yatzi = true;
        for (int j = 1; j < 5; j++) {
            if (die[j].value != die[j - 1].value) {
                //Set flag to false
                yatzi = false;
            }
        }
        if (yatzi) {
            System.out.println("You got YATZI! in " + die[0].value + "'s");

        } else {
            //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
            if (turn != 2) {
                System.out.println("Want to throw again? (y for yes, anything else for no)");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    ++turn;
                } else {
                    System.exit(0);
                }
            } else {
                System.out.println("Game over! Want to play again?");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equals("y")) {
                    turn = 0;
                } else {
                    System.exit(0);
                }
            }
        }
    }
}