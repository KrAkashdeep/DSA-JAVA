//concatination of array 

import java.util.Scanner;

public class q1929 {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2 * nums.length];
        int a = 0;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                ans[a] = nums[j];
                a++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        q1929 s = new q1929();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements number");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter the elements item");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print(s.getConcatenation(nums));
        sc.close();
    }
}

/*
 * --MY SOLUTION on LEETCODE-- *
 * 
 * 
 * 
 * 
 * class Solution {
 * public int[] getConcatenation(int[] nums) {
 * int ans[]=new int[2*nums.length];
 * int a=0;
 * for(int i=0;i<2;i++){
 * for(int j=0;j<nums.length;j++){
 * ans[a]=nums[j];
 * a++;
 * }
 * }
 * return ans;
 * 
 * }
 * public static void main (String []args){
 * Solution s=new Solution();
 * Scanner sc=new Scanner(System.in);
 * int n=sc.nextInt();
 * int nums[]=new int[n];
 * for(int i=0;i<n;i++){
 * nums[i]=sc.nextInt();
 * }
 * System.out.print(s.getConcatenation(nums));
 * }
 * }
 */