public class Solution {
    public static int findKRotation(int[] arr) {
        // Write your code here.
        int a = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < a) {
                a = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }

        }
        return 0;

    }
}