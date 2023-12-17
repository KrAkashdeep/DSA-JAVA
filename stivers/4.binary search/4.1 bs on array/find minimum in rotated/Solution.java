public class Solution {
    public static int findMin(int[] arr) {
        // Write your code here.
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];

            }
        }
        return min;
    }
}