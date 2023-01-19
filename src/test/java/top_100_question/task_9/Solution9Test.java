package top_100_question.task_9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {

    @Test
    void isPalindromeOne() {
        var solution = new Solution9();
        Assertions.assertEquals(true,solution.isPalindrome(121));
    }
    @Test
    void isPalindromeTwo() {
        var solution = new Solution9();
        Assertions.assertEquals(false,solution.isPalindrome(-121));
    }
    @Test
    void isPalindromeThree() {
        var solution = new Solution9();
        Assertions.assertEquals(false,solution.isPalindrome(10));
    }
}