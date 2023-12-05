import java.util.Scanner;

public class Solution {
    public static boolean palindromeNumber(int n) {
        // TO REVERSE THE NUMBER LOGIC IS SAME

        int a = n;
        int b = 0;
        while (n != 0) {
            int c = n % 10;
            b = b * 10 + c;
            n = n / 10;
        }
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindromeNumber(n));
    }
}