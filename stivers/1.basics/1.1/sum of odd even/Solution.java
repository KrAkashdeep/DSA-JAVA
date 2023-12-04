import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0, even = 0;
        while (n > 0) {
            int b = n % 10;
            if (b % 2 == 0) {
                even = even + b;
            } else {
                odd = odd + b;
            }
            n = n / 10;
        }
        System.out.println(even + " " + odd);

    }

}
