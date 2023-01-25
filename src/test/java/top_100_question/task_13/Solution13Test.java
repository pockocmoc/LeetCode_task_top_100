package top_100_question.task_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution13Test {

    @Test
    void romanToInt() {
        var sol = new Solution13();
        assertEquals(4, sol.romanToInt("IV"));
    }
}