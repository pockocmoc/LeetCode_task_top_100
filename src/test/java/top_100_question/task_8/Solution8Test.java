package top_100_question.task_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    @Test
    void myAtoiOne() {
        var solution = new Solution8();
        Assertions.assertEquals(42, solution.myAtoi("42"));
    }
    @Test
    void myAtoiTwo() {
        var solution = new Solution8();
        Assertions.assertEquals(-42, solution.myAtoi("   -42"));
    }
    @Test
    void myAtoiThree() {
        var solution = new Solution8();
        Assertions.assertEquals(4193, solution.myAtoi("4193 with words"));
    }
}