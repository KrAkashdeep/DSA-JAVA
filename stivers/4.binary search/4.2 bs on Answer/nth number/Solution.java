import java.lang.Math;

public class Solution {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int a = 0;
        double c = m;
        while (c > 1) {

            c = c / n;
            a++;

        }
        if (c != 1) {
            return -1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(NthRoot(9, 1953125));
    }
}
