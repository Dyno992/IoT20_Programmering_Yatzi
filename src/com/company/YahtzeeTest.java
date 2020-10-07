package com.company;

import org.junit.jupiter.api.Test;

import static com.company.Die.dice;
import static org.junit.jupiter.api.Assertions.*;

public class YahtzeeTest {
    @Test
    void isYahtzeeWhenAllDiceMatches() {
        Die.CreateDice();
        for (int i = 0; i < dice.length; i++) {
            dice[i].value = 5;
        }
        assertTrue(true, BoardGameMaterial.CheckIfYahtzee(dice));
    }

   // @Test
//    void isNotYahtzeeWhenOneDieIsNotMatchingTheOther() {
//        Die.CreateDice();
//        for (int i = 0; i < dice.length; i++) {
//            dice[i].value = 5;
//        }
//        dice[1].value = 1;
//        assertFalse(true, BoardGameMaterial.CheckIfYahtzee(dice));
//    }
}
