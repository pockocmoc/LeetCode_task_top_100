package top_100_question.task_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    @Test
    void longestPalindrome() {
        Assertions.assertEquals("bab", Solution5.longestPalindrome("babad"));
    }
    @Test
    void longestPalindromeTestTwo() {
        Assertions.assertEquals("bb", Solution5.longestPalindrome("cbbd"));
    }
}