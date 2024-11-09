import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        // Write your code here.
        int a = x;
        int b = 0;

        while (a != 0) {
            int c = a % 10;
            b = b * 10 + c;
            a = a / 10;
        }
        if (x > Math.pow(2, 31) || x <= Math.pow(-2, 31)) {
            return 0;
        }

        return b;
    }

    public static void main(String[] arg) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(s.reverse(n));

    }
}

/*
 * its not working for 64 bit
 * we have to stop if it cross 2 power 31 in positve and negative
 */\1534236469