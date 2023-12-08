class Solution {
    public static int sumOfAllDivisors(int n) {
        // Write your code here.
        int x = 1;
        int y = 0;
        if (n == 1)
            return 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    x = x + j;
                }
                y = y + x;
                x = 0;
            }
        }
        return y;

    }

    public static void main(String[] args) {
        System.out.println(sumOfAllDivisors(5));
    }

}