class Solution {
    public int maxArea(int[] height) {
        int a = height[0] * 0;
        int b = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {

                if (height[i] > height[j]) {
                    a = height[j] * (j - i);
                } else {
                    a = height[i] * (j - i);
                }
                if (a > b) {
                    b = a;
                }

            }
        }
        return b;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(a);
    }
}

// time limit exceed in leetcode