import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1, b = 1;
        int res = 0;
        if (n == 1)
            res = 1;
        for (int i = 1; i < n - 1; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        System.out.println(res);
        sc.close();
    }

}
