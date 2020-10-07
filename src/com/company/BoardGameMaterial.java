package com.company;

import java.util.Scanner;
import static com.company.Die.*;
class BoardGameMaterial {

    private static int turn = 0;
    private static boolean GameOn() {
        System.out.println("Welcome to Yatzi!");
        return true;
    }

    static void StartGame() {
        CreateDice();
        while (GameOn()) {
            while (turn < 3) {
                System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
                for (int i = 0; i < die.length; i++) {
                    die[i].DieRoll();
//                    die[i].value = 5; //Test if yatzi work
                    System.out.println(i + ": " + die[i].getString());
                }
                CheckIfYatzi();
            }
        }
    }

    private static void CheckIfYatzi() {

        boolean yatzi = true;
        for (int j = 1; j < 5; j++) {
            if (die[j].value != die[j - 1].value) {
                //Set flag to false
                yatzi = false;
                break;
            }
        }
        if (yatzi) {

            System.out.println("You got YATZI! in " + die[0].value + "'s");
            System.out.println("Program Ending...");
            System.exit(0);
        } else {
            NotYatzi();
        }
    }

    private static void NotYatzi() {

        //Here we check if there is no Yatzy: then we check what turn we are on and asks the player if we want to continue or not
        if (turn != 2) {
            System.out.println("Want to throw again? (y for yes, anything else for no)");
            Scanner sc = new Scanner(System.in);
            if (sc.next().equals("y")) {
                ++turn;
            } else {
                System.out.println("Program Ending...");
                System.exit(0);

            }
        } else {
            GameOver();
        }
    }

    private static void GameOver() {
        System.out.println("Game over! Want to play again?");
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("y")) {
            turn = 0;
        } else {
            System.out.println("Program Ending...");
            System.exit(0);
        }
    }
}