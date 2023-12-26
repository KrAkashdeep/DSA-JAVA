import java.util.*;

public class Solution {
    public static boolean searchElement(int[][] m, int t) {
        // Write your code here.
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == t) {
                    return true;
                }
            }
        }
        return false;
    }
}