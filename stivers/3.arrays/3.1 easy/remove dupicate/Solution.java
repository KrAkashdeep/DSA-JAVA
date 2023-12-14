import java.util.ArrayList;

public class Solution {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {

        int a = arr.get(0);
        for (int i = 1; i < arr.size();) {
            if (a == arr.get(i)) {
                arr.remove(i);
            } else {
                a = arr.get(i);
                i++;
            }

        }
        return arr.size();
    }
}