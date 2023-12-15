import java.util.ArrayList;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int a[] = new int[2];
        a[0] = arr.indexOf(k);
        a[1] = arr.lastIndexOf(k);
        return a;
    }

};

// PARTIALLY ACCEPTED