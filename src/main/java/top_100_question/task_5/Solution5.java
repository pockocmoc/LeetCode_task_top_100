package top_100_question.task_5;

class Solution5 {
    public static String longestPalindrome(String s) {

        if (s == null || "".equals(s)) {
            return s;
        }

        int len = s.length();

        String ans = "";
        int max = 0;

        boolean[][] dp = new boolean[len][len];

        for (int i = 0; i < len; i++) {

            for (int j = 0; j <= i; j++) {

                boolean judge = s.charAt(j) == s.charAt(i);

                dp[j][i] = i - j > 2 ? dp[j + 1][i - 1] && judge : judge;

                if (dp[j][i] && i - j + 1 > max) {
                    max = i - j + 1;
                    ans = s.substring(j, i + 1);
                }
            }
        }
        return ans;
    }
}