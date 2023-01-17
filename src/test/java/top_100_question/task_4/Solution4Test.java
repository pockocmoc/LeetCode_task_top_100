package top_100_question.task_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    @Test
    void findMedianSortedArrays1() {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        Assertions.assertEquals(2.50000, Solution4.findMedianSortedArrays(num1, num2));
    }
    @Test
    void findMedianSortedArrays2() {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        Assertions.assertEquals(2.00000, Solution4.findMedianSortedArrays(num1, num2));
    }
}