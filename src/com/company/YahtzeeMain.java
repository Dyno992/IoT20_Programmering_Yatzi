package com.company;

import static com.company.Die.*;

public class YahtzeeMain {
   // private static int turn;
//    private static void startGame() {
//        boolean game = true;
//        createDice();
//        while (game && turn < 3) {
//            System.out.println("Starting turn " + (turn + 1) + " of 3, rolling dice.");
//            for (int i = 0; i < dice.length; i++) {
//                dice[i].roll();
//                //dice[i].value = 5; //Test if yatzi work
//                System.out.println(i + ": " + "Dice Shows " + dice[i].value);
//            }
//            game = false;
//        }
//    }

    public static void main(String[] args) {
        System.out.println("Welcome to Yahtzee!");
        while(true) {
            startGame();
            if (checkIfYahtzee(dice)) {
                System.out.println("You got YAHTZEE! in " + dice[0].value + "'s");
                System.out.println("\n Program Ending...");
                System.exit(0);
            } else {
                nextRound();
                nextRound();
            }
            gameOver();
        }
    }
}