package top_100_question.task_7;
/*/Given a signed 32-bit integer x, return x with its digits reversed.
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 */
class Solution7 {
    public int reverse(int x) {
        int rev = 0;

        while(x > 0 || x < 0){

            int temp = rev*10 + x % 10;

            x = x/10;

            if(temp/10 != rev) return 0;

            rev = temp;
        }

        return rev;
    }
}