public class Solution {
    // public static int[] getSecondOrderElements(int n, int []a) {
    // // Write your code here.
    // int b[]=new int[2];
    // int large=a[0];
    // int small=a[0];
    // int sLarge=0;
    // int sSmall=0;
    // for(int i=1;i<n;i++){
    // if(large<a[i]){
    // sLarge=large;
    // large=a[i];
    // }
    // if(small>a[i]){
    // sSmall=small;
    // small=a[i];
    // }
    // }
    // b[0]=sLarge;
    // b[1]=sSmall;
    // return b;
    // }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int n = 10;

        // Write your code here.
        int b[] = new int[2];
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int sLarge = Integer.MIN_VALUE;
        int sSmall = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (large < a[i]) {
                sLarge = large;
                large = a[i];
            } else if (a[i] > sLarge && a[i] < large) {
                sLarge = a[i];

            }
            if (small > a[i]) {
                sSmall = small;
                small = a[i];
            } else if (a[i] < sSmall && a[i] > small) {
                sSmall = a[i];
            }
        }
        b[0] = sLarge;
        b[1] = sSmall;

        for (int i = 0; i < 2; i++) {
            System.out.println(b[i]);
        }

    }
}