
import java.util.Scanner;
import java.util.Arrays;

public class Flower {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p[] = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();

        }
        int a = p[0];
        Arrays.sort(p);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] >= a && p[i] <= a + 4)
                continue;
            a = p[i];
            c++;

        }
        System.out.println(c);
    }

}