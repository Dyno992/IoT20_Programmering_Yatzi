package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YahtzeeTest {
    @Test
    void isYahtzeeWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        YahtzeeMain.fillDiceWithNumbers(dice);
        for (Die die : dice) {
            die.value = 5;
        }
        assertTrue(YahtzeeMain.checkIfYahtzee(dice));

    }

    @Test
    void isNotYahtzeeWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        YahtzeeMain.fillDiceWithNumbers(dice);
        for (Die die : dice) {
            die.value = 5;
        }
        dice[1].value = 1;
        assertFalse(YahtzeeMain.checkIfYahtzee(dice));
    }
}
