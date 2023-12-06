import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int b = 0, count = 0;

        while (a != 0) {
            int c = a % 10;
            count++;
            a = a / 10;

        }
        a = n;
        while (a != 0) {
            int d = a % 10;
            b = b + (int) Math.pow(d, count);
            a = a / 10;

        }
        if (n == b) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }
    }
}
