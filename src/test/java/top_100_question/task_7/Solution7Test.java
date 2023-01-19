package top_100_question.task_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

    @Test
    void reverseOne() {
        Solution7 solution7 = new Solution7();
        Assertions.assertEquals(321, solution7.reverse(123));
    }
    @Test
    void reverseTwo() {
        Solution7 solution7 = new Solution7();
        Assertions.assertEquals(-321, solution7.reverse(-123));
    }
    @Test
    void reverseThree() {
        Solution7 solution7 = new Solution7();
        Assertions.assertEquals(21, solution7.reverse(120));
    }
}