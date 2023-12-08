public class Solution {
    public static void alphaTriangle(int n) {

        for (int i = n; i > 0; i--) {
            char c = (char) (64 + n);
            for (int j = i; j <= n; j++) {
                System.out.print(c + " ");
                c--;
            }
            System.out.println();
        }
    }
}