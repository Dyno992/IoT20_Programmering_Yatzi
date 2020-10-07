package com.company;

class Die extends com.company.BoardGameMaterial {
    int value;
    static Die[] dice;

    private Die() {
        value = (int) Math.random();
    }

    void DieRoll() {
        value = (int) (Math.random() * 6 + 1);
    }

    static void CreateDice() {
        dice = new Die[5];
        for (int i = 0; i < 5; i++) {
            dice[i] = new Die();
        }
    }
}
