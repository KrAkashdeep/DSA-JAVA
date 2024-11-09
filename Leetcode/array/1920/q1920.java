/*
 * without function 
 */

import java.util.Scanner;

public class q1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element");
        int n = sc.nextInt();
        int num[] = new int[n];
        int ans[] = new int[n];
        System.out.println("enter the element");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("print element of index of num array as values");
        for (int i = 0; i < n; i++) {
            ans[i] = num[num[i]];
            System.out.println(ans[i]);
        }

        sc.close();

    }
}

/*
 * with function
 */

/*
 *
 * 
 * import java.util.Scanner;
 * class Solution {
 * public int[] buildArray(int[] nums) {
 * int ans[]=new int[nums.length];
 * for (int i=0;i<nums.length;i++){
 * ans[i]=nums[nums[i]];
 * }
 * return ans;
 * 
 * }
 * public static void main(String args[]){
 * Solution s=new Solution();
 * Scanner sc=new Scanner(System.in);
 * int n=sc.nextInt();
 * int nums[]=new int[n];
 * for (int i=0;i<n;i++){
 * nums[i]=sc.nextInt();
 * }
 * System.out.println(s.buildArray(nums));
 * 
 * 
 * }
 * }
 */