package com.company;

import static com.company.Die.*;

public class YahtzeeMain {

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