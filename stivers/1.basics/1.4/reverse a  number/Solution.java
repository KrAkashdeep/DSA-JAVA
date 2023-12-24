
public class Solution {
    public static long reverseBits(long n) {
        // Write your code here
        long sum = 0;

        int pow = 31;

        while (n > 0) {

            int bit = (int) n % 2;

            if (bit == 1) {

                sum += Math.pow(2, pow);

            }

            pow--;

            n = n / 2;

        }

        return sum;

    }

}
