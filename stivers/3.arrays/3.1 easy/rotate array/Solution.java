import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        while (k != 0) {
            int a = arr.remove(0);

            arr.add(a);
            k--;
        }
        return arr;
    }
}