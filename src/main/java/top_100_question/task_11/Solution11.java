package top_100_question.task_11;

/*/
You are given an integer array height of length n.
There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.
 */
public class Solution11 {
    public int maxArea(int[] height) {

//      //  Slow version
//        int result = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = 1; j < height.length; j++) {
//
//                int currentArea = Math.min(height[i], height[j]) * (j - i);
//                result = Math.max(result, currentArea);
//            }
//        }
//        return result;

        // fast version
        int result = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int currentArea = Math.min(height[i], height[j]) * (j - i);
            result = Math.max(result, currentArea);

            if (height[i] < height[j]) {
                i++;
            } else j--;


        }
        return result;

    }
}
