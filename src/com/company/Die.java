package com.company;

class Die extends com.company.BoardGameMaterial {

    int value;
    static Die[] die;
    private Die() {
        value = (int) Math.random();
    }

    void DieRoll() {
        value = (int)(Math.random()*6+1);
    }

    String getString() {
        return "Dice shows " + value;
    }

    static void CreateDice() {
      die = new Die[5];
      for (int i = 0; i < 5; i++) {
         die[i] = new Die();
      }
   }
}
