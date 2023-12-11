import java.util.*;
import java.io.*;

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int a = arr[0];
        for (int i = 1; i < n; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 2, 5, 3, 1, 8 };
        System.out.println(largestElement(a, 5));
    }
}