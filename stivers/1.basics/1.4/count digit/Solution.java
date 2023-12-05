import java.util.Scanner;

public class Solution {
    public static int countDigits(int n) {
        int num = n;
        int count = 0;
        while (n > 0) {
            int a = n % 10;
            if (a == 0) {
                n = n / 10;
            } else {
                if (num % a == 0) {
                    count++;
                    n = n / 10;
                } else {
                    n = n / 10;
                }
            }
        }
        return count;
        // Write your code here.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
}