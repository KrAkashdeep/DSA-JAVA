class Solution {
    public static int search(int[] n, int target) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int b[] = { 1, 4, 6, 12, 66, 2 };
        System.out.println(search(b, 2));
    }
}