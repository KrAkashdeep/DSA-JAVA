
class Solution {
    public int firstMissingPositive(int[] nums) {
        int a = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == a) {
                a++;

            }
        }
        if (a == nums.length && a == nums[a - 1])
            return a + 1;
        return a;

    }
}