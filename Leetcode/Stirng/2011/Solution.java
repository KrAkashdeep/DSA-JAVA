import java.util.Scanner;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("--x") || operations[i].equals("x--")) {
                x = x - 1;
            }

            if (operations[i].equals("++x") || operations[i].equals("x++")) {
                x = x + 1;
            }

        }
        return x;

    }

    public static void main(String[] arg) {
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a[] = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        System.out.println(s.finalValueAfterOperations(a));
    }
}