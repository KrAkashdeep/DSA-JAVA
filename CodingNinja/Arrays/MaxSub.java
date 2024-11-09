import java.util.*;
import java.io.*;

public class MaxSub {

    public static long maxSubarraySum(int[] arr, int n) {
        long sum = 0;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum < 0) {
                sum = 0;
            }
            if (max < sum) {
                max = sum;

            }

        }
        return max;
    }

}
