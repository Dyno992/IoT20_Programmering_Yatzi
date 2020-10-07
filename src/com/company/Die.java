package com.company;

public class Die extends com.company.BoardGameMaterial {
    public int value = 0;

    public static Die[] die;

    public Die() {
        value = (int) Math.random();
    }

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;
    }

    public int DieReroll() {
        return DieRoll();
    }

    public String getString() {
        return "Dice shows " + value;
    }

   public static void CreateDice() {

        die = new Die[5];

        for (int i = 0; i < 5; i++) {
            die[i] = new Die();
        }


       return;
   }

}
