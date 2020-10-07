package com.company;


import static com.company.Die.die;

public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */

    public static boolean GameOn() {

        return true;
    }

    public static int Turns(int turn) {

        int iturn = 0;

        while (iturn < 3) {
            System.out.println("Starting turn " + (iturn + 1) + " of 3, rolling dice.");
            for (int i = 0; i < die.length; i++) {
                die[i].DieRoll();
                //ds[i].value = 5; //Test if yatzi work
                System.out.println(i + ": " + die[i].getString());
            }
        }
    }
}