public class Solution {
    public static int searchInsert(int[] arr, int m) {
        // Write your code here.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= m)
                return i;
        }
        return arr.length;
    }
}