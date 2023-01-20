package top_100_question.task_11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution11Test {

    @Test
    void maxAreaOne() {
        var solution = new Solution11();
        int[] arr = {1 , 8 , 6 , 2 , 5 , 4 , 8 , 3 , 7};
        Assertions.assertEquals(49, solution.maxArea(arr));
    }
    @Test
    void maxAreaTwo() {
        var solution = new Solution11();
        int[] arr = {1 , 1};
        Assertions.assertEquals(1, solution.maxArea(arr));
    }
    @Test
    void maxAreaThree() {
        var solution = new Solution11();
        int[] arr = {4 , 3 , 2 , 1 , 4};
        Assertions.assertEquals(16, solution.maxArea(arr));
    }
    @Test
    void maxAreaFour() {
        var solution = new Solution11();
        int[] arr = {1 , 2 , 1};
        Assertions.assertEquals(2, solution.maxArea(arr));
    }
}