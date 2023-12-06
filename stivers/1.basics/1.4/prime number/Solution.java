import java.util.Scanner;

public class Solution {
    public static String isPrime(int n) {
        // Your code goes here
        if (n <= 1) {
            return "NO";
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

}