import java.util.Scanner;

public class Solution {
    public static int calcGCD(int a, int b) {
        // Write your code here.
        int i;
        if (a < b)
            i = a;
        else
            i = b;

        for (i = i; i > 1; i--) {

            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calcGCD(a, b));
    }
}

// there shoud be better solution
// in time and space complexity