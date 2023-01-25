package top_100_question.task_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12Test {

    @Test
    void intToRomanOne() {
        var sol = new Solution12();
        assertEquals("III", sol.intToRoman(3));
    }
    @Test
    void intToRomanTwo() {
        var sol = new Solution12();
        assertEquals("MCMXCIV", sol.intToRoman(1994));
    }
    @Test
    void intToRomanThree() {
        var sol = new Solution12();
        assertEquals("LVIII", sol.intToRoman(58));
    }
}