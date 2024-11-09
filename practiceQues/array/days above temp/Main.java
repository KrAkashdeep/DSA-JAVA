//how many days above the temperature

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of days : ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the " + (i + 1) + " day temperature");
            ar[i] = sc.nextInt();
            sum += ar[i];
        }
        // System.out.println();
        double avg = sum / n;
        System.out.println("average is " + avg);
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (avg < ar[i])
                count++;
        }
        System.out.println(count + " days above the average temperature ");
        sc.close();
    }

}