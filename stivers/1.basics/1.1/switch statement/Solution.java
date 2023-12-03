import java.util.Scanner;

public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i != ch)
            a[i] = sc.nextInt();
        i++;

        if (ch == 1) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double a[] = new double[ch];
        System.out.println(areaSwitchCase(ch, a));

    }
}