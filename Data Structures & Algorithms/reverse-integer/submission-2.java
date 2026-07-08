public class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            res = (res * 10) + digit;

            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }

        return (int) res;
    }
}