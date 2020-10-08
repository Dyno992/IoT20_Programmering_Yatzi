package com.company;

import java.util.Scanner;

import static com.company.Die.*;

class BoardGameMaterial {
    private static int turn;
    public static boolean yahtzee = true;
//    private static boolean GameOn() {
//        System.out.println("Welcome to Yatzi!");
//        return true;
//    }

    static void StartGame() {
        CreateDice();
        boolean isGameOn = true;
        while (isGameOn && turn < 3) {

            System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
            for (int i = 0; i < dice.length; i++) {
                dice[i].DieRoll();
                //dice[i].value = 5; //Test if yatzi work
                System.out.println(i + ": " + "Dice Shows " + dice[i].value);
            }
            CheckIfYahtzee(dice);
        }
    }

    static String CheckIfYahtzee(Die[] dice) {
        for (int j = 1; j < 5; j++) {
            if (dice[j].value != dice[j - 1].value) {
                yahtzee = false;
                break;
            }
        }
        if (yahtzee) {
            System.out.println("You got YAHTZEE! in " + dice[0].value + "'s");
            System.out.println("Program Ending...");
            System.exit(0);
        } else {
            NotYahtzee();
        }
        return null;
    }

    private static void NotYahtzee() {
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