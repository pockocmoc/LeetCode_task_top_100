package top_100_question.task_9;

/*
/Given an integer x, return true if x is a
palindrome
, and false otherwise.
 */
public class Solution9 {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String str = new StringBuilder(s).reverse().toString();
        boolean result;

        result = s.equals(str);
        return result;
    }
}