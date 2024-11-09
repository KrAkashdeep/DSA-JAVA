
/*
 * 2433. Find The Original Array of Prefix Xor
Medium

Companies
You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:

pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
Note that ^ denotes the bitwise-xor operation.

It can be proven that the answer is unique.
 */

import java.util.Scanner;

class q2433 {
    public int[] findArray(int[] pref) {
        int arr[] = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i - 1];
        }
        return arr;

    }

    public static void main(String[] args) {
        q2433 s = new q2433();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pref[] = new int[n];
        for (int i = 0; i < n; i++) {
            pref[i] = sc.nextInt();
        }
        System.out.println(s.findArray(pref));
        sc.close();
    }
}