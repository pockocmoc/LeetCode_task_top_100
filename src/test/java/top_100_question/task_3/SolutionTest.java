package top_100_question.task_3;

import org.junit.jupiter.api.Assertions;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void lengthTestOne() {
        Assertions.assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
    }
    @org.junit.jupiter.api.Test
    void lengthTestTwo() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
    }
    @org.junit.jupiter.api.Test
    void lengthTestThree() {
        Assertions.assertEquals(3, Solution.lengthOfLongestSubstring("pwwkew"));
    }
}