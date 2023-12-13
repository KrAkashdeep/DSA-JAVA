public class Solution {
    public static int search(int[] n, int target) {
        // Write your code here.
        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 6, 7, 8 };
        System.out.println(search(a, 2));
    }
}