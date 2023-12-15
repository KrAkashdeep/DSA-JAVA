public class Solution {
    public static boolean searchInARotatedSortedArrayII(int[] a, int k) {
        // Write your code here.
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return true;
            }
        }
        return false;
    }
}