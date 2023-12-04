import java.util.Scanner;

public class Solution {
    public static double areaSwitchCase(int ch, double[] a) {
        // Write your code here
        double b = 1;

        switch (ch) {
            case 1:
                b = Math.PI * a[0] * a[0];
                break;
            case 2:
                b = a[0] * a[1];
                break;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        double a[] = new double[ch];
        if (ch == 1)
            System.out.println(areaSwitchCase(ch, a));
        if (ch == 2)
            System.out.println(areaSwitchCase(ch, a));
        sc.close();
    }
}