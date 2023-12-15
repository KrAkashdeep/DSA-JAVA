import java.util.ArrayList;

public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.

        return arr.indexOf(k);

    }
}

// partially accepted

// i wrote one more code also this also partially accepted

// // import java.util.ArrayList;
// public class Solution {
// public static int search(ArrayList<Integer> arr, int n, int k) {
// // Write your code here.

// for(int i=0;i<n;i++){
// if(arr.get(i)==k){
// return i;
// }
// }
// return -1;
// }
// }