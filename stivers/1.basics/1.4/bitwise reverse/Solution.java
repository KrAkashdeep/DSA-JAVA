public class Solution {
    public static long reverseBits(long n) {
        // Write your code here
        int a[] = new int[35];
        int r[] = new int[35];
        long res = 0;
        int id = 1;
        while (n > 0) {
            a[id++] = (int) n % 2;
            n = n / 2;
        }
        int k = 0;
        for (int i = id; i >= 0; i--) {
            r[k++] = a[id];
        }
        while (id > 0) {
            for (int i = 0; i < id; i++) {

                res = res + (long) Math.pow(2, i);
            }
        }
        return res;
    }

    public static void main(String[] arg) {
        long a = 12;
        System.out.println(reverseBits(a));
    }
}
// code is not running

// question is-- convert the given number into the bitwise and get the value of
// that value