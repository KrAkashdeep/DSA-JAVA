/*
 * 
 * 
 * ------->>>>>>>* * * * *
 * ------->>>>>>>* * * * *
 * ------->>>>>>>* * * * *
 * ------->>>>>>>* * * * *
 * ------->>>>>>>* * * * *
 * 
 * 
 * 
 */

import java.util.Scanner;

public class solution1 {
    public static void nForest(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] atg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nForest(n);
        sc.close();

    }

}
