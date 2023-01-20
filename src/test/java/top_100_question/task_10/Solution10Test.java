package top_100_question.task_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution10Test {

    @Test
    void isMatchOne() {
        var solution = new Solution10();
        Assertions.assertEquals(false, solution.isMatch("aa", "a"));
    }
    @Test
    void isMatchTwo() {
        var solution = new Solution10();
        Assertions.assertEquals(true, solution.isMatch("aa", "a*"));
    }
    @Test
    void isMatchThree() {
        var solution = new Solution10();
        Assertions.assertEquals(true, solution.isMatch("ab", ".*"));
    }
}