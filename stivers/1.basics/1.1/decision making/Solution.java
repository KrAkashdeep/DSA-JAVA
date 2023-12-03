/*
 * two integer a and b
 * compare 
 * if a > b print greater 
 * if a < b print smaller
 * if a = b print equal
 */

import java.util.Scanner;

public class Solution {
    public static String compareIfElse(int a, int b) {
        if (a == b)
            return "equal";
        else if (a > b)
            return "greater";
        else
            return "smaller";
        // Write your code here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(compareIfElse(a, b));
        sc.close();
    }
}