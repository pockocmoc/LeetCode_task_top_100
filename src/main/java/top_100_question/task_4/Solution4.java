package top_100_question.task_4;

public class Solution4 {


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int[] result = new int[nums1.length + nums2.length];
        int i = 0, j = 0, r = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                result[r] = nums1[i];
                i++;
            } else {
                result[r] = nums2[j];
                j++;
            }
            r++;
        }
        if (i < nums1.length) {
            System.arraycopy(nums1, i, result, r, (nums1.length - i));
        }
        if (j < nums2.length) {
            System.arraycopy(nums2, j, result, r, (nums2.length - j));
        }
        if (result.length % 2 == 0)
            median = ((double) result[result.length / 2] + (double) result[result.length / 2 - 1]) / 2;
        else
            median = result[result.length / 2];
        return median;
    }
}