public class Solution {
    public static int count(int arr[], int n, int x) {
        // Your code goes here
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                a++;
            }
        }
        return a;
    }
}

// PARTIALLY ACCEPTED