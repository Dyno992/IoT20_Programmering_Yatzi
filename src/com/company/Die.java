package com.company;

class Die extends com.company.BoardGameMaterial {
    int value;
    static Die[] dice;

    private Die() {
        value = (int) Math.random();
    }

    void dieRoll() {
        value = (int) (Math.random() * 6 + 1);
    }

    static void createDice() {
        dice = new Die[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Die();
        }
    }
}
